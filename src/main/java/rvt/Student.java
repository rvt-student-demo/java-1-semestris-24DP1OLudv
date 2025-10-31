package rvt;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        System.out.println("Student " + name + " is created!");
    }


    public void introduce() {
        System.out.println(
            "Student: " + name + ", age: "
        );
    }
}