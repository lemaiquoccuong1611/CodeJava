package btbuoi2;

import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		final String text1 = "Chan";
		final String text2 = "Le";
		
		int soChan = 0,soLe = 0;
		int soNguyen1,soNguyen2,soNguyen3;
		String soC= "Chan",soL= "Le";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" So nguyen thu nhat la: ");
		soNguyen1 = scan.nextInt();
		
		System.out.print(" So nguyen thu hai la: ");
		soNguyen2 = scan.nextInt();
		
		System.out.print(" So nguyen thu ba la: ");
		soNguyen3 = scan.nextInt();
		
		System.out.print("So nguyen thu nhat la: ");
		if(soNguyen1 % 2 == 1 ) {System.out.println( text2);}
		else if (soNguyen1 % 2 ==0 ) {System.out.println(text1);}
		if(soC == text1  ) { ++soChan ;}
		else if(soL == text2) { ++soLe ;}
		
		System.out.print("So nguyen thu hai la: ");
		if(soNguyen2 % 2 == 1 ) {System.out.println( text2);}
		else if (soNguyen2 % 2 ==0 ) {System.out.println(text1);}
		if(soC == text1  ) {++soChan ;}
		else if(soL == text2) { ++soLe ;}
		
		
		System.out.print("So nguyen thu ba la: ");
		if(soNguyen3 % 2 == 1 ) {System.out.println( text2);}
		else if (soNguyen3 % 2 ==0 ) {System.out.println(text1);}
		if(soC == text1  ) { ++soChan ;}
		else if(soL == text2) { ++soLe ;}
		
		
		System.out.print("Tong so chan la: ");
		if(soC == text1  ) {System.out.println( soChan );}
		
		System.out.print("Tong so le la: ");
		if(soL == text2  ) {System.out.println( soLe );}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
