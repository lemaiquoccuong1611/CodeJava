package btnop;

import java.util.Scanner;

public class bt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        Scanner scan = new Scanner(System.in);
        
		System.out.print("So co 2 chu so :");
		a = scan.nextInt();
		
		int b,c;
		
		b = a%10;
		System.out.println("So hang don vi:"+ b);
		c = a/10;
		System.out.println("So hang chuc:"+ c);
		int d;
		d = b+c;
		
		System.out.println("Tong 2 ky so vua nhap la:"+d);
		
		
		
		
		
		
		
		
		
		
	}

}
