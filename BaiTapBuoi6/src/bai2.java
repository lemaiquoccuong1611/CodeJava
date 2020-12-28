import java.util.Scanner;

public class bai2 {
	public static int n;
	public static int[] mang = new int[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	nhap();
	xuat();
	kiemTraGanNhau();
		
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
    public static void kiemTraGanNhau() {
    	
    	int khoangCachGan = Math.abs(mang[0]-mang[1]);
    	
    	for(int i = 0 ; i < mang.length ; i ++) {
    		for(int j = i+1 ; j < mang.length- 1 ;j++) {
    			if( Math.abs(mang[i]- mang[j]) < khoangCachGan ) {
    				 khoangCachGan = Math.abs(mang[i]-mang[j]);
    			}
    		}
    	}
    	for(int i = 0 ; i < mang.length ; i ++) {
    		for(int j = i+1 ; j < mang.length-1	;j++) {
    			if(khoangCachGan == Math.abs(mang[i]-mang[j])) {
    			System.out.println("mang["+i+"]" + "-" + "mang["+j+"]");
    			}
    		}
    	}	
    }
}
