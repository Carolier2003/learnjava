package com.learn.test240422;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/23 13:35
 */
public abstract class Animal {
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(int age, String name) {
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

    abstract void eat();

    public String toString() {
        return "Animal{age = " + age + ", name = " + name + "}";
    }
}
