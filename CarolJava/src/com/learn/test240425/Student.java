package com.learn.test240425;

import java.util.Objects;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/25 20:13
 */
public class Student implements Comparable<Student> {
    private int age;
    private String name;


    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{age = " + age + ", name = " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("----------------");
        System.out.println("this"+this);
        System.out.println("o"+o);
        return this.age - o.age;
    }
}
