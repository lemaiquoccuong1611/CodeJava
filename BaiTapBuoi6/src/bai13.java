import java.util.Scanner;

public class bai13 {
	public static int n;
	public static float[] mang ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 nhap();
	 xuat();
	 xoaCacSoChan(mang,n);
	 System.out.println("Ket qua la: ");
		
		
	}
	public static void nhap() {
	   	Scanner input = new Scanner(System.in); 
		   System.out.print("Nhap so phan tu cua mang: ");
			n = Integer.parseInt(input.nextLine());
			
			mang = new float[n];
			System.out.println("Nhap so: ");
			for(int i=0;i<n;i++) {
				mang[i] = Float.parseFloat(input.nextLine());
				System.out.println(mang[i]);					
			}
	   }
	    public static void xuat() {
			for ( int i = 0 ; i < n ; i++ ) {
			System.out.println(mang[i] + " ");
			}
		}	
      public static void xoaPT(float mang[] ,int viTriXoa, int n) {
    	
    	for (int i = viTriXoa;i<n-1;i++) {
    		
    		mang[i]= mang[i+1];
    	}
    	n--;
       }
      public static void xoaCacSoChan(float mang[],int n) {
      	for(int i=0 ;i<n;i++) {
      		if(mang[i ]%2 == 0) {
      			xoaPT(mang, i,n);
      			i--;
      		}
      	}
      	
      }
}
