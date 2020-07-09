package com.oxysn.zkoperation;

import org.apache.zookeeper.*;

/**
 * @author yummy
 * @date 2020/6/13
 * 初体验zookeeper创建一个节点
 */
public class ZooleeperDemo {
    public static void main(String[] args) throws Exception {
        //初始化zookeeper实例(zookeeper地址，会话超时时间，与系统默认一致，watcher监听)
        ZooKeeper zk = new ZooKeeper("192.168.66.66:2181,192.168.66.67:2181,192.168.66.68:2181",
                30000, new Watcher() {
            public void process(WatchedEvent event) {
                System.out.println("事件类型为" + event.getType());
                System.out.println("事件发生的路径为" + event.getPath());
                System.out.println("通知类型为：" + event.getState());
            }
        });
       //创建一个节点
        zk.create("/flink", "实时分布式计算框架".getBytes("UTF-8"),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zk.close();

    }
}
