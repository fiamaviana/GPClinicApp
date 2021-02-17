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
public class patientsTest {
    
    public patientsTest() {
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
     * Test of addPatients method, of class patients.
     * @return 
     */
    @Test
    public void testAddPatients() {
        System.out.println("addPatients");
        int id = 1;
        String name = "Josy Reis";
        String address = "Dame Street";
        String email = "josy@gmail.com";
        String phoneNumber = "123 456 789";
        patients instance = new patients();
        Patient newPatient = new Patient(id, name, address, email, phoneNumber);
        String expResult = "New Patient added. " + newPatient;
        String result = instance.addPatients(id, name, address, email, phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult,result);
    }
}
