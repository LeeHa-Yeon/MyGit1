package com.example.mygit1;

public class A {
    private static String myName="이하연";
    private static int myNum=2017301063;

    public static void main(String[] args){
        B print = new B();
        System.out.println(print.introduce(myName,myNum));
    }
}
