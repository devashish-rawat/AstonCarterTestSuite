package org.example;

import org.testng.annotations.*;

public class HeaderTest {

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @Test
    public void testCase1(){
        System.out.println("testCase 1");
    }

    @Test
    public void testCase2(){
        System.out.println("testCase 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
}
