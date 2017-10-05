/**
 * purpose: Database Meta Data 
 * @author ragini
 */
package com.bridgelabz.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.DatabaseMetaData;

public class DatabaseMetaDataEg {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Jdbc Database Meta Data");
		Class.forName("com.mysql.jdbc.Driver");

		String URL = "jdbc:mysql://localhost:3306/mydatabase";
		String USER = "root";
		String PASS = "root";

		Connection con = DriverManager.getConnection(URL, USER, PASS);

		DatabaseMetaData dbMetaData = (DatabaseMetaData) con.getMetaData();
		System.out.println("Driver name: " + dbMetaData.getDriverName());
		System.out.println("Driver version: " + dbMetaData.getDriverMajorVersion());
		System.out.println("Driver major version: " + dbMetaData.getDriverMajorVersion());
		System.out.println("Driver  URL: " + dbMetaData.getURL());
		System.out.println("Driver Name of db: " + dbMetaData.getUserName());
		System.out.println("Driver ProductNmae: " + dbMetaData.getDatabaseProductName());
	}
}
