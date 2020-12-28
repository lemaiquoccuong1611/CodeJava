import java.util.Scanner;

public class bai3 {
	public static int n;
	public static int[] mang = new int[n];
	public static int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	nhap();
	inCacSoChan();
		
		
		
	}
    public static void nhap() {
		
		Scanner input = new Scanner(System.in);
		
		if(n % 2 ==0) {
		System.out.print("Nhap so phan tu cua mang: ");
		n = Integer.parseInt(input.nextLine());
		}	
		mang = new int[n]; 
		if(a>=-100 && b<=100) {
		System.out.print("Vi tri dau tien: " );
		a = Integer.parseInt(input.nextLine());
		System.out.print("Vi tri thu hai: " );
		b = Integer.parseInt(input.nextLine());
		}
		System.out.println("Cac phan tu cua mang: ");				
		for ( int i = 0; i < n ; i ++ ) {  	
				
			mang[i] = a + (int)(Math.random() * (b-a)+1 );
			System.out.println(mang[i]);
			
	    	} 
    }
   public static void inCacSoChan() {	   
	   for(int i=0;i<n;i++) {		  
		   if(mang[i] % 2 ==0) {			  
			   System.out.println("So chan la: "+ mang[i]);
		   }		   
	   }
   }
}
