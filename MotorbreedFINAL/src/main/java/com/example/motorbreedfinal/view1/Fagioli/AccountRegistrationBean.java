package com.example.motorbreedfinal.view1.Fagioli;

import java.util.regex.Pattern;

public class AccountRegistrationBean {

    private String email;

    private String firstPassword;

    private String secondPassword;

    private String firstName;

    private String lastName;

    public boolean emailValidation(){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        return(pat.matcher(email).matches());
        //scrivere controllo sulla password (Una maiuscola, un numero ALMENO)

    }

    public boolean checkfirstName(){
        return (!(firstName == null) &&!firstName.isEmpty());
    }

    public boolean checklastName(){
        return (!(lastName == null) &&!lastName.isEmpty());
    }

    public boolean checkPasswords(){
        // scrivere controllo su password;

        return firstPassword.equals(secondPassword);
    }
}
