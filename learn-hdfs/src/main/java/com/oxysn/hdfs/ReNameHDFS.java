package com.oxysn.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * @author yummy
 * @date 2020/6/14
 * 重命名文件或者文件夹
 */
public class ReNameHDFS {
    public static void main(String[] args) throws Exception {
        //1,创建配置信息对象
        Configuration configuration = new Configuration();
        //2，创建文件管理对象
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.66.66:9000"), configuration, "root");
        //3，重命名文件或者文件夹
        boolean rename = fileSystem.rename(new Path("hdfs://192.168.66.66:9000/yummy/Scala.docx")
                , new Path("hdfs://192.168.66.66:9000/newScala.docx"));
        if (rename) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
        //4,释放资源
        fileSystem.close();
    }
}
