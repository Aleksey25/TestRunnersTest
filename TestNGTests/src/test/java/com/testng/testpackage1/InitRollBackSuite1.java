package com.testng.testpackage1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class InitRollBackSuite1 {

    @BeforeTest
    public void init(){
        System.out.println("Метод инита тестов сьюта 1");
    }

    @AfterTest
    public void rollback(){
        System.out.println("Метод отката тестов сьюта 1");
    }
}