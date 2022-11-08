package com.testng.testpackage1;


import org.testng.annotations.Test;

import static demo.Tests.testMethod;

public class SecondClass {

    @Test(testName = "Класс 2 тест 2")
    public void secondClassTest1(){
        testMethod("в классе 2");
    }
}
