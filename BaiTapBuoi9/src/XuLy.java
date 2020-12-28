import java.util.LinkedList;
import java.util.Scanner;


public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		CongTy cty = new CongTy();
		cty.khoiTaoDuLieu();
		boolean flag = true;
			
		do {
		               Scanner input = new Scanner(System.in);
			       System.out.println("Vui lòng chọn: \n1.Danh sách nhân viên. \n2.Tổng lương nhân viên. \n3.Nhân viên có lương cao nhất."
					+"\n4.Tìm nhân viên. "+"\n5.Thêm nhân viên. "+"\n6.Xóa nhân viên."+"\n0.Thoát");
			       int chon = Integer.parseInt(input.nextLine());
			switch(chon) {
			case 1:				
				cty.xuat();
				break;
			case 2:
			    cty.tinhTongLuong();
				break;
			case 3:	
			    LinkedList<NhanVien> dsKetQua = new  LinkedList<NhanVien>();	
		        dsKetQua = cty.timNhanVienLuongMax();
		        System.out.println("Nhân viên có lương cao nhất là: ");
			    cty.objectDSNV.xuat(dsKetQua);
			    break;
			case 4:
			     LinkedList<NhanVien> dsKetQua1 = new  LinkedList<NhanVien>();	
				 dsKetQua1 = cty.timNhanVienTheoMa();
				 System.out.println("Nhân viên bạn cần tìm: ");
				 cty.objectDSNV.xuat(dsKetQua1);
				 break;
			case 5:
				cty.themNhanVien();
				break;
			case 6:
				boolean ketQuaXoaTheoMa = false;
				   ketQuaXoaTheoMa = cty.xoaNhanVienTheoMa();;
				   if(ketQuaXoaTheoMa==true) {
					   System.out.println("Đã xóa!");	   
				   }
				   else {
					   System.out.println("Không tìm thấy mã bạn muốn xóa!");
				   }
				   break;
			case 0:
				flag = false;
				System.out.println("Tạm biệt!");	
				break;
			default:							
				break;
			}
		}while(flag);
	}	
}
	
	
	
