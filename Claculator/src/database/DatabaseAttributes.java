/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Administrator
 */
public abstract class DatabaseAttributes {
    //for microsoft access database 
//     String driverDB="sun.jdbc.odbc.JdbcOdbcDriver";
//     String urlDB="jdbc:odbc:semsem";
//    
//    
    //for oracle Express database
    
        String driverDB="oracle.jdbc.driver.OracleDriver";
        String urlDB="jdbc:oracle:thin:@localhost:1521:xe";
        String userName="hr";
        String password="hr";
     
     public abstract String getDriverDB();
     public abstract String getUrlDB();
     public abstract String getDBUsername();
     public abstract String getDBPassword();
    
     
    
}
