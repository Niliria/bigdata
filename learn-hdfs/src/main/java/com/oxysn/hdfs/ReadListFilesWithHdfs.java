package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * 查看文件名称，权限，长度，块信息，
 */
public class ReadListFilesWithHdfs {
    public static void main(String[] args) throws Exception {
        //1,创建配置信息对象
        Configuration configuration = new Configuration();

        //2，创建文件管理对象
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");

        //3，读取HDFS /目录下所有文件 true表示递归循环读取其子目录下信息
        RemoteIterator<LocatedFileStatus> listFiles = fileSystem.listFiles(new Path("/"), true);
        while (listFiles.hasNext()) {

            LocatedFileStatus fileStatus = listFiles.next();

            //获取该路径文件的名称
            System.out.println("文件名称：" + fileStatus.getPath().getName());
            //获取该文件的长度，以字节为单位。
            System.out.println("文件的字节数：" + fileStatus.getLen());
            //获取文件的块大小
            System.out.println("文件的块大小：" + fileStatus.getBlockSize());
            //获取与该文件关联的许可信息
            System.out.println("文件的关联许可信息"+fileStatus.getPermission());

            //获取文件的块位置信息
            BlockLocation[] blockLocations = fileStatus.getBlockLocations();
            for (BlockLocation blockLocation : blockLocations) {
                //获取与此块关联的文件的起始偏移量
                System.out.println("block-offset: "+blockLocation.getOffset());
                //获取承载此块的主机(主机名)列表
                String[] hosts = blockLocation.getHosts();
                for (String host : hosts) {
                    System.out.println(host);
                }
            }
            System.out.println("----------------------------");

        }
        fileSystem.close();
    }
}
