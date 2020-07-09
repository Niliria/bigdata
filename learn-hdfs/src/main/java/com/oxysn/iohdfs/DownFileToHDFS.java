package com.oxysn.iohdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * IO流式操作HDFS读取文件到控制台
 */
public class DownFileToHDFS {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");
        //获取读取文件路径
        FSDataInputStream inputStream = fileSystem.open(new Path("hdfs://192.168.66.66:9000/yummy/hive.log"));
        //流对接输出到控制台
        IOUtils.copyBytes(inputStream,System.out,4096,false);
        IOUtils.closeStream(inputStream);
        fileSystem.close();

    }
}
