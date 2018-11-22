package com.hexaware.ftp88;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
   public void testApp() {
       App obj = null;
       assertNull(obj);
       App obj1 = new App();
       assertNotNull(obj1);
    }
    @Test
    public void testEven() {
        assertTrue(App.even(6));
        assertFalse(App.even(5));
    }
    @Test
    public void testMax3() {
        assertEquals(7, App.max3( 7, 5, 3));
        assertEquals(7, App.max3( 5 ,7 ,3));
        assertEquals(4, App.max3( 2 ,3 ,4));


    }
    @Test
    public void testSum() {
        assertEquals(5, App.sum(2,3));
    }
    @Test
    public void testSayHello() {
        assertEquals("Welcome",App.sayHello());
    }
}
