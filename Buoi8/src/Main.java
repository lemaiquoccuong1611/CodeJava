import java.util.LinkedList;
import java.util.Scanner;



public class Main {
	/* Thưa mentor và thầy , nếu có chấm bài em thì cho em xin đáp án bài này với ạ.
	 * Em làm như bình thường là thêm 1 file NganHang để quản lí thì lúc em getSoTienTrongTaiKhoan
	 * thì báo lỗi và em tìm lỗi không ra , em debug cũng không ra lỗi ạ.
	 * Cho em xin đáp án để em tham khảo ạ.
	 */
	public static void nhapTaiKhoan(TaiKhoan taiKhoan) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập tên tài khoản: ");
		taiKhoan.setTenTaiKhoan(input.nextLine());
		
		System.out.print("Nhập số tài khoản: ");
		taiKhoan.setSoTaiKhoan(input.nextLine());
		
		taiKhoan.setSoTienTrongTaiKhoan(100);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TaiKhoan mang[] = null;
        int n=0;
        int chon;
		boolean flag = true;
	    String so,so1,so2,so3,so4;		
		
	do {
	    Scanner input = new Scanner(System.in);
		System.out.println("Vui lòng chọn: \n1.Tạo tài khoản. \n2.Xuất tài khoản \n3.Nạp tiền. \n4.Rút tiền. \n5.Chuyển tiền \n0.Thoát");
		chon = Integer.parseInt(input.nextLine());
		switch(chon) {			
		case 1:
			//Nhập tài khoản
			System.out.print("Nhập số lượng khách hàng bạn muốn nhập: ");
            n = input.nextInt();
            mang = new TaiKhoan[n];
            for (int i = 0; i < n; i++) {
                    System.out.println("Khách hàng số: " + (i+1));
                    mang[i] = new TaiKhoan();
                    nhapTaiKhoan(mang[i]);
                }
			break;
	case 2:
			//Xuất tài khoản
		    for (int i = 0; i < n; i++) {                                       
                    mang[i].xuat();
                }
			break;
	case 3:
			//Nạp tiền			
			System.out.print("Nhập số tài khoản khách hàng cần nạp tiền: ");
            so1 = input.nextLine();
            for (int i = 0; i < n; i++) {
                    so = mang[i].getSoTaiKhoan();
                    if (so.equalsIgnoreCase(so1)) {
                        System.out.println("Bạn chọn tài khoản: " + so);
                        mang[i].napTien();
                    } else {
                        System.out.println("");
                    }
                }				
			break;
	case 4: 
			//Rút tiền
		    System.out.println("Nhập số tài khoản khách hàng cần rút tiền: ");
            so2 = input.nextLine();
            for (int i = 0; i < n; i++) {
                	 so = mang[i].getSoTaiKhoan();
                     if (so.equalsIgnoreCase(so2)) {
                         System.out.println("Bạn chọn tài khoản: " + so);
                         mang[i].rutTien();
                     }
                 }
			break;
	case 5:
		//Chuyển tiền
		 double tienNguoiChuyen,tienNguoiNhan,tienChuyen;
                
         System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
         so1 = input.nextLine();
         System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
         so2 = input.nextLine();
         for (int i = 0; i < n; i++) {
           so = mang[i].getSoTaiKhoan();
           if (so1.equalsIgnoreCase(so)) {
        	   tienNguoiChuyen = mang[i].getSoTienTrongTaiKhoan();
           for (int j = 0; j < n; j++) {
               so3 = mang[j].getSoTaiKhoan();
               if (so2.equalsIgnoreCase(so3)) {
                   tienNguoiNhan = mang[j].getSoTienTrongTaiKhoan();
                   System.out.println("Nhập số tiền cần chuyển");
                   tienChuyen = Double.parseDouble(input.nextLine());
                      if (tienChuyen <= tienNguoiChuyen) {
                        tienNguoiChuyen = tienNguoiChuyen - tienChuyen;
                        tienNguoiNhan =tienNguoiNhan + tienChuyen;
                        mang[i].setSoTienTrongTaiKhoan(tienNguoiChuyen);
                        mang[j].setSoTienTrongTaiKhoan(tienNguoiNhan);
                        System.out.println("Tài khoản số " + so + " vừa chuyển: " + tienChuyen);
                        System.out.println("Tài khoản số " + so3 + " vừa nhận: " + tienChuyen);
                      }else {
                         System.out.println("Số tiền nhập không hợp lệ!");
                         }
                   } else {
                         System.out.println("");
                     }
                 }
             } else {
                 System.out.println("");
             }
         }
				break;
			case 0:
				flag = false;
				System.out.println("Cảm ơn quý khách!");	
				break;
			default:							
				break;
			}
		}while(flag);
	}	
}
