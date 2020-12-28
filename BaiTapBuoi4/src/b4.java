import java.util.Scanner;

public class b4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = nhap();
    
    int giaiThua = tinhGiaiThua(n);
		
	xuat(giaiThua);	
		
	}
     public static int nhap() {
    	 int n;
    	 Scanner input = new Scanner(System.in);
    	 do {
    	 System.out.print("Nhap n: ");
    	 n = Integer.parseInt(input.nextLine());
    	 if (n < 0 )
    		 System.out.println("Vui long nhap so duong");
    	 } while(n < 0);
    	 return n;
    	    	 
     }
	 public static int tinhGiaiThua(int n) {
		 int giaiThua = 1;
		 
		 for (int a = 1; a <=n  ; a++) {
				giaiThua *= a;			
		 
		 if (n == 0)
			 giaiThua = 1;	
		     					 
		 }
		 return giaiThua;
	 }	
	 public static void xuat(int giaiThua) {
		 System.out.print("Giai thua cua n la: "+ giaiThua);
	 }
	
}
