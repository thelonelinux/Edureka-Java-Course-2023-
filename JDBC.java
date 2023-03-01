package com.JDBCProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class JDBC {

    public static void main(String args[])throws Exception
    {

        //Class.forName("oracle.jdbc.driver.OracleDriver");
       // Class.forName("Edureka java Class 5.libraries.com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
       // com.mysql.cj.jdbc.Driver
        System.out.println("Driver loaded...");

        //Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","charan");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vickyDB","root","T***G**_**3");
        System.out.println("Connected to the database");

        Statement st=con.createStatement();

        System.out.println("Before creating the table...");
        st.execute("create table student(no varchar(10),name varchar(20))");
        System.out.println("table created");

          st.executeUpdate("insert into student values('109', 'Tenzin')");
          System.out.println("  row inserted");

//        st.executeUpdate("update student set name='kevin mathew' where name='kevin'");
//        System.out.println("row updated");

        con.close();
        System.out.println("Connection closed...");

    }
}
