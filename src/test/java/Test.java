import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import javax.xml.transform.Result;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

class HelloTest {
    private SimpleForTest math;

    @Before
    private void init() { math = new SimpleForTest(); }
    @After
    public void tearDown() { math = null; }

    @org.junit.Test
    private void calls() {
        assertEquals(0, math.getCalls());

        math.factorial(1);
        assertEquals(1, math.getCalls());

        math.factorial(1);
        assertEquals(2, math.getCalls());
    }

    @org.junit.Test
    public void factorial() {
        assertTrue(math.factorial(0) == 1);
        assertTrue(math.factorial(1) == 1);
        assertTrue(math.factorial(5) == 120);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void factorialNegative() {
        math.factorial(-1);
    }

    @Ignore
    @org.junit.Test
    public void todo() {
        assertTrue(math.plus(1, 1) == 3);
    }
    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        org.junit.runner.Result result = runner.run(SimpleForTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}
