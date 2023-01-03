package com.example.motorbreedfinal.Model.DAO;

import com.example.motorbreedfinal.Model.Service.Connector;
import com.example.motorbreedfinal.Model.Service.Query;
import com.example.motorbreedfinal.Model.Users.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AccountDao {

  Statement stmt = null;
  Connection conn = null;

  String role = null;

  public void setAccount(Account account, String email) throws SQLException {
    try {
      conn = Connector.getInstance().getConnection();

      stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
      ResultSet rs = Query.checkSignedUserByEmail(stmt, email);

      rs.first();

      account.setFirstName(rs.getString("firstName" ));
      account.setLastName(rs.getString("lastName"));
      account.setEmail(rs.getString("email"));
      account.setUsername(rs.getString("username"));



  } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if(stmt!=null){
        stmt.close();
      }
    }
  }
}
