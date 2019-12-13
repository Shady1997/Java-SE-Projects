/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class Database extends DatabaseAttributes implements NewDatabaseConn,NewDatabaseSt{

    Connection conn;
    Statement st;
    ResultSet rs;
    String username="admin";
    String pass="admin";
    String sql = "select * from users where username = '" + username + "' and password = '" + pass + "'";
    
    
    public ResultSet rs()
    {
        newConnection();
        return rs;
    }
    
    
    
    @Override
    public void newConnection() {
        try { 
              Class.forName(driverDB);
//            conn = DriverManager.getConnection(db1.getUrlDB());
              conn = DriverManager.getConnection(urlDB,userName,password); 
              newStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public void newStatement() {

        try {
             st = conn.createStatement();
             rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    
    
    
    @Override
    public String getDriverDB() {
        return driverDB;     
    }

    @Override
    public String getUrlDB() {
       return urlDB;
    }

    @Override
    public String getDBUsername() {
      return userName;
    }

    @Override
    public String getDBPassword() {
        return password;
    }

   
}
