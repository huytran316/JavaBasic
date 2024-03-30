package com.basic.bai1;

import java.util.Scanner;

public class MyMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculateUtils obj = new CalculateUtils();
		System.out.println("Nhap so thu nhat x= ");
		double x = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhap so thu hai y= ");
		double y = sc.nextDouble();
		sc.nextLine();
		String a = Double.toString(obj.tinhCong(x, y));
		String b = Double.toString(obj.tinhTru(x, y));
		String c = Double.toString(obj.tinhNhan(x, y));
		String d = Double.toString(obj.tinhChia(x, y));
		System.out.println("Nhap lenh Action= ");
		String Action = sc.nextLine();
		Action = Action.toUpperCase();
		String sum = "CONG";
		String sub = "TRU";
		String mul = "NHAN";
		String div = "CHIA";
		if(Action.equals(sum)) {		
			System.out.println("Ket qua = " + a); 
		}else if(Action.equals(sub)) {
			System.out.println("Ket qua = " + b);
		}else if(Action.equals(mul)) {
			System.out.println("Ket qua = " + c);
		}else if(Action.equals(div)) {
			System.out.println("Ket qua = " + d);
		}else {
			System.out.println("Gia tri Action khong hop le");
		}
		
	}
}
