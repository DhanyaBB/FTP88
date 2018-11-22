package com.hexaware.ftp88;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AgentTest {

        @Test
        public final void Test() {
            Agent obj1 = new Agent(1, "Alka", 7.88, PaymentMode.YEARLY, MaritalStatus.MARRIED, "HUBLI");
            assertEquals(1,obj1.getAgentId());
            assertEquals("Alka", obj1.getAgentName());
            assertEquals(7.88, obj1.getPremium(),0.1);
            assertEquals(PaymentMode.YEARLY, obj1.getPaymentMode());
            assertEquals(MaritalStatus.MARRIED, obj1.getMaritalStatus());
            assertEquals("YEARLY", obj1.getPaymentMode().toString());
            assertEquals("MARRIED", obj1.getMaritalStatus().toString());
            assertEquals("HUBLI", obj1.getCity());
            //String st = "MARRIED"; -- to covert string to enum
            //MaritalStatus mt = MaritalStatus.valueOf(st);
        }
        @Test
        public final void AgentSetter() {
            Agent obj1 = new Agent();
            obj1.setAgentId(1);
            obj1.setAgentName("Dhanya");
            obj1.setPremium(7.6);
            obj1.setPaymentMode(PaymentMode.YEARLY);
            obj1.setMaritalStatus(MaritalStatus.MARRIED);
            obj1.setCity("hubli");


            assertEquals(1, obj1.getAgentId());
            assertEquals("Dhanya", obj1.getAgentName());
            assertEquals(7.6, obj1.getPremium(), 0.1);
            assertEquals(PaymentMode.YEARLY, obj1.getPaymentMode());
            assertEquals(MaritalStatus.MARRIED, obj1.getMaritalStatus());
            assertEquals("YEARLY", obj1.getPaymentMode().toString());
            assertEquals("MARRIED", obj1.getMaritalStatus().toString());
            assertEquals("hubli", obj1.getCity());
        }
        @Test
        public final void testHashCode() {
            Agent e1 = new Agent(1, "Dhanya", 7.6,PaymentMode.YEARLY, MaritalStatus.MARRIED, "HUbli");
            Agent e2 = new Agent(1, "Dhanya", 7.6,PaymentMode.YEARLY, MaritalStatus.MARRIED, "HUbli");
            Agent e3 = new Agent(2, "Shree", 8.6,PaymentMode.QUARTERLY, MaritalStatus.UNMARRIED, "Chennai");
            assertEquals(e1.hashCode(),e2.hashCode());
            assertNotEquals(e2.hashCode(),e3.hashCode());
            assertNotEquals(e1.hashCode(),e3.hashCode());
        }
@Test
        public final void testEquals() {
            Agent e1 = new Agent(1, "Dhanya", 7.6,PaymentMode.YEARLY, MaritalStatus.MARRIED, "HUbli");
            Agent e2 = new Agent(1, "Dhanya", 7.6,PaymentMode.YEARLY, MaritalStatus.MARRIED, "HUbli");
            Agent e3 = new Agent(2, "Shree", 8.6,PaymentMode.QUARTERLY, MaritalStatus.UNMARRIED, "Chennai");
            assertNotEquals(e1,e3);
            assertNotEquals(e2,e3);

        }
        public final void testString() {
        Agent s1 = new Agent(1, "Dhanya", 7.6,PaymentMode.YEARLY, MaritalStatus.MARRIED, "HUbli");
String res = "AgentId" + s1.getAgentId() + "AgentName" + s1.getAgentName() + "Premium" + s1.getPremium() +
        "PaymentMode" + s1.getPaymentMode() + "MaritalStatus" + s1.getMaritalStatus() + "City" + s1.getCity();
        assertEquals(res,s1.toString());
        }
        
}