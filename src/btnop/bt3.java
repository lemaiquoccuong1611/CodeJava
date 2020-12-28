package btnop;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bt3 {

	public static void main(String[] args) {
	final float TI_GIA = (float) 23.500;		 	 	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Nhap gia USD:");
	int usd;
	usd = scan.nextInt(); 			
		 
	
	float vnd = (float)(usd*TI_GIA);	
	
	DecimalFormat dcf = new DecimalFormat("###,###.000");
	String text = "Gia tien VND la:"+ dcf.format(vnd);
	
	System.out.print(text); 
	
		
	
		
		
	}

}
