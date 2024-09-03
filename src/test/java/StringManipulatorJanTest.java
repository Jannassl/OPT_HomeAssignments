import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulatorJanTest {

    private static StringManipulatorJan manipulator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        manipulator = new StringManipulatorJan();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {

        manipulator = null;
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void reverse() {
        assertEquals("naJ", manipulator.reverse("Jan"));
    }

    @Test
    public void capitalize() {
        assertEquals("MOIKKA", manipulator.capitalize("moikka"));
    }
}