package com.srinivas.tutorialprogramming;

public class HelloWorld {
    public static void main(String[] args) {
        int a  = 10;

        System.out.println("hello world");
        System.out.println("Hello Srinivas");
        System.out.println(a);
        int b = 20;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }


}