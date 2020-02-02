package com.sunchaser.thinkingInJava.chapter05;

/**
 * @author sunchaser
 * @date 2020/2/2
 * @description
 * 练习15：编写一个含有字符串域的类，并采用实例初始化方式进行初始化。
 *
 * 实例初始化可理解成匿名构造器。每次创建对象时都会在所有构造器之前调用。
 * @since 1.0
 */
public class Exercise15 {
    private String str;
    {
        System.out.println("实例初始化（匿名构造器）执行");
        str = "实例初始化（匿名构造器）";
    }

    public Exercise15() {
        System.out.println("无参构造器执行");
    }

    public static void main(String[] args) {
        Exercise15 exercise15 = new Exercise15();
        System.out.println(exercise15.str);
    }
}
