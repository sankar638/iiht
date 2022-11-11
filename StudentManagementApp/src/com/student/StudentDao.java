package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean addStudentToDB(Student st) {
		boolean status=false;
		try {

			Connection con = ConnectionProvider.create();
			String query1 = "insert into students(sname,phone,scity)" + " values(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();
			status=true;

		} catch (Exception e) {

		}
		
		return status;
	}
	
	
	public static boolean deleteStudent(int studentId) {
		boolean status=false;
		try {
			

			Connection con = ConnectionProvider.create();
			String query1 = "delete from students where sid=?";

			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setInt(1,studentId);
			
			
			pstmt.executeUpdate();
			status=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return status;
		
	}


	public static boolean getAllStudents() {
		
		boolean status=false;
		try {
			

			Connection con = ConnectionProvider.create();
			String query1 = "select * from students";

			Statement stmt = con.createStatement();
			ResultSet set= stmt.executeQuery(query1);
				
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("sCity");
				
				System.out.println("ID: "+id);
				System.out.println("name: "+name);
				System.out.println("phone: "+phone);
				System.out.println("city: "+city);
				System.out.println("====================================================");
				
			}
			status=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return status;
		

		
	}

}
