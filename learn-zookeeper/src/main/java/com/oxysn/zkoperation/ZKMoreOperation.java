package com.oxysn.zkoperation;

import org.apache.zookeeper.*;

/**
 * @author yummy
 * @date 2020/6/13
 * zookeeper创建节点，创建子节点，修改节点信息，删除节点
 */
public class ZKMoreOperation {
    public static void main(String[] args) throws Exception{
        //初始化zookeeper信息
        ZooKeeper zk = new ZooKeeper("192.168.66.66:2181,192.168.66.67:2181,192.168.66.68:2181"
                , 30000
                , new Watcher() {
            public void process(WatchedEvent event) {
                System.out.println("事件类型为" + event.getType());
                System.out.println("事件发生的路径为" + event.getPath());
                System.out.println("通知类型为：" + event.getState());
            }
        });
        //创建一个目录节点
        zk.create("/hiphop"
                , "嘻哈文化".getBytes("UTF-8")
                , ZooDefs.Ids.OPEN_ACL_UNSAFE
                , CreateMode.PERSISTENT);

        //为/hiphop创建一个子目录节点
        zk.create("/hiphop/hiphopMusic"
                , "嘻哈音乐".getBytes("UTF-8")
                , ZooDefs.Ids.OPEN_ACL_UNSAFE
                , CreateMode.PERSISTENT);

        //
        System.out.println(new String(zk.getData("/hiphop", true, null)));

        //取出子目录节点列表
        System.out.println(zk.getChildren("/hiphop", true));

        //修改子目录节点数据
        zk.setData("/hiphop/hiphopMusic", "XXX嘻哈音乐".getBytes("UTF-8"), -1);

        //
        System.out.println("目录节点状态：" + zk.exists("/hiphop", true));

        //创建另一个子目录节点
        zk.create("/hiphop/hiphopRap"
                , "嘻哈饶舌".getBytes("UTF-8")
                , ZooDefs.Ids.OPEN_ACL_UNSAFE
                , CreateMode.PERSISTENT);
        //
        System.out.println(new String(zk.getData("/hiphop/hiphopRap", false, null)));

        //删除子目录节点
        zk.delete("/hiphop/hiphopMusic",-1);
        zk.delete("/hiphop/hiphopRap",-1);

        zk.close();

    }
}
