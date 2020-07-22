package com.onysn.chapter03.excpetion;

/**
 * @author yummy
 * @date 2020/7/22 14:26
 * Java中的异常处理
 */
public class JavaException {
    public static void main(String[] args) {
        try {
            //可以代码
            int i = 9;
            int b = 0;
            int c = i / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("最终要执行的代码");
        }
        System.out.println("程序没有问题");
    }
}
