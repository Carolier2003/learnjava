package com.carol.lambda;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/7 23:33
 */
public class girlFriend {
    private String name;
    private int age;
    private int length;

    public girlFriend() {
    }

    public girlFriend(String name, int age, int length) {
        this.name = name;
        this.age = age;
        this.length = length;
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
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "girlFriend{name = " + name + ", age = " + age + ", length = " + length + "}";
    }
}
