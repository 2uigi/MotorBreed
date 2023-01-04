package com.example.motorbreedfinal.Model.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {

    private Query() {}

    public static ResultSet checkSignedUserByEmail(Statement stmt, String credential) throws SQLException {
        String selectStatement = String.format("SELECT * FROM user WHERE (email = '%s' OR username = '%s')", credential, credential);
        return stmt.executeQuery(selectStatement);
    }
}
