import java.util.Scanner;

public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int soNguoiDungNhap;
		int soNgauNhien = (int) (Math.random()*999 + 1);
		int doan= 0;
		
					
		do {soNguoiDungNhap = nhap();			
		if ( soNguoiDungNhap == soNgauNhien) 
		{   doan++;
			System.out.println("Chuc mung ban da doan trung ");	
		System.out.println("So lan doan la: "+ doan);
		   
		}
		else if (soNguoiDungNhap < soNgauNhien) 
		{System.out.println("Vui long nhap so lon hon ");		    
		    doan++;
		}
		else {
			System.out.println("Vui long nhap so nho hon ");
			doan++;
		}		    
		} while(soNguoiDungNhap != 0);			
			
	}			
     public static int nhap() {
    	 int n;
    	 Scanner input = new Scanner(System.in);
    	 System.out.print("Nhap 1 so trong khoang 1-1000: ");
    	 n = Integer.parseInt(input.nextLine());
    	 return n;		
	
	}

}