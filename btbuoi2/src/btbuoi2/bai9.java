package btbuoi2;

import java.util.Scanner;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String text1 = " Nam ";
		final String text2 = " Nu ";
		
		String ten1,ten2,ten3;
		int tuoi1,tuoi2,tuoi3;
		String gioiTinh1,gioiTinh2,gioiTinh3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Can bo thu nhat: ");
		scan.nextLine();
		System.out.print("Ten: ");
		ten1 = scan.nextLine();
		System.out.print("Tuoi: ");
		tuoi1 = scan.nextInt();
		System.out.print("Gioi tinh: ");
	    gioiTinh1 = scan.nextLine();
	    scan.nextLine();
		

		System.out.print("Can bo thu hai: ");
		scan.nextLine();
		System.out.print("Ten: ");
		ten2 = scan.nextLine();
		System.out.print("Tuoi: ");
		tuoi2 = scan.nextInt();
		System.out.print("Gioi tinh: ");
	    gioiTinh2 = scan.nextLine();
	    scan.nextLine();
		

		System.out.print("Can bo thu ba: ");
		scan.nextLine();
		System.out.print("Ten: ");
		ten3 = scan.nextLine();
		System.out.print("Tuoi: ");
		tuoi3 = scan.nextInt();
		System.out.print("Gioi tinh: ");
	    gioiTinh3 = scan.nextLine();
	    scan.nextLine();
		
	    System.out.print("Can bo nam tre tuoi nhat la: ");
	    if(gioiTinh1 == text1) {System.out.println("Can bo nam tre tuoi nhat la: ");}
	    if( tuoi1 < tuoi2 && tuoi1 < tuoi3) {System.out.print(ten1);}
	    	
	    if(gioiTinh2 == text1) {System.out.println("Can bo nam tre tuoi nhat la: ");}
	    if( tuoi2 < tuoi1 && tuoi2 < tuoi3) {System.out.print(ten2);}
	 
	    if(gioiTinh3 == text1) {System.out.println("Can bo nam tre tuoi nhat la: ");}
	    if( tuoi3 < tuoi2 && tuoi3 < tuoi1) {System.out.print(ten3);}
		
		
		
		
		
		
		
	}

}
