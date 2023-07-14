package com.bootcoding.java.oops.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //load and register the driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //establish the connection
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");

        //create Statement object
        Statement statement= connection.createStatement();

        //execute the query
        String sql="insert into ftab values(1133,'BANTI',3000,20)";
        int n= statement.executeUpdate(sql);

        System.out.println(n + " record inserted ");
        if(connection!=null){
            connection.close();
        }

    }
}
