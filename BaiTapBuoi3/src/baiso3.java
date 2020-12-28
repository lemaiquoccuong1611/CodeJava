import java.util.Scanner;

public class baiso3 {
    
	public static String hoTen;
	public static double soKW;
	
	
	public static final int DIEN1 = 500;
	public static final int DIEN2 = 650;
	public static final int DIEN3 = 850;
	public static final int DIEN4 = 1100;
	public static final int DIEN5 = 1300;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	nhap();	
		
	double tong = tienDien();
		
	xuat(tong);	
		
	}
     public static int nhap() {
    	 Scanner input = new Scanner(System.in);
    	 System.out.print("Ho ten la: ");
    	 hoTen = input.nextLine();
    	 System.out.print("So kw tieu thu la: ");
    	 soKW = Double.parseDouble(input.nextLine());
		return 0;
    	 
    	
     }
	 public static double tienDien() {
		 double tong = 0;
		 if (soKW <= 50 && soKW > 0) {
			 tong = soKW * DIEN1;
		 }
		 else if ( soKW > 50 && soKW <= 100) {
			 tong = (50 * DIEN1) + (soKW - 50)* DIEN2;
		 }
		 else if ( soKW > 100 && soKW <= 200) {
			 tong = (50 * DIEN1) + (50 *DIEN2) + (soKW - 100 )*DIEN3;
		 }	 
		 else if ( soKW > 200 && soKW <= 350) {
			 tong = (50 * DIEN1) + (50* DIEN2) + (100*DIEN3) + (soKW - 200)*DIEN4 ;
		 }
		 else if ( soKW > 350 ) {
			 tong = (50 * DIEN1) + (50* DIEN2) + (100*DIEN3) + (200*DIEN4) + ( soKW - 400)*DIEN5 ;
		 }
		 return tong;
		 		 		 		 
	 }
	
	public static void xuat(double tong) {
		String text = String.format("So tien phai tra la: "+ tong +" d/kW");
		System.out.print(text);
	}
	
	
	
	
}
