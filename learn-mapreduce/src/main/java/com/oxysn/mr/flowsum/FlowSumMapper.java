package com.oxysn.mr.flowsum;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author yummy
 * @date 2020/6/16
 */
public class FlowSumMapper extends Mapper<LongWritable, Text, Text, FlowBean> {

    Text k = new Text();
    FlowBean v = new FlowBean();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //读取文件，切割数据
        String[] fields = value.toString().trim().split("\\s+");

        //获取手机号
        String phoneNum = fields[0];

        //获取上行流量
        long upFlow = Long.parseLong(fields[fields.length - 3]);
        //获取下行流量
        long downFlow = Long.parseLong(fields[fields.length - 2]);

        //key 为用户手机号
        k.set(phoneNum);
        //value 为封装的FlowBean对象
        v.set(upFlow, downFlow);

        context.write(k, v);
    }
}
