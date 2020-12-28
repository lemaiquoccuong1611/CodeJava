import java.util.Scanner;

public class bai17 {
	public static int n;
	public static int[] mang = new int[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 nhap();
		 daoMang();
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
	public static void daoMang() {
    	 for ( int i = n-1 ; i >= 0  ;i--) {
    		 System.out.println(mang[i]+ " ");            
     }
     }
}
