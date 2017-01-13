/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MR
 */
public class DbConnection {
      
private static DbConnection dbCon;
	
	private DbConnection(){
		
	}
	
	public static DbConnection getInstance(){
		if(dbCon==null){
			dbCon=new DbConnection();
		}
		return dbCon;
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
                // For Mysql 
//		Class.forName("com.mysql.jdbc.Driver");
//		con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
		// for ms sql 
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		con = DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=admin;database=qep");
		

                return con;
	}
}

