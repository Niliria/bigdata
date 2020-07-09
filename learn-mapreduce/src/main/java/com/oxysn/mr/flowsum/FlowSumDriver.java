package com.oxysn.mr.flowsum;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author yummy
 * @date 2020/6/16 20:51
 */
public class FlowSumDriver {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();

        Job job = Job.getInstance(configuration, "flowSum");

        job.setJarByClass(FlowSumDriver.class);

        //设置map,reduce
        job.setMapperClass(FlowSumMapper.class);
        job.setReducerClass(FlowSumReducer.class);

        //设置mapper输出
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(FlowBean.class);

        //设置reduce输出
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(FlowBean.class);

        //设置输入输出路径
        FileInputFormat.setInputPaths(job, new Path("D:\\mr\\FlowSumCount\\input"));
        FileOutputFormat.setOutputPath(job, new Path("D:\\mr\\FlowSumCount\\output1"));

        //提交
        boolean b = job.waitForCompletion(true);
        System.exit(b ? 0 : 1);

    }
}
