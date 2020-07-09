package com.oxysn.mr.wordcount.case2;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author yummy
 * @date 2020/6/19 19:56
 * 需求：wordcount单词记数
 * 把单词按照ASCII码奇偶分区
 */
public class WordCountASCIIDriver {
    public static void main(String[] args) throws Exception {

        Configuration configuration = new Configuration();
        Job job = Job.getInstance(configuration, "wc");

        job.setJarByClass(WordCountASCIIDriver.class);

        job.setNumReduceTasks(2);

        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(WordCountReducer.class);
        job.setPartitionerClass(WordCountPartition.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        FileInputFormat.setInputPaths(job, new Path("D:\\mr\\wordcount\\input"));
        FileOutputFormat.setOutputPath(job, new Path("D:\\mr\\wordcount\\outascii"));

        boolean b = job.waitForCompletion(true);
        System.exit(b ? 0 : 1);
    }
}
