package com.testng;

import demo.Tests;
import org.testng.annotations.*;

public class SimpleRun {

    @BeforeSuite
    public void beforeSuite(){
        Tests.simple("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        Tests.simple("afterSuite");
    }


    @BeforeTest
    public void beforeTest(){
        Tests.simple("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        Tests.simple("afterTest");
    }

    @BeforeClass
    public void beforeClass(){
        Tests.simple("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        Tests.simple("afterClass");
    }

    @BeforeGroups(groups = "group")
    public void beforeGroups(){
        Tests.simple("beforeGroups");
    }

    @AfterGroups(groups = "group")
    public void afterGroups(){
        Tests.simple("afterGroups");
    }

    @Test(groups = {"group"})
    public void testWithGroup(){
        Tests.simple("testWithGroup");
    }

    @BeforeMethod
    public void beforeMethod(){
        Tests.simple("beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        Tests.simple("afterMethod");
    }

    @Test
    public void testWithoutGroup(){
        Tests.simple("testWithoutGroup");
    }
}
