package com.testng.testpackage1_justrun;

import org.testng.annotations.Test;

import static demo.Tests.testMethod;


public class ThirdClass {

    @Test(testName = "Тест 1 в сьюте 2 (класс 3)")
    public void testInP2(){
        testMethod("в пакете 2");
    }
}
