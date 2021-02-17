package com.gpclinic.gp_clinic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fiama
 */
public class GpClinic {

    public static void main(String[] args){
        /*This code will add a new Secretary*/
        Secretary newSecretary = new Secretary(001, "Mary Louis", "Parnel Street", "marylouis@gmail.com", "111 222 333");
        System.out.println(newSecretary.toString());
        
        /*To add new Patients */
        patients newPatient = new patients();
        String addNew_Patient = newPatient.addPatients(001, "Fiama Viana", "Spencer Dock", "fiamaviana@gmail.com", "333 444 555");
        System.out.println(addNew_Patient); 
        
        /*To add a new appointment*/        
        Schedule appointment = new Schedule();
        String addNew_Appointment = appointment.addNew_Appointment("Fiama Viana","12-26-2020","14:00","Fever");
        System.out.println(addNew_Appointment);  
        
        /*Trying to make an appointment in the same date and time that was already scheduled*/
        String addN_Appointment = appointment.addNew_Appointment("Joao Viana","12-26-2020","14:00","Fever");
        System.out.println(addN_Appointment);
        
    }
}

