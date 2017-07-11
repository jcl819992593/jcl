package com.huasheng.pojo;

/**
 * Created by admin on 2017/7/11.
 */
public class Person {
    private int uId;
    private String name;
    private String addr;
    private int age;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "uId=" + uId +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                '}';
    }
}
