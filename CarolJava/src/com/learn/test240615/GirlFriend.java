package com.learn.test240615;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/15 19:03
 */
public class GirlFriend {
    private String name;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
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
        int len = name.length();
        if(len < 2||len>10) {
            throw new NameFormatException(name+"超出范围");
        }
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
        if(age<18||age>40){
            throw new AgeOutOfBoundsException(age+"超出范围");
        }
        this.age = age;
    }


    @Override
    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
