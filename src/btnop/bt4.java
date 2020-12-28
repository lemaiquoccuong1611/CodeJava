package btnop;

import java.util.Scanner;

public class bt4 {

public static void main(String[] args) {
	// Cho người dùng nhập vào bán kính của 1 hình tròn.
	// Tính chu vi và diện tích của hình tròn đó.
	
	
	double a,b;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Chieu dai la :");
	a = scan.nextDouble();
	
	System.out.println("Chieu rong la :");
	b = scan.nextDouble();
	
	double c,d;
	
	c = a*b;
	System.out.println("Dien tich la:"+ c);
	
    d = (a+b)*2;
    System.out.println("Chu vi la:"+ d);
}}
