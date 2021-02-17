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
public class SecretaryTest {
    
    public SecretaryTest() {
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
     * Test of getId method, of class Secretary.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Secretary instance = new Secretary();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setId method, of class Secretary.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Secretary instance = new Secretary();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getName method, of class Secretary.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setName method, of class Secretary.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Secretary instance = new Secretary();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getAddress method, of class Secretary.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of setAddress method, of class Secretary.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Secretary instance = new Secretary();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getEmail method, of class Secretary.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setEmail method, of class Secretary.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Secretary instance = new Secretary();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getPhoneNumber method, of class Secretary.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setPhoneNumber method, of class Secretary.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        Secretary instance = new Secretary();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of toString method, of class Secretary.
     */
    @Test
    public void testToString() {
        int id = 0;
        String name = "";
        String address = "";
        String email = "";
        String phoneNumber = "";
        System.out.println("toString");
        Secretary instance = new Secretary();
        String expResult = "Secretary{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
