import java.util.Scanner;

public class bai10 {
	public static int n,soLuong;
	public static float soChon;
	public static float[] mang ;
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

	nhap();
	tinhTrungBinhCongSoThuc();
		
		
	}
	public static void nhap() {
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
			System.out.print("Vui long chon 1 so:");
			soChon = Float.parseFloat(input.nextLine());
	}
    public static float tinhTrungBinhCongSoThuc() {
    	float trungBinhCong =0;
    	float tong = 0;
    	int soLuong =0;
    	for(int i=0;i<n;i++) {
    		if( mang[i]>soChon ) {
    			soLuong++;
    			tong = tong + mang[i];
    			trungBinhCong = tong/soLuong;
    		}
    	}
    	System.out.println("Trung binh cong cac so thuc lon  la: "+ trungBinhCong);
    	return trungBinhCong;
}
}
