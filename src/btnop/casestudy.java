package btnop;

import java.util.Scanner;

public class casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double a,b,c,e;
      int d;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Chieu dai cua san la:");
      a = scan.nextDouble();
      
      System.out.print("Ban kinh cua mot cay phat trien day du:");
      b = scan.nextDouble();
      
      System.out.print("Khong gian can thiet giua cac cay phat trien day du:");
      c = scan.nextDouble();
      
      d =  (int) (a / ((b*2)+c));
      System.out.println("So luong cay co the duoc trong trong san:"+d );     
            
      e = (b*2*c);
      System.out.println("Tong khong gian duoc chiem boi nhung cay duoc trong hoan toan:"+ e);
      		
		
	}

}