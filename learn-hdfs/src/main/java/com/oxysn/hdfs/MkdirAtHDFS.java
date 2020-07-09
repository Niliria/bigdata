package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * HDFS目录创建
 */
public class MkdirAtHDFS {
    public static void main(String[] args) throws Exception {
        //1,创建配置信息对象
        Configuration configuration = new Configuration();

        //2，创建文件管理对象
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");

        //3，创建目录
        fileSystem.mkdirs(new Path("hdfs://192.168.66.66:9000/hadoop"));

        //4，释放资源
        fileSystem.close();

    }


}
