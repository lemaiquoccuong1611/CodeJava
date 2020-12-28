package btnop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=(int) 100.000;
        Scanner scan = new Scanner(System.in);
        
        int soNgay;
        
        System.out.println("So ngay lam:");
        
        soNgay = scan.nextInt();
        
        int b = (int) soNgay*a;
        DecimalFormat dcf = new DecimalFormat("###,###.000");
        
        String text = "Tien luong cua nhan vien la:"+ dcf.format(b) + "đ";
        
        
        System.out.println(text);
        
		
		
		
		
		
		
	}

}
