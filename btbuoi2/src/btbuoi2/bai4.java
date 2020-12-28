package btbuoi2;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final String text1 = "Đây là tam giác đều";
        final String text2 = "Đây là tam giác cân";
        final String text3 = "Đây là tam giác vuông";
		final String text4 = "Đây là tam giác vuông cân";
		final String text5 = "Đây là tam giác thường";
		final String text6 = "Đây không phải là tam giác";
		
        
        
        
		double a,b,c;
        String text ="";
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        System.out.println("Canh 1: "+ a);
        System.out.println("Canh 2: "+ b);
        System.out.println("Canh 3: "+ c);
        
		
		if(a==b && b==c) {System.out.print(text = text1);}
		else if (a==b || b==c || a==c) {System.out.print(text = text2);}
		else if (a== Math.sqrt(Math.pow(b, 2)+Math.pow(c,2)) 
				||b == Math.sqrt(Math.pow(a,2)+Math.pow(c,2))
				||c == Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)))
		{System.out.print(text = text3);}
		else if (a+b<c || a+c < b || b +c < a) {System.out.print(text = text6);}
		else if (a+b>c || a+c>b || b+c>a ){System.out.print(text = text5);}
		else if (a ==b && c ==Math.sqrt((b*b)+(a*a)) 
				||a ==c && b ==Math.sqrt((a*a)+(c*c))
				|| b==c && a ==Math.sqrt((b*b)+(c*c)))
				{System.out.print(text = text4);}
				
			
				
		
				
			
	
	
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}


