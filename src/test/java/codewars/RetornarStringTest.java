package codewars;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RetornarStringTest {
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    @Test
    public void saludamela() {
        System.out.println(greet("Igna"));
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(RetornarStringTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}