package com.testNG.restAssured;

import org.testng.annotations.Test;

public class NewTest {

    @Test(groups = "Regression")
    public void test1(){
        System.out.println("This is a test1...");
    }

    @Test(groups = "Smoke")
    public void test2(){
        System.out.println("This is a test2...");
    }

    @Test(groups = "Sanity")
    public void test3(){
        System.out.println("This is a test3...");
    }

    @Test(groups = "Regression")
    public void test4(){
        System.out.println("This is a test4...");
    }

}
