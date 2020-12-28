import java.util.Scanner;

public class bai16 {
	public static int n,a,b;
	public static int[] mang = new int[n];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	nhap();
	doiChoTangDan(mang,n);
	xuatHienNhieu(mang,n);
		
	}
	 public static void nhap() {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap so phan tu cua mang: ");
			n = Integer.parseInt(input.nextLine());
			 
			mang = new int[n]; 
			
			System.out.println("Nhap cac phan tu cua mang: ");		
			for ( int i = 0; i < n ; i ++ ) {  	
		    	System.out.print("Nhap so: ");
		    	mang[i] = Integer.parseInt(input.nextLine());    	
		    	} 
	    }
	 public static void doiChoTangDan(int mang[],int n) {
	        
	        
	        for ( int i = 0 ; i < n - 1 ;i++) {
	          for ( int j=i+1;j < n; j++ ) {
	            if ( mang[i] > mang[j] ) {
	            	int tam = mang[i];
	            	mang[i]=mang[j];
	            	mang[j]=tam;
	            }
	             
	          }     
	        }  
         }
	 public static void xuatHienNhieu(int mang[],int n) {
		 int max =0;
		 int dem=1;
		 
		 doiChoTangDan(mang,n);
		 for ( int i = 0 ; i < n - 1 ;i++) {
			 int a=i;
	          for ( int j=i+1;j < n; j++ ) {
	        	  if(mang[i]==mang[j]) {
	        		  dem++; 
	        		  a++;
	            } 	  
	        }	
	          if(dem>max)
	     		 max =dem;
	          i =a;
	          
       }
		System.out.println("Xuat hien nhieu nhat la: ");
	
       }




}