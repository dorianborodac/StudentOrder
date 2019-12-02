package com.levelp.jb2;

public class Person  extends  Main{
    private String lname;
    private String fname;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }

    public static void main(String[] args) {


        System.out.println("new branch");
    }
}
