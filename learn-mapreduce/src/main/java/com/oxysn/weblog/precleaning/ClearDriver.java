package com.oxysn.weblog.precleaning;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author yummy
 * @date 2020/7/5 23:59
 */
public class ClearDriver {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        Job job = Job.getInstance();
        job.setJarByClass(ClearDriver.class);
        job.setMapperClass(ClearMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(NullWritable.class);
        FileInputFormat.setInputPaths(job, new Path("D:\\mr\\weblog\\access.log.20181101.dat"));
        FileOutputFormat.setOutputPath(job, new Path("D:\\mr\\weblog\\clearout"));
        boolean b = job.waitForCompletion(true);
        System.exit(b ? 0 : 1);
    }
}
