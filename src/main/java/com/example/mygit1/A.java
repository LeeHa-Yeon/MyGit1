package com.example.mygit1;

public class A {
    private static String myName="이하연";
    private static int myNum=2017301063;
    private static String mySchool ="서경대학교";
    private static String myDepartment = "컴퓨터과학과";

    public static void main(String[] args){
        B print = new B();
        C print2 = new C();
        System.out.println(print.introduce(myName,myNum));
        System.out.println(print2.introduce(mySchool,myDepartment));
    }
}
