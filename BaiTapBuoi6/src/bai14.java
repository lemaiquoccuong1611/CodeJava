import java.util.Scanner;

public class bai14 {
	public static int n;
	public static int[] mang ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
nhap();
xuat();
xoaSoChinhPhuong(mang,n);
		
		
	}
	public static void nhap() {
	   	Scanner input = new Scanner(System.in); 
		   System.out.print("Nhap so phan tu cua mang: ");
			n = Integer.parseInt(input.nextLine());
			
			mang = new int[n];
			System.out.println("Nhap so: ");
			for(int i=0;i<n;i++) {
				mang[i] = Integer.parseInt(input.nextLine());
				System.out.println(mang[i]);					
			}
	   }
	    public static void xuat() {
			for ( int i = 0 ; i < n ; i++ ) {
			System.out.println(mang[i] + " ");
			}
		}	
      public static void xoaPT(int mang[] ,int viTriXoa, int n) {
    	
    	for (int i = viTriXoa;i<n-1;i++) {
    		
    		mang[i]= mang[i+1];
    	}
    	n--;
       }
      public static int kiemTraSoChinhPhuong(int n) {
      	if(Math.sqrt((float)n) == (int)Math.sqrt(n)) {
      		return 1;
      	}
      	return 0;
      }
      public static void xoaSoChinhPhuong(int mang[],int n) {
      	for(int i =0 ; i<n;i++) {
      		if(kiemTraSoChinhPhuong(mang[i])==1 ) {
      			xoaPT(mang,i,n);
      			i--;
      		}

}
      }
}
