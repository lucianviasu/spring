package com.sda.spring.dto;


public class CompanyCreateDto {

    private String name;

    private String registrationNumber;

    private String address;

    private String phoneNumber;

    private String email;

    public String getName() {
        return name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
