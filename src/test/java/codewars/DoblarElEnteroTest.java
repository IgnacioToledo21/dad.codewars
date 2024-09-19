package codewars;

import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;

public class DoblarElEnteroTest {
    @Test
    public final void test_1() {
        Assert.assertEquals("Nope!", 4, DoblarElEntero.doubleInteger(2)); // Test cases here!
    }

    @Test
    public final void test_2() {
        Assert.assertEquals("Nope!", 12, DoblarElEntero.doubleInteger(6)); // Test cases here!
    }

@Test
public final void test_3() {
    Assert.assertEquals( "Nope!" , 100, DoblarElEntero.doubleInteger(50)); // Test cases here!
}
}