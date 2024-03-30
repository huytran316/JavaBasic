package com.basic.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hoten, diachi, gioitinh, ngaysinh = null;
		float diem = 0;
		String s = null;
		
		
		ArrayList<Student> students = new ArrayList<>();
		
			do {
				System.out.print("Nhap ho ten: ");
				hoten = sc.nextLine();
				
				System.out.print("Nhap dia chi: ");
				diachi = sc.nextLine();
				
				boolean validDob = false;
				
				while(!validDob) {
					try {
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
						System.out.print("Nhap ngay sinh(dd/mm/yyyy): ");
						ngaysinh= sc.nextLine();
						dateFormat.parse(ngaysinh);
						validDob = true;
					}catch(ParseException e) {
						System.out.println("Ngay sinh khong hop le, vui long nhap lai!");
						}
					} 
				System.out.print("Nhap gioi tinh: ");
				gioitinh = sc.nextLine();
				
				boolean validGrade = false;
				
				while(!validGrade) {
					try {
						System.out.print("Nhap diem trung binh mon: ");
						diem = sc.nextFloat();
						sc.nextLine();
						if(diem < 0 || diem >10 ) {
							System.out.println("Diem khong hop le, vui long nhap lai");
							validGrade = false;
						}else validGrade = true;
					}catch(Exception e) {
						System.out.println("Diem khong hop le, vui long nhap lai");
						sc.nextLine();
						}
					}
				Student student = new Student(hoten, diachi, ngaysinh, gioitinh, diem);
				students.add(student);
			
				System.out.println("Do you want to continue (Y/N)?");
				s = sc.nextLine().toUpperCase();
			}while(s.equals("Y"));
			
			for(int i=0; i<students.size();i++) {
				System.out.println(" ");
				System.out.println("Student "+(i+1)+":");
				System.out.println("FullName: "+ students.get(i).getfullName());
				System.out.println("Address: "+ students.get(i).getaddress());
				System.out.println("Dob: "+ students.get(i).getdob());
				System.out.println("Gender: "+ students.get(i).getgender());
				System.out.println("finalGrade: "+ students.get(i).getfinalGrade());			
			}
			float tongdiem = 0;
			float dtb = 0;
			
			for(int i =0; i < students.size();i++) {
				if(students.get(i).getfinalGrade()<4) {
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc kem");
				}else if(students.get(i).getfinalGrade()>=4 && students.get(i).getfinalGrade()<5) {
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc yeu");
				}else if(students.get(i).getfinalGrade()>=5 && students.get(i).getfinalGrade()<5.5) {
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc trung binh yeu");
				}else if(students.get(i).getfinalGrade()>=5.5 && students.get(i).getfinalGrade()<6.5) {
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc trung binh");
				}else if(students.get(i).getfinalGrade()>=6.5 && students.get(i).getfinalGrade()<7) {
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc trung binh kha");
				}else if(students.get(i).getfinalGrade()>=7 && students.get(i).getfinalGrade()<8) {
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc kha");
				}else if(students.get(i).getfinalGrade()>=8 && students.get(i).getfinalGrade()<8.5) {
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc kha gioi");
				}else{
					System.out.println("Hoc sinh "+ students.get(i).getfullName() + " hoc luc gioi");
				}
				tongdiem += students.get(i).getfinalGrade();
			}
			dtb = tongdiem/students.size();
			System.out.println("Diem tong ket trung binh cua danh sach hoc sinh: " +dtb+ "/" + students.size() + " hoc sinh");
	}
}
