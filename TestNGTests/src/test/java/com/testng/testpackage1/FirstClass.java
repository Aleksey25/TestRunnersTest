package com.testng.testpackage1;
import org.testng.annotations.*;


public class FirstClass {

    @BeforeClass
    public void classInit(){
        System.out.println("Инит класса FirstClass");
    }

    @AfterTest
    public void classRollBack(){
        System.out.println("Откат класса FirstClass\n");
    }


    @BeforeMethod()
    public void firstClassTestInit2(){
        System.out.println("Инит каждого теста в классе 1");
    }

    @AfterMethod()
    public void firstClassTestRollBack2(){
        System.out.println("Откат каждого теста в классе 1\n");
    }




    @Test(suiteName = "Test suite From XML",
            testName = "Класс 1 тест 1")
    public void firstClassTest1(){
        System.out.println("Тест 1 в классе FirstClass");
    }


    @Test(suiteName = "Test suite From XML",
    testName = "Класс 1 тест 2")
    public void firstClassTest2(){
        System.out.println("Тест 2 в классе FirstClass");
    }
}

