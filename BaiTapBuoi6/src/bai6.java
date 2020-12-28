import java.util.Scanner;

public class bai6 {
	
	public static int n;
	public static float[] mang ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	nhap();
	tinhTongSoThuc(mang);
		
	}
	public static void nhap() {
    	Scanner input = new Scanner(System.in); 
 	    System.out.print("Nhap so phan tu cua mang: ");
 		n = Integer.parseInt(input.nextLine());
 		
 		mang = new float[n];
 			
 		int a = -1000;
		int b = 1000;
 		for(int i=0;i < n;i++) {		
 			mang[i] = (float)(a + (Math.random() * (b-a)+1 ));
			System.out.println(mang[i]);				
		}
 		
    }
	public static float tinhTongSoThuc(float mang[]) {
    	float tong = 0;
    	for(int i= 0;i < mang.length ;i++) {
    		if( mang[i] > 0) {
    			tong = tong + mang[i];
    		}
    	}
    	System.out.println("Tong la: "+ tong);
        return tong;
    }		

	
}
