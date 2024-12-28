package dto;

import enums.GenderType;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 */
public class MedicalProfessionaldto {
    
    private String firstname;
    private String lastname;
    private String email;
 
    private String specialization;
        private GenderType gender;

    public MedicalProfessionaldto(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.specialization = specialization;
        this.gender = gender;
    }

    public MedicalProfessionaldto() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    
   
    
    
    
    
    

   
    
    
    
    
    
    
    
    
    
    
    
}
