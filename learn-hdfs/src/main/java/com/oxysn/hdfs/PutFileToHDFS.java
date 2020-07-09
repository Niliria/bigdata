package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * 上传本地文件到HDFS集群
 */
public class PutFileToHDFS {
    public static void main(String[] args) throws Exception {
        //1,创建配置信息对象
        Configuration configuration = new Configuration();

        //2,设置参数，参数的优先级 1，客户端代码中设置的值 2，classpath下的用户自定义配置文件 3，服务器的默认配置
        configuration.set("dfs.replication", "2");

        //3,获取文件系统
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");

        //4,创建要上传文件所在的本地目录
        Path src = new Path("D:/Scala.docx");

        //5,创建要上传到HDFS的目标路径
        Path dst = new Path("hdfs://192.168.66.66:9000/yummy/Scala.docx");

        //6,拷贝文件
        fileSystem.copyFromLocalFile(src, dst);

        //7,关闭资源
        fileSystem.close();


    }
}
