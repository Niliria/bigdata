package com.oxysn.iohdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * 使用IO操作文件上传HDFS
 */
public class PutFileToHDFS {
    public static void main(String[] args) throws Exception {
        //创建配置信息对象
        Configuration configuration = new Configuration();
        //创建文件管理对象
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");

        //创建输入流
        FileInputStream inputStream = new FileInputStream(new File("D:/hive.log"));
        //创建输出流
        FSDataOutputStream outputStream = fileSystem.create(new Path("hdfs://192.168.66.66:9000/yummy/hive.log"));
        //流对接
        IOUtils.copyBytes(inputStream,outputStream,1024,false);
        //释放资源
        IOUtils.closeStream(outputStream);
        IOUtils.closeStream(inputStream);
        fileSystem.close();
    }
}
