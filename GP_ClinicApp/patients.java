/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpclinic.gp_clinic;

import java.util.ArrayList;

/**
 *
 * @author jvcv7
 */
public class patients {
    ArrayList<Patient> patient;
    
    public patients(){
        this.patient = new ArrayList<Patient>();
    }
    public String addPatients(int id, String name, String address, String email, String phoneNumber) {
        Patient newPatient = new Patient(id, name, address, email, phoneNumber);
        this.patient.add(newPatient);
        return "New Patient added. " + newPatient;
   }
}
