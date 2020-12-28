package btbuoi2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int soNguyen,so1,so2,so3 ;
       Scanner scan = new Scanner(System.in);
       System.out.print("Nhap so nguyen: ");
       soNguyen = scan.nextInt();
	   so1 = soNguyen/100;
	   so2 = (soNguyen/10)%10;
	   so3 = soNguyen%10;
       
	   System.out.print("So do la: ");
	   if (so1 == 1) { System.out.print("Một trăm");}
	   else if( so1 ==2) {System.out.print("Hai tram");}
	   else if( so1 ==3) {System.out.print("Ba tram");}
	   else if (so1 ==4) {System.out.print("Bon tram");}
	   else if ( so1==5) {System.out.print("Nam tram");}
	   else if (so1 ==6) {System.out.print("Sau tram");}
	   else if (so1 ==7) {System.out.print("Bay tram");}
	   else if ( so1==8) {System.out.print("Tam tram");}
	   else if ( so1==9) {System.out.print("Chin tram");}
		
	   if ( so2 == 0 ) {System.out.print(" le");}
	   else if( so2 ==1) {System.out.print(" muoi");}
	   else if( so2 ==2) {System.out.print(" hai muoi");}
	   else if( so2 ==3) {System.out.print(" ba muoi");}
	   else if( so2 ==4) {System.out.print(" bon muoi");}
	   else if( so2 ==5) {System.out.print(" nam muoi");}
	   else if( so2 ==6) {System.out.print(" sau muoi");}
	   else if( so2 ==7) {System.out.print(" bay muoi");}
	   else if( so2 ==8) {System.out.print(" tam muoi");}
	   else if( so2 ==9) {System.out.print(" chin muoi");}
	   
	   if (so3 == 0); {System.out.print("");}
	   if (so3 == 1) {System.out.print(" mot");}
	   else if( so3 ==2) {System.out.print(" hai");}
	   else if( so3 ==3) {System.out.print(" ba");}
	   else if( so3 ==4) {System.out.print(" bon");}
	   else if( so3 ==5) {System.out.print(" nam");}
	   else if( so3 ==6) {System.out.print(" sau");}
	   else if( so3 ==7) {System.out.print(" bay");}
	   else if( so3 ==8) {System.out.print(" tam");}
	   else if( so3 ==9) {System.out.print(" chin");}	
	 
	   
	   
	   
	   
	  
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   }
		
		
		
	}


