package com.oxysn.mr.wordcount.case1;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author yummy
 * @date 2020/6/15
 */
public class WordCountDriver {
    public static void main(String[] args) throws Exception {
        //创建配置文件对象
        Configuration configuration = new Configuration();

        //job的实例 用于程序属性的设置 封装 人物的提交
        Job job = Job.getInstance(configuration, "wordCount");

        //设置jar加载路径
        job.setJarByClass(WordCountDriver.class);

        //设置map和reduce类
        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(WordCountReducer.class);

        //设置map输出
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        //设置reduce输出
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        //设置输入和输出路径
        FileInputFormat.setInputPaths(job, new Path("D:\\mr\\wordcount\\input"));
        FileOutputFormat.setOutputPath(job, new Path("D:\\mr\\wordcount\\output"));

        //提交程序
        boolean completion = job.waitForCompletion(true);
        System.exit(completion ? 0 : 1);


    }
}
