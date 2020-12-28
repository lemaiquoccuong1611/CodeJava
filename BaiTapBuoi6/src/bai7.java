import java.util.Scanner;

public class bai7 {
	public static int n;
	public static int[] mang = new int[n];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 nhap();
		 xuat();
		 tinhTongChuSo5();
		
	}
     public static void nhap() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		n = Integer.parseInt(input.nextLine());
		 
		mang = new int[n]; 
		
		System.out.println("Nhap cac phan tu cua mang: ");		
		for ( int i = 0; i < n ; i ++ ) {  	
	    	System.out.print("Nhap so: ");
	    	mang[i] = Integer.parseInt(input.nextLine());;
	    	
	    	} 
    }
    public static void xuat() {
		for ( int i = 0 ; i < n ; i++ ) {
		System.out.println(mang[i] + " ");
		}
	}	
    public static int kiemTraChuSo5(int n) {	   
 	   n = Math.abs(n);
 	   n =n/10;
 	   int hangChuc = n %10;	  
 		 if(hangChuc == 5){
 			 return 1;
 		 }
 	   return 0;	   
    }
    public static int tinhTongChuSo5() {
 	   int tong5 =0;
 	   for(int i =0;i<n;i++) {
 		   if(kiemTraChuSo5(mang[i])==1) {
 			   tong5 = tong5 + mang[i];
 		   }
 	   }
 	   System.out.println("Tong chu so 5 la: "+ tong5);
 	   return tong5;
}
}
