package com.stu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.Student;
import com.student.StudentDao;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello word..");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit the app");
			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// add student
				System.out.println("Enter student name");
				String name = br.readLine();
				
				System.out.println("Enter student phone number");
				String phone = br.readLine();
				
				System.out.println("Enter student city");
				String city = br.readLine();
				
				Student st=new Student(name, phone, city);
				
				System.out.println(st);
				boolean answer = StudentDao.addStudentToDB(st);
				
				if(answer) {
					System.out.println("student added sucessfully");
					
				}else {
					System.out.println("student not added sucessfully");
					
				}
				
				
				
				
			} else if (choice == 2) {
				// delete student
				
				System.out.println("Enter student id to delete:");
				int studentId=Integer.parseInt(br.readLine());
				boolean answer =StudentDao.deleteStudent(studentId);
				
				if(answer) {
					System.out.println("student deleted sucessfully");
					
				}else {
					System.out.println("student not deleted sucessfully");
					
				}
				
				
				
			} else if (choice == 3) {
				
				StudentDao.getAllStudents();
				
				
			} else if (choice == 4) {
				// exit student
			} else {

			}
			System.out.println("Thanks for using student management system.");
		}

	}

}
