import java.util.LinkedList;
import java.util.Scanner;


public class CongTy {
	//thuộc tính		
	private String tenCongTy;
	DanhSachNhanVien objectDSNV = new DanhSachNhanVien();
	//khởi tạo
	public CongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public CongTy() {
		this.tenCongTy = null;
	}
	public void khoiTaoDuLieu() {
		NhanVien nv1 = new NhanVien("Cường","1","16/11","Huế",2,500);
		NhanVien nv2 = new NhanVien("Hiền","2","13/03","Hà Tĩnh",4,500);
		NhanVien nv3 = new NhanVien("Thúy","3","17/12","Huế",5,2000);
		NhanVien nv4 = new NhanVien("Thắng","4","08/08","Huế",2,4000);
		
		this.objectDSNV.getDsNV().add(nv1);
		this.objectDSNV.getDsNV().add(nv2);
		this.objectDSNV.getDsNV().add(nv3);
		this.objectDSNV.getDsNV().add(nv4);		
	}
	//get set
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	// nhập xuất
	public void nhap() {
		
	}
	public void xuat() {
		for(NhanVien nv:this.objectDSNV.getDsNV()) {
			nv.xuat();
		}
	}
	// nghiệp vụ
	public void tinhLuongTungNhanVien() {
		for(NhanVien nv:this.objectDSNV.getDsNV()) {
			nv.tinhLuong();		
		}
	}
	public void themNhanVien() {
		NhanVien nv = new NhanVien();
		nv.nhap();
		this.objectDSNV.getDsNV().add(nv);
		System.out.println("Thành công!");
	}
	public double tinhTongLuong() {
		double tong = 0;
		for(NhanVien nv:this.objectDSNV.getDsNV()) {
			tong = tong + nv.tinhLuong();
			
		}
		System.out.println("Tổng lương nhân viên là: "+tong);
		return tong;
	}
	public LinkedList<NhanVien> timNhanVienLuongMax() {
		LinkedList<NhanVien> dsKetQua = new LinkedList<NhanVien>();
		double max = 0;
		for(NhanVien nv:this.objectDSNV.getDsNV()) {
			if(nv.tinhLuong() > max) {
				max = nv.tinhLuong();
			}
		}
		for(NhanVien nv:this.objectDSNV.getDsNV()) {
			if(nv.tinhLuong() == max) {
				dsKetQua.add(nv);
			}
		}
		return dsKetQua;
	}	
	public LinkedList<NhanVien> timNhanVienTheoMa(){
		LinkedList<NhanVien> dsKetQua = new LinkedList<NhanVien>();	
		String maCanTim = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập mã: ");
		maCanTim = input.nextLine();
		for(NhanVien nv:this.objectDSNV.getDsNV()) {
			if(nv.getMaNV().equalsIgnoreCase(maCanTim)) {
				dsKetQua.add(nv);
			}
		}		
		return dsKetQua;
    }
	public boolean xoaNhanVienTheoMa() {
		boolean ketQua = false;
		LinkedList<NhanVien> nhanVien = new LinkedList<NhanVien>();	
		nhanVien = timNhanVienTheoMa();
		if(nhanVien != null) {
			this.objectDSNV.getDsNV().remove(nhanVien);
			ketQua = true;
		}
		return ketQua;
	}
	
	

	
	
	
	
	
	
 
}
