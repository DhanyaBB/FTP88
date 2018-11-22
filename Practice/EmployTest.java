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
    public class EmployTest {

        @Test
        public final void testEmploy() {
            Employ obj1 = new Employ(1, "Alka", "Ftp", "Developer", 43823);
            assertEquals(1,obj1.getEmpno());
            assertEquals("Alka", obj1.getName());
            assertEquals("Ftp", obj1.getDept());
            assertEquals("Developer", obj1.getDesig());
            assertEquals(43823, obj1.getBasic());
        }
        @Test
        public final void testEmploySetter() {
            Employ obj1 = new Employ();
            obj1.setEmpno(12);
            obj1.setName("Dhanya");
            obj1.setDept("Java");
            obj1.setDesig("Expert");
            obj1.setBasic(435276);

            assertEquals(12, obj1.getEmpno());
            assertEquals("Dhanya", obj1.getName());
            assertEquals("Java", obj1.getDept());
            assertEquals("Expert", obj1.getDesig());
            assertEquals(435276, obj1.getBasic());
        }
        @Test
        public final void testHashCode() {
            Employ e1 = new Employ(12, "Vai", "Java", "Programmer", 4233);
            Employ e2 = new Employ(12, "Vai", "Java", "Programmer", 4233);
            Employ e3 = new Employ(13, "Vaii", "sql", "Deveploper", 42333);
            assertEquals(e1.hashCode(),e2.hashCode());
            assertNotEquals(e2.hashCode(),e3.hashCode());
            assertNotEquals(e1.hashCode(),e3.hashCode());
        }
        @Test
        public final void testEquals() {
            Employ e1 = new Employ(12, "Vai", "Java", "Programmer", 4233);
            Employ e2 = new Employ(12, "Vai", "Java", "Programmer", 4233);
            Employ e3 = new Employ(13, "Vaii", "sql", "Deveploper", 42333);
            assertEquals(e1,e2);
            assertNotEquals(e1,e3);
            assertNotEquals(e2,e3);

        }
    }