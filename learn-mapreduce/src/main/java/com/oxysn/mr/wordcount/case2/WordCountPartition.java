package com.oxysn.mr.wordcount.case2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * @author yummy
 * @date 2020/6/19 19:58
 */
public class WordCountPartition extends Partitioner<Text, IntWritable> {


    @Override
    public int getPartition(Text key, IntWritable value, int i) {
        //获取Mapper端的输出(key单词,value1)，截取第一个字母
        String substring = key.toString().substring(0, 1);
        //
        char[] chars = substring.toCharArray();
        //
        int aChar = chars[0];

        if (aChar % 2 == 0) {
            return 0;
        }else{
            return 1;
        }
    }
}
