import java.util.Scanner;

public class baiso2 {

	public static String hoTen;
	public static double thuNhap;
	public static int soNguoi;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	nhap();	
		
	float thuNhapChiu = thuNhapChiuThue();	
	float thue = thueThuNhap();
		
	xuat(thue);	
		
	}
    public static void nhap() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Ho ten la: ");
    	hoTen = input.nextLine();
    	System.out.print("Tong thu nhap nam: ");
    	thuNhap = Double.parseDouble(input.nextLine());
    	System.out.print("So nguoi phu thuoc: ");
    	soNguoi = Integer.parseInt(input.nextLine());
    	    	
    }
	public static float thuNhapChiuThue() {
		float thuNhapChiu ;
		thuNhapChiu = (float) (thuNhap - 4 - soNguoi*1.6);
		return thuNhapChiu;
	}
	public static float thueThuNhap() {
		  float thue = 0;
		  float thuNhapChiu = thuNhapChiuThue();
		  if (thuNhapChiu > 0 && thuNhapChiu <= 60 ) {
			  thue =  (thuNhapChiu * ((float)5.0/100)) ;
		  }
		  else if (thuNhapChiu > 60 && thuNhapChiu <= 120 ) {
			  thue = (thuNhapChiu * ((float)10.0/100));
		  }
		  else if (thuNhapChiu > 120 && thuNhapChiu <= 216 ) {
			  thue = (thuNhapChiu * ((float)15.0/100));
		  }
		  else if (thuNhapChiu > 216 && thuNhapChiu <= 384 ) {
			  thue =  (thuNhapChiu * ((float)20.0/100));
		  }
		  else if (thuNhapChiu > 384 && thuNhapChiu <= 624 ) {
			  thue = (thuNhapChiu * ((float)25.0/100));
		  }
		  else if (thuNhapChiu > 924 && thuNhapChiu <= 960 ) {
			  thue = (thuNhapChiu * ((float)30.0/100));
		  }
		  else if (thuNhapChiu > 960 ) {
			  thue =  (thuNhapChiu * ((float)35.0/100));
		  }
		return thue;
		
	}
	public static void xuat(float thue) {
		System.out.print("Thue thu nhap ca nhan phai tra la: " + thue);
	}
}
