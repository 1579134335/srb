package com.atguigu.srb.core;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AssertTests {
//    if else的用法
    @Test
    public void test1(){
        Object o = null;
        if (o == null){
            throw new IllegalArgumentException("用户不存在");
        }
    }

//    断言的用法1:更加简洁
    @Test
    public void test2(){
        //另一种写法
        Object o = null;
        Assert.assertNotNull("用户不存在", null);
    }

}
