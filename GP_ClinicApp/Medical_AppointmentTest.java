/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpclinic.gp_clinic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fiama
 */
public class Medical_AppointmentTest {
    
    public Medical_AppointmentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Medical_Appointment.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = null;
        Medical_Appointment instance = new Medical_Appointment();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDate method, of class Medical_Appointment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Medical_Appointment instance = new Medical_Appointment();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTime method, of class Medical_Appointment.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        Medical_Appointment instance = new Medical_Appointment();
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCause method, of class Medical_Appointment.
     */
    @Test
    public void testSetCause() {
        System.out.println("setCause");
        String cause = "";
        Medical_Appointment instance = new Medical_Appointment();
        instance.setCause(cause);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Medical_Appointment.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Medical_Appointment instance = new Medical_Appointment();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDate method, of class Medical_Appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Medical_Appointment instance = new Medical_Appointment();
        String expResult = null;
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTime method, of class Medical_Appointment.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Medical_Appointment instance = new Medical_Appointment();
        String expResult = null;
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getCause method, of class Medical_Appointment.
     */
    @Test
    public void testGetCause() {
        System.out.println("getCause");
        Medical_Appointment instance = new Medical_Appointment();
        String expResult = null;
        String result = instance.getCause();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of toString method, of class Medical_Appointment.
     */
    @Test
    public void testToString() {
        String name = null;
        String date = null;
        String time = null;
        String cause = null;
        System.out.println("");
        Medical_Appointment instance = new Medical_Appointment();
        String expResult = "Medical_Appointment{" + "name=" + name + ", date=" + date + ", time=" + time + ", cause=" + cause + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
               
    }
    
}
