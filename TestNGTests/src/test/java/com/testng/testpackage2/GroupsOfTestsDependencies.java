package com.testng.testpackage2;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import static demo.Tests.testMethod;

public class GroupsOfTestsDependencies {

    @BeforeGroups( groups = {"testGroup"})
    public void beforeGroup1(){
        System.out.println("Инит группы тестов testGroup");
    }

    @AfterGroups( groups = {"testGroup"})
    public void afterGroup1(){
        System.out.println("Откат группы тестов testGroup");
    }

    @BeforeGroups( groups = {"testGroup2"})
    public void beforeGroup2(){
        System.out.println("Инит группы тестов testGroup2");
    }

    @AfterGroups( groups = {"testGroup2"})
    public void afterGroup2(){
        System.out.println("Откат группы тестов testGroup2");
    }

    @Test(dependsOnGroups = {"testGroup2"},
            testName = "Тест 4 в классе груп зависимостей")
    public void testClass4_1() {
        testMethod("выполняется после группы тестов testGroup2");
    }

    @Test(dependsOnGroups = {"testGroup"},
            groups = {"testGroup2"},
            testName = "Тест 1 в классе груп зависимостей")
    public void testClass4_2() {
        testMethod("выполняется после группы тестов testGroup " +
                "и который является тестом группы testGroup2");
    }

    @Test(groups = {"testGroup","testGroup2"},
            testName = "Тест 2 в классе груп зависимостей")
    public void testClass4_3() {
        testMethod("1 из групп тестов testGroup и testGroup2");
    }

    @Test(groups = {"testGroup"},
            testName = "Тест 3 в классе груп зависимостей")
    public void testClass4_4() {
        testMethod("2 из группы тестов testGroup");
    }


}
