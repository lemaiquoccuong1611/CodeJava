import java.util.Scanner;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tong = nhapVaTinhTong();
	 	 
		xuat(tong);							
		
		}
		public static int nhapVaTinhTong() {
			int n;
			int tong = 0;
			Scanner input = new Scanner(System.in);
			
			do { 
				 System.out.print("Nhap n: ");				 
				 n = Integer.parseInt(input.nextLine());			 				
				 
				 
				 if( n%2 == 0)
					 tong = tong + n;
				 else
		    		  System.out.println("Vui long nhap so chan");	
			         
			 }while(n != 0);
			return tong;
		}
	       	
		public static void xuat(int tong) {
			System.out.println("Tong cua cac so do la: "+ tong);
		}
		
	}

