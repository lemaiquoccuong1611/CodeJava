import java.util.Scanner;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Scanner input = new Scanner(System.in);	
		
	 int soNguoiDungNhap;
	 
	 System.out.println("Vui long chon: \n1. Keo\n2. Bua\n3. Bao  ");
	do { 
		int soNgauNhien = (int) (Math.random()*3 + 1);
		soNguoiDungNhap = Integer.parseInt(input.nextLine());
		
		if(soNguoiDungNhap < 0 || soNguoiDungNhap > 3) {
			System.out.println("Vui long chon lai ");
		}
		if (soNguoiDungNhap == soNgauNhien ) {
			System.out.println("Hoa nhau");
		}
		else if (soNgauNhien == soNguoiDungNhap + 1 
			|| soNgauNhien == 1 && soNguoiDungNhap == 3) {
		   System.out.println("Ban thang");			   
		} else  {
			System.out.println("Ban thua");
			
		} 
						
	}while(soNguoiDungNhap != 0);
		
				
	}
	
}
