package com.example.mygit1;

public class C {
    private String school;
    private String department;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String introduce(String school, String department){
        return "저의 학교는 "+school+"이고 학과는 "+department + "입니다.";
    }
}
