import java.util.LinkedList;
import java.util.Scanner;

public class baitap {
    
	
	public static LinkedList<Integer> mang = new LinkedList<Integer>();
	
	public static LinkedList<Float> mang1 = new LinkedList<Float>();
	
	public static int so,a,b,n;
	public static float soThuc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  int chon;	
	    nhap();
	    xuat(mang);
	  
	    inMenu();
	    Scanner input = new Scanner(System.in);		 				

		do {
			System.out.print("Vui long chon va nhap: ");
			chon = Integer.parseInt(input.nextLine());
		    if (chon >= 1 && chon < 11) {
		    	xuLyChonLua(chon);
		    	break;
		    }
		    else
		    	System.out.println("Vui long nhap so 1-10 ");
		    	
		} while(chon != 0);	  
	  
	  
	}
	public static void inMenu() {
		
		Scanner input = new Scanner(System.in);	    	    
		System.out.println("1. Tinh tong so duong: ");
		System.out.println("2. Dem so duong trong mang: ");
		System.out.println("3. So nho nhat trong mang: ");
		System.out.println("4. So duong nho nhat trong mang: ");
		System.out.println("5. So chan cuoi cung cua mang");
		System.out.println("6. Doi cho 2 gia tri");
		System.out.println("7. Sap xep mang theo thu tu tang dan");
		System.out.println("8. Tim so nguyen dau tien trong mang");
		System.out.println("9. Nhap mang so thuc( Dem co bao nhieu so nguyen)");
		System.out.println("10. So sanh luong so duong va so am");
     }	
	public static void nhap() {
		String chon;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		n = Integer.parseInt(input.nextLine());
		
		
		System.out.println("Nhap cac phan tu cua mang: ");
		do {    	
	    	System.out.print("Nhap so: ");
	    	so = Integer.parseInt(input.nextLine());
	    			    	
	    	mang.add(so);
	    	
	    	System.out.println("Ban co muon tiep tuc khong? \nNhan 'yes' de tiep tuc hoac  'no' de dung lai ");	
	    	chon = input.nextLine();
	    	} while(chon.equalsIgnoreCase("yes"));
    }
	public static void xuat(LinkedList<Integer> danhSach ) {
		for ( int i = 0 ; i < mang.size() ; i++ ) {
		System.out.println(danhSach.get(i) + " ");
		}
	}
	public static int tongSoDuong() {
		int tong = 0;
	    for ( int i = 0 ; i < mang.size() ; i++) {
	    if ( mang.get(i) > 0 ) {
	    	tong = tong + mang.get(i);
	    }	    	
	    }		
		System.out.println("Tong cac so duong trong mang la: "+ tong);
	    return tong;
	}
	public static int demSoDuong() {
		int dem = 0;
		for ( int i = 0 ; i < mang.size() ; i++) {
		    if ( mang.get(i) > 0 ) {
		    	dem++;
	    }							   
	}
		System.out.println("So duong trong mang co: "+ dem);
		return dem;		
    }
	public static int demSoAm() {
		int dem1 = 0;
		for ( int i = 0 ; i < mang.size() ; i++) {
		    if ( mang.get(i) < 0 ) {
		    	dem1++;
	    }							   
	}
		System.out.println("So am trong mang co: "+ dem1);
		return dem1;		
    }
	public static void soSanhAmDuong(int dem , int dem1) {
		for(int i = 0 ; i< mang.size() ; i++) {
			if(mang.get(i)>0) {
				dem++;
			}
			else {
				dem1++;
			}			
		}		
		if(dem > dem1) {
			System.out.println("So luong so duong nhieu hon");
		}
		else if ( dem == dem1) {
			System.out.println("So luong so duong bang so am");
		}
		else {
			System.out.println("So luong so duong it hon");
		}
	}
		
    public static int timSoNhoNhat() {
    	int nhoNhat = mang.get(0);
    	for ( int i = 0 ; i < mang.size() ; i++) {
		    if ( mang.get(i) < nhoNhat ) {
		    	nhoNhat = mang.get(i);
	    }							   
	}
    	System.out.println("So nho nhat trong mang la: "+ nhoNhat);
    	return nhoNhat;
    }
    public static int timSoDuongNhoNhat() {
        int duongNhoNhat =  mang.get(0);	
        for ( int i = 0 ; i < mang.size() ; i++) {
		    if ( mang.get(i) > 0 ) {
		    	if ( mang.get(i) < duongNhoNhat) {
		    		duongNhoNhat = mang.get(i);
		    }		    	
	    }							   
	}
        System.out.println("So duong nho nhat trong mang la: "+ duongNhoNhat);
        return duongNhoNhat;
    }
	public static int timSoChanCuoiCung() {
		int soChanCuoi = -1;
		 for ( int i = 0 ; i < mang.size()-1 ; i++) {
			    if ( mang.get(i) % 2 == 0 ) {
			    	soChanCuoi = i;		    	
		      }	 			   
			 }	
		 if ( soChanCuoi == -1) {
			 System.out.println("Khong co so chan nao");
		 }
		 
		 return soChanCuoi;
	}
	public static void swap(int a , int b) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vi tri thu nhat ban muon hoan vi: ");
		a = Integer.parseInt(input.nextLine());
		
		System.out.print("Nhap vi tri thu hai ban muon hoan vi: ");
		b = Integer.parseInt(input.nextLine());
		
		int tam = mang.get(a);
    	mang.set(a,mang.get(b));
    	mang.set(b,tam);
		
    	System.out.println("Mang sau khi hoan vi la: "+ mang);
	}
	public static void doiChoTangDan() {           
        for ( int i = 0 ; i < mang.size() - 1 ;i++) {
          for ( int j=i+1;j < mang.size(); j++ ) {
            if ( mang.get(i) > mang.get(j) ) {
            	int tam = mang.get(i);
            	mang.set(i,mang.get(j));
            	mang.set(j,tam);
            }          
          }     
        }
       System.out.println("Mang theo gia tri tang dan la: " + mang);
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
	public static int timSoNguyenDau( int n) {
		for(int i = 0 ; i < n ; i++) {
			if(kiemTraNguyenTo(mang.get(i)) == true ) {
				return mang.get(i);
			}
		}
		return -1;
	}
	public static void nhap1() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang thu hai: ");
		n = Integer.parseInt(input.nextLine());
		
		mang1.add(soThuc);
		
		System.out.println("Nhap cac phan tu cua mang: ");		
		for ( int i = 0; i<n ; i ++ ) {  	
	    	System.out.print("Nhap so: ");
	    	soThuc = Float.parseFloat(input.nextLine());
	    		
	    	mang1.add(soThuc);	    	
	    	} 
    }
	public static void xuat1(LinkedList<Float> danhSach1 ) {
		for ( int i = 0 ; i < mang1.size() ; i++ ) {
		System.out.println(danhSach1.get(i) + " ");
		}
	}	
	public static int timSoNguyen(float soThuc) {
		    int demNguyen = 0;
		    for(int i = 0 ; i < n ; i++) {
		    	if(soThuc - (int)soThuc == 0 ) {
		    		demNguyen++;
		    	}
		    }
		    System.out.println("So luong so nguyen o mang thu hai la: "+ demNguyen);
		    return demNguyen;				
	}	
	public static int xuLyChonLua(int chon) {
		
		switch( chon ) {
		case 1: 
			 tongSoDuong();
			break;
		case 2: 
			demSoDuong();
		   
			break;
		case 3: 
			timSoNhoNhat();
			
			break;
		case 4: 
			timSoDuongNhoNhat();
				
			break;
		case 5:			
			int soChanCuoi = timSoChanCuoiCung();
			System.out.println("So chan cuoi cua mang la: "+ mang.get(soChanCuoi));
			break;
		case 6:
			swap(a,b);	
			break;
		case 7:
			doiChoTangDan();
			break;
		case 8:
			int soNguyenDau =timSoNguyenDau(n);
			System.out.println("So nguyen to dau tien cua mang la: "+ mang.get(soNguyenDau));
			break;
		case 9:
			nhap1();
			xuat1(mang1);
			timSoNguyen( soThuc);
			break;
		case 10:
			int dem = 0;
			int dem1 = 0;
			soSanhAmDuong(dem ,dem1);
			break;
		}
		return chon;
		
	}
	
}	