package btbuoi2;

import java.util.Scanner;

public class bt10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ten1,ten2,ten3;
		double x1,x2,x3,y1,y2,y3;
        double x=0,y=0;
        double doDai1,doDai2,doDai3;
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.print("Toa do cua truong la: ");
        String text = String.format(" ( " + x ) + "," + y + " ) ";
        System.out.println(text);
        
       
        System.out.print("Sinh vien thu nhat:");
        scan.nextLine();
        System.out.print("Ten: ");
        ten1 = scan.nextLine();
        System.out.println("Toa do: ");
        x1 = scan.nextDouble();
    	y1 = scan.nextDouble();
        String text1 = String.format(" ( " + x1 ) + "," + y1 + " ) ";
        System.out.println(text1);
        scan.nextLine();        
        
        
        System.out.print("Sinh vien thu hai:");
        scan.nextLine();
        System.out.print("Ten: ");
        ten2 = scan.nextLine();        
        System.out.println("Toa do: ");
        x2 = scan.nextDouble();
    	y2 = scan.nextDouble();
        String text2 = String.format(" ( " + x2 ) + "," + y2 + " ) ";
        System.out.println(text2);
        scan.nextLine();
        
        
        System.out.print("Sinh vien thu ba:");
        scan.nextLine();
        System.out.print("Ten: ");
        ten3 = scan.nextLine();
        System.out.println("Toa do: ");
        x3 = scan.nextDouble();
    	y3 = scan.nextDouble();
        String text3 = String.format(" ( " + x3 ) + "," + y3 + " ) ";
        System.out.print(text3);
        
        doDai1 = Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
        doDai2 = Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
        doDai3 = Math.sqrt(((x3-x)*(x3-x))+((y3-y)*(y3-y)));
		
        
        System.out.println("Sinh vien o xa truong nhat la: ");
		if (doDai1 > doDai2 && doDai1 > doDai3) {System.out.print(ten1);}
		
		if (doDai2 > doDai1 && doDai2 > doDai3) {System.out.print(ten2);}

		if (doDai3 > doDai1 && doDai3 > doDai2) {System.out.print(ten3);}
		
		
		
		
		
		
	}

}
