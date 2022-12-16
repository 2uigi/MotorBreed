package com.example.motorbreedfinal.view1.Fagioli;

import java.util.regex.Pattern;

public class LoginBean {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;
    private String password;

    public LoginBean(){
    }

    public boolean Validation(){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        return(pat.matcher(email).matches());
        //scrivere controllo sulla password (Una maiuscola, un numero ALMENO)

    }


}
