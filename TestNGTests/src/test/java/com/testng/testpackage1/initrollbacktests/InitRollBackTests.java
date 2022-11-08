package com.testng.testpackage1.initrollbacktests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class InitRollBackTests {

    @BeforeSuite
    public void init(){
        System.out.println("Метод инита всех тестов сьюта");
    }

    @AfterSuite
    public void rollback(){
        System.out.println("Метод отката всех тестов сьюта");
    }
}