package com.testng.testpackage3_testDepends;

import org.testng.annotations.Test;

import static demo.Tests.failTestMethod;
import static demo.Tests.testMethod;

public class TestsWithDependencies {

    @Test(testName = "Тест 1 в классе груп зависимостей")
    public void Test1WithoutPriority(){
        testMethod("без приоритета");
    }

    @Test(testName = "Тест 2 в классе груп зависимостей",
    priority = 2)
    public void Test1WithPriority2(){
        testMethod("1 приоритет 2");
    }

    @Test(testName = "Тест 3 в классе груп зависимостей",
            priority = 2)
    public void Test2WithPriority2(){
        testMethod("2 приоритет 2");
    }

    @Test(testName = "Тест 4 в классе груп зависимостей",
            priority = 1)
    public void Test1WithPriority1(){
        testMethod("1 приоритет 1");
    }

    @Test(testName = "Тест 5 в классе груп зависимостей",
            priority = 1)
    public void Test2WithPriority1(){
        testMethod("2 приоритет 1");
    }

    @Test(testName = "Тест 6 в классе груп зависимостей",
           dependsOnMethods = "Test2WithPriority1")
    public void TestDependsOn(){
        failTestMethod("зависит от теста Test2WithPriority1");
    }

    //Этот тест не пойдет, потому что тот от которого он зависит упал
    @Test(testName = "Тест 7 в классе груп зависимостей",
            dependsOnMethods = "TestDependsOn")
    public void TestDependsOnFail(){
        testMethod("зависит от теста Test2WithPriority1");
    }
}
