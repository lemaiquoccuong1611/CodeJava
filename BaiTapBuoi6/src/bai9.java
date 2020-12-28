import java.util.Scanner;

public class bai9 {

	public static int n;
	public static int[] mang = new int[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap2();
		tinhTrungBinhCong();
	}
	public static void nhap2() {
		   Scanner input = new Scanner(System.in); 
		   System.out.print("Nhap so phan tu cua mang: ");
			n = Integer.parseInt(input.nextLine());
			mang = new int[n];
			int a = -1000;
			int b = 1000;
			for(int i=0;i<n;i++) {
				mang[i] = a + (int)(Math.random() * (b-a)+1 );
				System.out.println(mang[i]);					
			}	
	   }
	 public static boolean kiemTraNguyenTo(int n) {			
			if ( n < 2 ) {	
				return false;
			} 
			else if (n > 2) {
				if (n % 2 ==0) {
					return false;
				}
				for (int i = 3; i <= Math.sqrt(n); i++ ) {
					if(n%i == 0) {
						return false;
					}
				}
			}
			return true;		
	    }
	   public static int tinhTrungBinhCong() {	   
		   int trungBinh=0;
		   int tong=0;
		   int soLuong=0;
		   for(int i = 0 ; i<n ; i++) {
			   if(kiemTraNguyenTo(mang[i]) == true) {
			   soLuong++;	   
			   tong = tong + mang[i];	
			   trungBinh = tong /soLuong;
		   }
		   }	   
		   System.out.println("Trung binh cong cac so nguyen to la: "+ trungBinh);
		   return trungBinh;  
	   }   
}
