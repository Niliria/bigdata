package com.oxysn.ddl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

/**
 * @author yummy
 * @date 2020/7/10 21:35
 * 开发环境测试-判断表是否存在
 * 新版API
 */
public class NewHbaseClient {

    //判断表是否存在
    public static boolean isTableExist(String tableName) throws IOException {
        //1,配置文件对象
        Configuration configuration = HBaseConfiguration.create();
        //2,指定zk地址 访问hbase不需要指定hmaster
        configuration.set("hbase.zookeeper.quorum", "192.168.66.100:2181,192.168.66.101:2181,192.168.66.102:2181");
        //3，hbase客户端主类
        Connection connection = ConnectionFactory.createConnection(configuration);
        Admin admin = connection.getAdmin();
        //4,判断表是否存在
        boolean result = admin.tableExists(TableName.valueOf(tableName));
        admin.close();
        connection.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        boolean result = isTableExist("user1");
        if (result == true) {
            System.out.println("表存在");
        } else {
            System.out.println("表不存在");
        }
    }
}
