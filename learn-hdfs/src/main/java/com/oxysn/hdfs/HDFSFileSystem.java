package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

/**
 * @author yummy
 * @date 2020/6/13
 */
public class HDFSFileSystem {
    public static void main(String[] args) throws Exception {
        //1,创建配置信息对象
        Configuration configuration = new Configuration();

        //2,获取文件系统
        FileSystem fileSystem = FileSystem.get(configuration);

        //3,打印文件系统
        System.out.println(fileSystem.toString());
    }
}
