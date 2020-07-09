package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * 删除HDFS文件系统指定的文件夹
 */
public class DeleteFolderAtHdfs {
    public static void main(String[] args) throws Exception {
        //1,创建配置信息对象
        Configuration configuration = new Configuration();
        //2,创建文件管理对象
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");
        //3,删除文件夹 如果是非空文件夹，参数2是否递归删除，true递归
        boolean delete = fileSystem.delete(new Path("hdfs://192.168.66.66:9000/hadoop"), true);
        if (delete) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        //4,释放资源
        fileSystem.close();
    }
}
