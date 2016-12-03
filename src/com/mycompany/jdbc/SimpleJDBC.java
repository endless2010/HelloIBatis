package com.mycompany.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SimpleJDBC {
	public static final String url = "jdbc:mysql://127.0.0.1:3306/testdb";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "root";

	public static void main(String[] args) {
		String sql = "select *from student";
		try(Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet ret = pst.executeQuery();) {
			
			while (ret.next()) {
				String id = ret.getString(1);
				String name = ret.getString(2);
				System.out.println("id:"+id+",name="+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
}
