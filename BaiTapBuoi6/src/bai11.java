import java.util.Scanner;

public class bai11 {

	
	public static int n;
	public static float[] mang ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    nhap();
    xuat();
    
    System.out.println("Ket qua la: ");
    xoaSoLonNhat(mang,n);
    
		
		
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
      public static float timMax(float mang[],int n) {
      	float max = mang[0];
      	for (int i =1;i<n;i++) {
      		if( mang[i]>max ) {
      			max = mang[i];
      		}
      	}
      	return max;     
       }
      public static void xoaSoLonNhat(float mang[],int n) {
      	float max = timMax(mang,n);
      	for(int i =0; i<n;i++) {
      		if(mang[i] == max) {
      			xoaPT(mang,i,n);
      			i--;
      		}
      	}
      }
      
} 
