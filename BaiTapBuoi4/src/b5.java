import java.util.Scanner;

public class b5 {

	

	public static int soThuNhat;
	public static int soThuHai;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;	
		Scanner input = new Scanner(System.in);	
		
		
		nhap();
		inMenu();

				
		
		do {
			System.out.print("Vui long chon va nhap: ");
			chon = Integer.parseInt(input.nextLine());
		    if (chon >= 0 && chon < 5) {
		    	xuLyChonLua(chon);
		    	break;
		    }
		    else
		    	System.out.println("Vui long nhap so 0-4 ");
		    	
		} while(chon != 0);
		
		}
				  		
		public static void nhap() {	
			Scanner input = new Scanner(System.in);
			
			System.out.print("Nhap so thu nhat: ");
			soThuNhat = Integer.parseInt(input.nextLine());
			
			System.out.print("Nhap so thu hai: ");
			soThuHai = Integer.parseInt(input.nextLine());
		}
			 public static void inMenu() {
					
					Scanner input = new Scanner(System.in);	    	    
					System.out.println("1. tinh tong: ");
					System.out.println("2. tinh hieu: ");
					System.out.println("3. tinh tich: ");
					System.out.println("4. tinh thuong: ");
					System.out.println("0. Thoat");
									
			}	
		public static int tinhTong() {
			int tong;
			tong =  soThuNhat + soThuHai;
			return tong;
		}
	    public static int tinhHieu() {
	    	int hieu;   	
			hieu = soThuNhat - soThuHai;
	    	return hieu;		
	    }			
	    public static int tinhTich() {
	    	int tich;   	
			tich = soThuNhat * soThuHai;
	    	return tich;	
	    }
	    public static float tinhThuong() {
	    	float thuong;   	
			thuong = soThuNhat / soThuHai;
	    	return (float) thuong;	
	    }
	   
		public static int xuLyChonLua(int chon) {
			
			switch( chon ) {
			case 1: 
				 tinhTong();
				 System.out.println("Tong 2 so la: "+ tinhTong());
				break;
			case 2: 
			    tinhHieu();
			    System.out.println("Hieu 2 so la: "+ tinhHieu());
				break;
			case 3: 
				 tinhTich();
				 System.out.println("Tich 2 so la: "+ tinhTich());
				break;
			case 4: 
				tinhThuong();
				System.out.println("Thuong 2 so la: "+ tinhThuong());	
				break;
			case 0:			
				break;
			}
			return chon;
			
		}
	}


