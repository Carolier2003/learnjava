package com.learn.test240422;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/23 13:51
 */
public class PersianCat extends Cat{

    @Override
    void eat() {
        System.out.println("一只叫"+getName()+"的，"+getAge()+"波斯猫正在吃小饼干");
    }
}
