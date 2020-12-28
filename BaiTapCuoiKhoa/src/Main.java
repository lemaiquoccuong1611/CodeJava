import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CongTy cty = new CongTy();
		cty.khoiTaoDuLieu();
		
		boolean flag = true;		
		do {
		        Scanner input = new Scanner(System.in);
			    System.out.println("Vui lòng chọn: \n1.Thông tin công ty. \n2.Phân bổ nhân viên vào trưởng phòng "
			       +"\n3.Thêm một nhân sự."+"\n4.Xóa 1 nhân sự. "
			       +"\n5.Thông tin mọi người trong công ty "+"\n6.Tổng lương của công ty."
			       +"\n7.Nhân viên có lương cao nhất."+"\n8.Trưởng phòng có lượng nhân viên dưới quyền nhiều nhất."
			       +"\n9.Sắp xếp nhân sự theo thứ tự abc."+"\n10.Sắp xếp nhân sự theo thứ tự lương giảm dần."
			       +"\n11.Giám đốc có cổ phiếu nhiều nhất."+"\n12.Tổng thu nhập của từng giám đốc."	    		  
			       +"\n0.Thoát");
			       int chon = Integer.parseInt(input.nextLine());
			switch(chon) {
			case 1:
				cty.nhapCongTy();
				cty.xuatCongTy();
				break;
			case 2:
			    cty.phanBoNhanVien();
				break;
			case 3:	
			    System.out.println("1.Thêm nhân viên. \n2.Thêm trưởng phòng. \n3.Thêm giám đốc.");
			    int soChon = Integer.parseInt(input.nextLine());
			    if(soChon==1) {
			      cty.themNhanVien();
			      }
			    else if(soChon == 2) {
			      cty.themTruongPhong();
			      }
			    else if(soChon == 3) {
			      cty.themGiamDoc();
			      }
			    break;
			case 4:		
			    System.out.println("1.Xóa nhân viên. \n2.Xóa trưởng phòng. \n3.Xóa giám đốc.");
			    int chonSo = Integer.parseInt(input.nextLine());
			    if(chonSo == 1) {
			    	boolean ketQuaXoaNhanVien = cty.xoaNhanVienTheoMa();
				   if(ketQuaXoaNhanVien == true) {
					System.out.println("Đã xóa thành công!");
					System.out.println("Danh sách nhân sự sau khi xóa: ");
					cty.xuat();
				   }
				   else {
					System.out.println("Không tìm thấy mã cần xóa!");
				   }
			    }
			    else if(chonSo == 2) {
			    	boolean ketQuaXoaTruongPhong = cty.xoaTruongPhongTheoMa();
					if(ketQuaXoaTruongPhong == true) {
						System.out.println("Đã xóa thành công!");
						System.out.println("Danh sách nhân sự sau khi xóa: ");
						cty.xuat();
					}
					else {
						System.out.println("Không tìm thấy mã cần xóa!");
					}
			    }
			    else if(chonSo == 3) {
			    	boolean ketQuaXoaGiamDoc = cty.xoaGiamDocTheoMa();
					if(ketQuaXoaGiamDoc == true) {
						System.out.println("Đã xóa thành công!");
						System.out.println("Danh sách nhân sự sau khi xóa: ");
						cty.xuat();
					}
					else {
						System.out.println("Không tìm thấy mã cần xóa!");
					}
			    }
				break;
			case 5:
			    cty.xuat();
				break;
			case 6:
			    cty.tinhTongLuong();				 
				   break;
			case 7:
				LinkedList<NhanVien> dsNhanVien = new LinkedList<NhanVien>();
				dsNhanVien = cty.timNhanVienCoLuongMax();
				System.out.println("Nhân viên có lương cao nhất: ");
				cty.xuat2(dsNhanVien);
				break;
			case 8:
				LinkedList<TruongPhong> dsTruongPhong = new LinkedList<TruongPhong>();
				dsTruongPhong = cty.timTruongPhongCoNhanVienMax();
				System.out.println("Trưởng phòng có nhiều nhân viên dưới quyền nhất: ");
				cty.xuat3(dsTruongPhong);
				break;
			case 9:
				LinkedList<Nguoi> dsNguoi = new LinkedList<Nguoi>();
				dsNguoi = cty.sapXepTangDanTheoTen();
				System.out.println("Nhân sự của công ty sau khi sắp xếp theo abc: ");
				cty.xuat(dsNguoi);
				break;
			case 10:
				LinkedList<Nguoi> dsNguoiTheoLuong = new LinkedList<Nguoi>();
				dsNguoiTheoLuong = cty.sapXepTheoThuTuLuongGiamDan();				
				System.out.println("Nhân sự của công ty theo giá trị lương giảm dần: ");
				cty.xuat(dsNguoiTheoLuong);
				break;				
			case 11:
				LinkedList<GiamDoc> dsGiamDoc = new LinkedList<GiamDoc>();
				dsGiamDoc = cty.timGiamDocCoPhanMax();
				System.out.println("Giám đốc có cổ phần lớn nhất: ");
				cty.xuat4(dsGiamDoc);
				break;
			case 12:
				cty.tinhThuNhapGiamDoc();
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
