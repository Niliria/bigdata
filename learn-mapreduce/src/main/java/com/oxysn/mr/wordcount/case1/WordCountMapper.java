package com.oxysn.mr.wordcount.case1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author yummy
 * @date 2020/6/15
 * 案例一：word count 统计每个单词出现的次数
 * map阶段
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    Text k = new Text();
    IntWritable v = new IntWritable(1);

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //拿到第一行数据
        String line = value.toString();
        //切割数据 一个一个单词
        String[] words = line.split("\\s+");
        //单词 格式 Hadoop 1  hive 1 ...
        for (String word : words) {
            k.set(word);
            context.write(k, v);
        }
    }
}
