package com.hexaware.ftp88;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


/**
 * Unit test for simple App.
 */
    public class StudentTest {

        @Test
        public final void testStudent() throws ParseException {
            String sDate1 = "10-09-1997";
            Date Date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
            Student obj1 = new Student(1, "Alka", "Singh", Date1, "dehli", 7.57);
            assertEquals(1,obj1.getSno());
            assertEquals("Alka", obj1.getFName());
            assertEquals("Singh", obj1.getLName());
            assertEquals(Date1, obj1.getDateofBrith());
            assertEquals("dehli", obj1.getCity());
            assertEquals(7.56, obj1.getCgp(), 0.1);
        }
        @Test
        public final void testStudentSetter() throws ParseException {
            Student obj1 = new Student();
            String sDate1 = "10-09-1997";
            Date Date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
            obj1.setSno(1);
            obj1.setFName("Dhanya");
            obj1.setLName("Gouda");
            obj1.setDateofBrith(Date1);
            obj1.setCity("hubli");
            obj1.setCgp(7.56);

            assertEquals(1, obj1.getSno());
            assertEquals("Dhanya", obj1.getFName());
            assertEquals("Gouda", obj1.getLName());
            assertEquals(Date1, obj1.getDateofBrith());
            assertEquals("hubli", obj1.getCity());
            assertEquals(7.56, obj1.getCgp(), 0.1);
        }
        @Test
        public final void testHashCode() throws ParseException {
            String sDate1 = "10-09-1997";
            Date Date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
            String sDate2 = "11-02-1997";
            Date Date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
            Student e1 = new Student(1, "Alka", "Singh", Date1, "dehli", 7.56);
            Student e2 = new Student(1, "Alka", "Singh", Date1, "dehli", 7.56);
            Student e3 = new Student(2, "vai", "G", Date2, "chennai", 8.56);
            assertEquals(e1.hashCode(),e2.hashCode());
            assertNotEquals(e2.hashCode(),e3.hashCode());
            assertNotEquals(e1.hashCode(),e3.hashCode());
        }
        @Test
        public final void testEquals() throws ParseException {
            String sDate1 = "10-09-1997";
            Date Date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
            String sDate2 = "11-02-1997";
            Date Date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
            Student e1 = new Student(1, "Alka", "Singh", Date1, "dehli", 7.56);
            Student e2 = new Student(1, "Alka", "Singh", Date1, "dehli", 7.56);
            Student e3 = new Student(2, "vai", "G", Date2, "chennai", 8.56);
            assertEquals(e1,e2);
            assertNotEquals(e1,e3);
            assertNotEquals(e2,e3);

        }
    public final void testString() throws ParseException {
       String sDate1 = "11-02-1997";
       Date Date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Student s1 = new Student(1, "Alka", "Singh", Date1, "dehli", 7.56);
        String res = "sno" + s1.getSno() + "firstname" + s1.getFName() + "lastname" + s1.getLName() +
        "DateofBrith" + s1.getDateofBrith() + "city" + s1.getCity() + "cgp" + s1.getCgp();
        assertEquals(res,s1.toString());
    }
    }