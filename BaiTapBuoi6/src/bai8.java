import java.util.Scanner;

public class bai8 {
	
	public static int n;
	public static float[] mang ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nhap4();
		tinhTongLonHon();
	}
	public static void nhap4() {
	   	Scanner input = new Scanner(System.in); 
		   System.out.print("Nhap so phan tu cua mang: ");
			n = Integer.parseInt(input.nextLine());
			
			mang = new float[n];
			int a = -1000;
			int b = 1000;
			for(int i=0;i<n;i++) {
				mang[i] = (float) (a + (Math.random() * (b-a)+1 ));
				System.out.println(mang[i]);	
				
			}
	   }
	   public static float tinhTongLonHon() {
		   float tong4 = 0;
		   
		   for(int i=0;i<n-1;i++) {
			   if( mang[i] > Math.abs(mang[i+1] ) ) {
				   tong4 = tong4 + mang[i];
			   }
		   }
		   System.out.println("Tong cua gia tri lon hon "+ tong4);
		   return tong4;
	   }
}
