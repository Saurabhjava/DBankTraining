package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDao {
	static Connection con;
	static {
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","scott","tiger");
			System.out.println("Connect with Database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printAllEmployee() {
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from employee"); //To read the data 
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmployeeID");
		int empid=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, empid);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, salary);
			int rows=ps.executeUpdate(); //DML
			if(rows>0)
				System.out.println("Employee Created...");
			
		} catch (SQLException e) {
			System.out.println("Employee Not created "+e.getMessage());
		}
	}
	public void updateEmployeeEmail(int empid,String newEmail) {
		
	}
	public void deleteEmployee() {
		
	}
}
