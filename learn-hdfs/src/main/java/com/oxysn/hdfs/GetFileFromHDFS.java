package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * 从HDFS文件系统下载文件到本地
 */
public class GetFileFromHDFS {
    public static void main(String[] args) throws Exception {
        //1，创建配置文件信息对象
        Configuration configuration = new Configuration();

        //2，配置参数信息
        configuration.set("dfs.replication", "2");

        //3，创建文件管理对象
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");

        //4,下载文件
        //fileSystem.copyToLocalFile(false,new Path("hdfs://192.168.66.66:9000/yummy/Scala.docx"),new Path("D:/copyScala.docx"),true);
        //参数1 boolean delSrc 指是否将源文件删除
        //参数2 Path src 指下载HDFS文件系统目标目录
        //参数3 Path dst 指下载到本地路径
        //参数4 boolean useRawLocalFileSystem 是否开启文件校验
        fileSystem.copyToLocalFile(false
                ,new Path("hdfs://192.168.66.66:9000/yummy/Scala.docx")
                ,new Path("D:/copyScala.docx")
                ,true);

        //5,释放资源
        fileSystem.close();
    }
}
