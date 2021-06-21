package com.example.mygit1;

public class B {
    private String name;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String introduce(String name, int num){
        return "저의 학번은 "+num+"이고 이름은 "+name + "입니다.";
    }

}
