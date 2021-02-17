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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of getId method, of class Patient.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setId method, of class Patient.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Patient instance = new Patient();
        instance.setId(id);
     
    }

    /**
     * Test of getName method, of class Patient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setName method, of class Patient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Patient instance = new Patient();
        instance.setName(name);
       
    }

    /**
     * Test of getAddress method, of class Patient.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAddress method, of class Patient.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Patient instance = new Patient();
        instance.setAddress(address);
      
    }

    /**
     * Test of getEmail method, of class Patient.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setEmail method, of class Patient.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Patient instance = new Patient();
        instance.setEmail(email);
     
    }

    /**
     * Test of getPhoneNumber method, of class Patient.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setPhoneNumber method, of class Patient.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        Patient instance = new Patient();
        instance.setPhoneNumber(phoneNumber);
       
    }

    /**
     * Test of toString method, of class Patient.
     */
    @Test
    public void testToString() {
        
        System.out.println("toString");
        int id = 0;
        String name = "";
        String address = "";
        String email = "";
        String phoneNumber = "";
        Patient instance = new Patient();
        String expResult = "Patient{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
