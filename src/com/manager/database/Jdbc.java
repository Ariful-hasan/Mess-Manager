package com.manager.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Jdbc {

    Connection con;
    PreparedStatement psmnt = null;
    String sql;
    static String rst = "";
    boolean status = true;
    static ResultSet result_stat;
    static Statement st_stat;
    public static Properties prop;

    public boolean connection() {

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super?useUnicode=true&amp;characterEncoding=UTF8;", "root", "123");///////
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hossain","root","1");
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //  con=DriverManager.getConnection("jdbc:odbc:sudent_2","","");///////
        } catch (SQLException e) {
            status = false;
            System.out.println("Driver error SQL");
        } catch (Exception ee) {
            System.out.println("Driver error");
            status = false;
        }
        return status;
    }

    public void connectionclose() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("connection close error");
        }
    }

    public boolean createTable(String sql) {

        try {
            Statement stms = con.createStatement();
            int i = stms.executeUpdate(sql);
            if (i == 1) {
                System.out.println("create table ");
                stms.close();
                status = true;
            }

        } catch (SQLException e) {
            System.out.println(e + "create table errorASDF");
           // e.printStackTrace();
            
            status = false;
        }

        return status;

    }

    public boolean show_table_element(String par) {
        int i = 0;
        try {
            Statement st = con.createStatement();

            ResultSet result = st.executeQuery(par);
            while (result.next()) {
                i = 1;

                rst = result.getString(1);

            }
            st.close();

        } catch (SQLException e) {
            System.out.println("show table element error");
        }

        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    public String findResult(String par) {
        int i = 0;
        String rlt = "";
        try {

            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(par);
            while (result.next()) {
                rlt = result.getString(1);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e + "show findResult error");
        }
        return rlt;
    }

    public ResultSet find_statement(String par) {
        int i = 0;
        String stat = " ";
        try {

            st_stat = con.createStatement();
            result_stat = st_stat.executeQuery(par);

        } catch (SQLException e) {
            System.out.println(e + "show findResult error");
        }

        return result_stat;
    }

    public double FindResult(String par) {
        double i = 0;
        
       String rlt = "";

        try {

            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(par);
            
            while (result.next()) {
                rlt = result.getString(1);
            }

            st.close();
            i = Float.valueOf(rlt);
        } catch (SQLException e) {
            System.out.println(e + "show findResult error");
        }
        return i;
    }

    public PreparedStatement pre(String pst) {
        try {
            //psmnt=con.prepareStatement(("insert into save_image(name, city, image, Phone) "+ "values(?,?,?,?)"));
            psmnt = con.prepareStatement(pst);
        } catch (Exception ex) {
        }
        return psmnt;
    }

   // public static void main(String a[]){}
}
