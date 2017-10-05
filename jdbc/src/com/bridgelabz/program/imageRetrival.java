/**
 * purpose: retrieve image from data base
 * @author ragini
 */
package com.bridgelabz.program;

import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;

public class imageRetrival {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		System.out.println("jdbc image retrival!!!");
		try {
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded & Rrgisterd");

			String URL = "jdbc:mysql://localhost:3306/mydatabase";
			String USER = "root";
			String PASS = "root";
			con = DriverManager.getConnection(URL, USER, PASS);

			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from emp");
			ResultSet resultSet = ps.executeQuery();

			if (resultSet.next()) {// now on 1st row
				Blob b = (Blob) resultSet.getBlob(4);// 4 means 4nd column data
				byte barr[] = b.getBytes(1, (int) b.length());// 1 means first
																// image

				FileOutputStream fout = new FileOutputStream("/home/bridgeit/Pictures/Wallpapers/img1.png");
				fout.write(barr);

				fout.close();
			} // end of if
			System.out.println("ok!!!");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnLabel(i + 1) + "\t");
			}
			System.out.println("\n______________________________________");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getDouble(3)
						+ "\t" + resultSet.getString(4));
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
