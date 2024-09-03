import org.junit.*;

import static org.junit.Assert.*;

public class AccountTest {
    private static Account manipulator;
    @Before
    public  void setUp() throws Exception {
        manipulator = new Account();
    }

    @After
    public  void tearDown() throws Exception {
        manipulator = null;
    }

    @Test
    public void deposit() {
        manipulator.deposit(5.0);
        assertEquals(5.0, manipulator.getBalance(), 0.0);
    }

    @Test
    public void withdraw() {
        manipulator.deposit(10.0);
        manipulator.withdraw(8.0);
        assertEquals(2.0, manipulator.getBalance(), 0.0);

        manipulator.deposit(20.0);
        assertEquals(22.0, manipulator.getBalance(), 0.0);

        double result = manipulator.withdraw(30.0);
        assertEquals(0.0, result, 0.0);
        assertEquals(22.0, manipulator.getBalance(), 0.0);
    }

    @Test
    public void getBalance() {

        assertEquals(0.0, manipulator.getBalance(), 0.0);
    }
}