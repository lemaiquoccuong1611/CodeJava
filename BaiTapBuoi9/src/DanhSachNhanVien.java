import java.util.LinkedList;
import java.util.Scanner;


public class DanhSachNhanVien {
    // thuộc tính
	private LinkedList<NhanVien> dsNV;
	// khởi tạo
	public DanhSachNhanVien() {
		this.dsNV = new LinkedList<NhanVien>();
	}
    // get,set
	public LinkedList<NhanVien> getDsNV() {
		return dsNV;
	}
	public void setDsNV(LinkedList<NhanVien> dsNV) {
		this.dsNV = dsNV;
	}
	// nhập xuất 
	public void xuat(LinkedList<NhanVien> danhSach) {
		for(NhanVien nhanVien:danhSach) {
			nhanVien.xuat();
		}
	}
	public void xuatNhanVien() {
		System.out.println("Danh sách nhân viên: ");
		for(NhanVien nv: this.dsNV) {
			nv.xuat();
		}
	}
	// nghiệp vụ

}
