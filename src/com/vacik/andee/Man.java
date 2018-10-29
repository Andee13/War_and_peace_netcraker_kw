package com.vacik.andee;

public  class Man {
    private int age;
    private int height;
     void  eat(){
        System.out.println("I am hungry");
    }


    public Man(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Man() {
    }
}
