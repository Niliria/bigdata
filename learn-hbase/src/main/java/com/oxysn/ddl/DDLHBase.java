package com.oxysn.ddl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

/**
 * @author yummy
 * @date 2020/7/10 22:19
 */
public class DDLHBase {
    private static Connection connection = null;
    private static Admin admin = null;

    static {
        try {
            //1,配置文件对象
            Configuration configuration = HBaseConfiguration.create();
            //2，指定zk地址，访问HBase不需要指定HMaster地址
            configuration.set("hbase.zookeeper.quorum", "192.168.66.100:2181,192.168.66.101:2181,192.168.66.102:2181");
            //3,Hbase客户端主类
            connection = ConnectionFactory.createConnection(configuration);
            admin = connection.getAdmin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isTableExist(String tableName) throws IOException {
        /**
         * @Description: 判断表是否存在
         * @Param: [tableName]
         * @return: boolean
         */
        return admin.tableExists(TableName.valueOf(tableName));
    }

    public static void createTable(String tableName, String... columnFamilys) throws IOException {
        /**
         * @Description: 创建表
         * @Param: [tableName, columnFamilys]
         * @return: void
         */
        //创建表的描述器
        HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf(tableName));
        //添加列簇信息
        for (String columnFamily : columnFamilys) {
            //添加列簇
            HColumnDescriptor hcolumnDescriptor = new HColumnDescriptor(columnFamily);
            tableDescriptor.addFamily(hcolumnDescriptor);
        }
        //调用admin createTable创建表
        admin.createTable(tableDescriptor);
    }

    public static void dropTable(String tableName) throws IOException {
        /**
         * @Description: 删除表
         * @Param: [tableName]
         * @return: void
         */
        //删除表之前先disable表
        boolean result = admin.tableExists(TableName.valueOf(tableName));
        if (result) {
            admin.disableTable(TableName.valueOf(tableName));
            admin.deleteTable(TableName.valueOf(tableName));
        } else {
            System.out.println("未匹配到该表");
        }
    }

    public static void createNameSpace(String nsName) throws IOException {
        /**
         * @Description:  创建命名空间描述器
         * @Param: [nsName]
         * @return: void
         */
        //创建命名空间描述器
        NamespaceDescriptor namespaceDescriptor = NamespaceDescriptor.create(nsName).build();
        admin.createNamespace(namespaceDescriptor);
    }

    public static void close() {
        if (admin != null) {
            try {
                admin.close();
                admin = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(isTableExist("user"));
        dropTable("user1");
        close();
    }


}
