import java.util.Scanner;

public class bai5 {
	public static int n;
	public static int[] mang = new int[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nhap();	
		xuat();
		lietKeChuSoDauChan();
		
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
    public static int timSoDauChan(int n) {
    	
		  while(Math.abs(n) >= 10){			   
			   n=n/10;
		  }
			   if(n % 2 != 0) {
				   return 0;		   
			   }
		  return 1;
	    }   
 
 public static void lietKeChuSoDauChan() {
	   for(int i = 0; i < n ;i++) {
		   if(timSoDauChan(mang[i]) == 1) {
			   System.out.println("So dau chan la:"+ mang[i]);
		   }
	   }
 }
}
