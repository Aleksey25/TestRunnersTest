package demo;

import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tests {
    public static void testMethod(String testName) {
        try {
            System.out.println("Тест " + testName + " начат");
            for (int i = 0; i < 5; i++) {
                System.out.println(".");
                Thread.sleep(200);
            }
            Assert.assertEquals(testName, testName);
            System.out.println("Тест " + testName + " закончен");
            System.out.println("--------------------------------\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getCurrentTime(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        return dateFormat.format(new Date());
    }

    public static void longTestMethod(String testName) {
        try {
            System.out.println("Тест " + testName + " начат в " + getCurrentTime());
            for (int i = 0; i < 3; i++) {
                System.out.println(".");
                Thread.sleep(5000);
            }
            Assert.assertEquals(testName, testName);
            System.out.println("Тест " + testName + " закончен в " + getCurrentTime());
            System.out.println("--------------------------------\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void failTestMethod(String testName) {
        try {
            System.out.println("Тест " + testName + " начат");
            for (int i = 0; i < 5; i++) {
                System.out.println(".");
                Thread.sleep(200);
            }
            Assert.assertEquals(testName, "testName");
            System.out.println("Тест " + testName + " закончен");
            System.out.println("--------------------------------\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void simple(String testName) {
        System.out.println(testName);
        System.out.println("--------------------------------\n");
    }
}
