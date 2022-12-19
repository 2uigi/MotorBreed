package com.example.motorbreedfinal.Model.Service;

import java.sql.Connection;

public class Connector {

    private static final String USER = null;
    private static final String PASS = null;
    private static final String DB_URL = null;

    private static Connector instance = null;
    private Connection conn = null;

    private Connector(){
        //costruttore con qualcosa del tipo crea connessione
    }

    public static Connector getInstance(){
        if(instance == null){
            instance = new Connector();
        }
        return instance;
    }

    public Connection getConnection(){
        return conn;
    }

}


