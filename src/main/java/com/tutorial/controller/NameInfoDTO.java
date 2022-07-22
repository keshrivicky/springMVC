package com.tutorial.controller;
public class NameInfoDTO {
  
    // Provided some static values
    // inside the variable
    // And we are going to read these values
    private String firstName = "Anshul";
    private String lastName = "Aggarwal";
  
    public String getFirstName() {
        return firstName;
    }
  
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
  
    public String getLastName() {
        return lastName;
    }
  
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  
    @Override
    public String toString() {
        return "NameInfoDTO [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
  
}