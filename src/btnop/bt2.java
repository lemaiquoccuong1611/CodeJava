package btnop;

import java.util.Scanner;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float a,b,c,d,e;
        Scanner scan = new Scanner(System.in);
        
		System.out.print("So thu nhat:");
		a = scan.nextFloat();
		
		System.out.print("So thu hai:");
		b = scan.nextFloat();
		
		System.out.print("So thu ba:");
		c = scan.nextFloat();
		
	    System.out.print("So thu tu:");
	    d = scan.nextFloat();
	    
	    System.out.print("So thu nam:");
		e = scan.nextFloat();
		
		float g;
		g = (a+b+c+d+e)/5;
		System.out.println("Gia tri trung binh cua 5 so :"+ g);
		
		
		
		
		
		
		
		
		
	}

}
