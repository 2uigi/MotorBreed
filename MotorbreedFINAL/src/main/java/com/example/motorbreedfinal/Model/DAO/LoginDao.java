package com.example.motorbreedfinal.Model.DAO;

import com.example.motorbreedfinal.Model.Service.Connector;
import com.example.motorbreedfinal.Model.Service.Query;

import javax.security.auth.login.FailedLoginException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
    public String checkCredentials(String email, String password) throws SQLException {

        Statement stmt = null;
        Connection conn = null;
        String role = null;

        try {
            conn = Connector.getInstance().getConnection();

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = Query.checkSignedUserByEmail(stmt, email);

            if (!rs.first()){
                throw new FailedLoginException("email not registered!");
            }
            rs.first();
            do{
                // verify pw is correct

                String foundPassword = rs.getString("password");
                if(foundPassword.equals(password)) {
                    role = rs.getString("role");
                }else{
                    throw new FailedLoginException("Wrong password!");
                }


            }while(rs.next());


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FailedLoginException e) {
            throw new RuntimeException(e);
        } finally {
            if(stmt != null){
                stmt.close();
            }

        }

        return role;
    }


}
