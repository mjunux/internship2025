package com.example.internship.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchValueClass {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root_password";
        String sql = "select * from investmentTrust_table_2;";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement statement = con.createStatement();
        ResultSet resultset = statement.executeQuery(sql));
        while(resultset.next()){
            int money = resultset.getString("money");
        }
}
