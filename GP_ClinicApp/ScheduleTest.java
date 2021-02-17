/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpclinic.gp_clinic;

import java.util.ArrayList;

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
public class ScheduleTest {
    
    public ScheduleTest() {
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
     * Test of addNew_Appointment method, of class Schedule.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testAddNew_Appointment() {
        System.out.println("addNew_Appointment");
        String name = "John Keane";
        String date = "16/01/2021";
        String time = "18:00";
        String cause = "Flu";
        Schedule instance = new Schedule();
        Medical_Appointment appointment = new Medical_Appointment(name, date, time, cause);
        String expResult = "Medical appointment scheduled. " + appointment;
        String result = instance.addNew_Appointment(name, date, time, cause);
        assertEquals(expResult, result);

    }
   
}
