/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpclinic.gp_clinic;

/**
 *
 * @author jvcv7
 */
public class Medical_Appointment {
    private String name;
    private String date;
    private String time;
    private String cause;
    
    public Medical_Appointment(String name, String date, String time, String cause) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.cause = cause;
    }

    public Medical_Appointment() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String toString() {
        return "Medical_Appointment{" + "name=" + name + ", date=" + date + ", time=" + time + ", cause=" + cause + '}';
    }
    
}
