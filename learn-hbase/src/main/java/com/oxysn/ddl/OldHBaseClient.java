package com.oxysn.ddl;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

/**
 * @author yummy
 * @date 2020/7/10 21:03
 * 开发环境测试-判断表是否存在
 * 旧版本API
 * 首次测试连接失败 原因是本地hosts没有配置ip映射  无法解析node01
 */
public class OldHBaseClient {
    //判断表是否存在
    public static boolean isTableExist(String tableName) throws IOException {
        //1，配置文件对象
        HBaseConfiguration configuration = new HBaseConfiguration();
        //指定zk地址，访问Hbase不需要指定HMaster地址
        configuration.set("hbase.zookeeper.quorum",
                "192.168.66.100:2181,192.168.66.101:2181,192.168.66.102:2181");
        //Hbase客户端主类
        HBaseAdmin admin = new HBaseAdmin(configuration);
        //判断表是否存在
        boolean result = admin.tableExists(tableName);
        //关闭连接
        admin.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        boolean result = isTableExist("user");
        System.out.println(result);
    }
}
