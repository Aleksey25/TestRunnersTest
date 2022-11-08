package demo;

import org.testng.Assert;

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
    };
}
