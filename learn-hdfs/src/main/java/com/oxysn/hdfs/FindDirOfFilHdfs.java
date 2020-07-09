package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * 判断HDFS文件系统下是文件还是文件夹
 */
public class FindDirOfFilHdfs {
    public static void main(String[] args) throws Exception {
        //1,创建配置信息对象
        Configuration configuration = new Configuration();

        //2，创建文件管理对象
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");

        //3，
        FileStatus[] fileStatuses = fileSystem.listStatus(new Path("/"));
        for (FileStatus fileStatus : fileStatuses) {
            if (fileStatus.isFile()) {
                System.out.println("f--" + fileStatus.getPath().getName());
            } else {
                System.out.println("d--" + fileStatus.getPath().getName());
            }

        }
        //4 释放资源
        fileSystem.close();
    }
}
