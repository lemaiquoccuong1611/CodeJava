import java.util.Scanner;

public class bai1 {
	public static int n;
	public static int[] mang = new int[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	nhap();
	xuat();
	xuat3K(n);	
	
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
    public static int kiemTra3K(int n) {
    	int flag = 1;
    	n = n < 0 ? -n : n;
        if (n < 2) {
        	return flag;
        }
        while(n>1) {
        	int du = n%3;
        	if(du !=0)
        		flag = 0;
        	n = n/3;
        }
        if(flag==1) {
        	return 1;       		
        }
        else {       	
        }
        	return 0;   	
    }
    public static void xuat3K( int n) {
    	for ( int i = 0 ; i < n ; i++ ) {
    		if(kiemTra3K(mang[i]) == 1) {
    			System.out.println("So co dang 3K la:" +mang[i]);
    		}
    	}
    }
}
