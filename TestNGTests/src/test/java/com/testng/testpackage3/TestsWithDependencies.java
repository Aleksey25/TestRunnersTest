package com.testng.testpackage3;

import demo.Tests;
import org.testng.annotations.Test;

public class TestsWithDependencies {

    @Test(testName = "Тест 1 в классе груп зависимостей")
    public void Test1WithoutPriority(){
        Tests.testMethod("без приоритета");
    }

    @Test(testName = "Тест 2 в классе груп зависимостей",
    priority = 2)
    public void Test1WithPriority2(){
        Tests.testMethod("1 приоритет 2");
    }

    @Test(testName = "Тест 3 в классе груп зависимостей",
            priority = 2)
    public void Test2WithPriority2(){
        Tests.testMethod("2 приоритет 2");
    }

    @Test(testName = "Тест 4 в классе груп зависимостей",
            priority = 1)
    public void Test1WithPriority1(){
        Tests.testMethod("1 приоритет 1");
    }

    @Test(testName = "Тест 5 в классе груп зависимостей",
            priority = 1)
    public void Test2WithPriority1(){
        Tests.testMethod("2 приоритет 1");
    }

    @Test(testName = "Тест 6 в классе груп зависимостей",
           dependsOnMethods = "Test2WithPriority1")
    public void TestDependsOn(){
        Tests.testMethod("зависит от теста Test2WithPriority1");
    }
}
