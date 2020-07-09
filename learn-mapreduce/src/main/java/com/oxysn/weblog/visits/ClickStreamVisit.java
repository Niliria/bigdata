package com.oxysn.weblog.visits;

import com.oxysn.weblog.bean.PageViewsBean;
import com.oxysn.weblog.bean.VisitBean;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author yummy
 * @date 2020/7/6 1:00
 */
public class ClickStreamVisit {

    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        job.setJarByClass(ClickStreamVisit.class);

        job.setMapperClass(ClickStreamVisitMapper.class);
        job.setReducerClass(ClickStreamVisitReducer.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(PageViewsBean.class);

        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(VisitBean.class);


//		FileInputFormat.setInputPaths(job, new Path(args[0]));
//		FileOutputFormat.setOutputPath(job, new Path(args[1]));
        FileInputFormat.setInputPaths(job, new Path("D:\\mr\\weblog\\pageviews"));
        FileOutputFormat.setOutputPath(job, new Path("D:\\mr\\weblog\\visits"));

        boolean res = job.waitForCompletion(true);
        System.exit(res ? 0 : 1);

    }

}
