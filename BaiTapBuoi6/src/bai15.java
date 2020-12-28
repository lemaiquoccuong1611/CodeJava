import java.util.Scanner;

public class bai15 {
	public static int n,a,b;
	public static int[] mang = new int[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		nhap();
		System.out.println("So vong quay la: ");
		int k = Integer.parseInt(input.nextLine());
		dichPhai(mang,n,k);
		
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
    public static void hoanVi() {
    	int tam = a;
    	a=b;
    	b=tam;
    }
    public static void dichPhai(int mang[],int n, int k) {
    	
    	
    	while(k>0) { 
    		int tam = mang[0];
    		for(int i =0;i<n;i++) {
    		 mang[i]=mang[i+1];	
    		 k--;
    		}   	
    		mang[n-1]= tam;
    	}
    }
}
