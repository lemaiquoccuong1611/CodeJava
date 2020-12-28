import java.util.Scanner;

public class bai4 {
	public static int n;
	public static int[] mang = new int[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap2();
		inCacChuSoLe();
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
	   public static int kiemTraSoLe(int n) {
		  int du;
		  while(n !=0){
			   du = n % 10;
			   if(du % 2 == 0)
				   return 0;
			   n = n /10;
			   }
		  return 1;
	    }   
	   public static void inCacChuSoLe() {
		   for(int i =0 ; i <n;i++) {
			   if(kiemTraSoLe(mang[i])==1) {
				 System.out.println("Cac gia tri co toan chu so le la: "+ mang[i]);  
			   }
		   }
	   }
}
