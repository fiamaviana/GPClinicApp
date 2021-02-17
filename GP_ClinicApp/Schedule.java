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
public class Schedule {
    ArrayList<Medical_Appointment> schedules;
    
    public Schedule(){
        this.schedules = new ArrayList<Medical_Appointment>();
    }
    
       
    public String addNew_Appointment(String name, String date, String time, String cause) {
        Medical_Appointment appointment = new Medical_Appointment(name, date, time, cause); 
        if (schedules.isEmpty()){
            this.schedules.add(appointment);
            return "Medical appointment scheduled. " + appointment;
        }
        else{
             if(appointment.getDate().equals(date) && appointment.getTime().equals(time)){
                return "This date and time is not available. ";
             }
             else{
                this.schedules.add(appointment);
                return "Medical appointment scheduled. " + appointment;
             }
        }  
    }
    
}
