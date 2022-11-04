package com.testng.testpackage2;

import org.testng.annotations.Test;


public class ThirdClass {

    @Test(testName = "Тест 1 в сьюте 2 (класс 3)")
    public void testInP2(){
        System.out.println("тест в пакете 2");
    }
}
