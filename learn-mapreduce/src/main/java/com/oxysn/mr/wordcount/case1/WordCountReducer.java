package com.oxysn.mr.wordcount.case1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author yummy
 * @date 2020/6/15
 * 案例一：word count 统计每个单词出现的次数
 * Reduce阶段
 */
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        //定义一个计数器
        int count = 0;
        for (IntWritable value : values) {

            count += value.get();
        }
        context.write(key, new IntWritable(count));
    }
}
