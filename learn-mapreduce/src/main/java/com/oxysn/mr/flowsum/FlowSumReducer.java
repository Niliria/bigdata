package com.oxysn.mr.flowsum;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author yummy
 * @date 2020/6/16 20:46
 */
public class FlowSumReducer extends Reducer<Text, FlowBean, Text, FlowBean> {

    FlowBean v = new FlowBean();

    @Override
    protected void reduce(Text key, Iterable<FlowBean> values, Context context) throws IOException, InterruptedException {
        long upFlowCount = 0;
        long downFlowCount = 0;
        for (FlowBean value : values) {
            upFlowCount += value.getUpFlow();
            downFlowCount += value.getDownFlow();
        }
        v.set(upFlowCount, downFlowCount);
        context.write(key, v);
    }
}
