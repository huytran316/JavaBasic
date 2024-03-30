package com.basic.bai2;

import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		do {
		System.out.println("Nhap so nguyen N");
		N = sc.nextInt();
		}while(N<=0);
			System.out.println("N = " + N);
		
		int tongChan = 0;
		int tongLe = 0;
		int count = 0;
		
			for(int i=1; i<=N; i++) {
				if(i%2!=0) {
					tongLe += i;
				}
				if(i%2==0) {
					tongChan += i;
				}
				if(i%3==0 && i%2!=0) {
					count++;
				}
			}
			System.out.println("Tong cac so chan la: " + tongChan);
			System.out.println("Tong cac so le la: " + tongLe);
			System.out.println("Co " + count + " so chia het cho 3 nhung khong chia het cho 2");
		
		}
	}

