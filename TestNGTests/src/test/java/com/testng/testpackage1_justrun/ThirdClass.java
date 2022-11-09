package com.testng.testpackage1_justrun;

import org.testng.annotations.Test;

import static demo.Tests.testMethod;

@Test(testName = "Tests in separate class")
// Все паблик методы по сути отмечены аннотацией тест
public class ThirdClass {

    public void testInP2(){
        testMethod("1 в отдельном классе 2");
    }

    public void testInP2_2(){
        testMethod("2 в отдельном классе 2");
    }
}
