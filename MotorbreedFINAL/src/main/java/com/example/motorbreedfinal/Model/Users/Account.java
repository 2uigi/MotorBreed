package com.example.motorbreedfinal.Model.Users;

public abstract class Account {
    private String firstName;
    private String lastName;
    private String username;
    private String idAccount;
    private String email;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public String getEmail() {
        return email;
    }



}
