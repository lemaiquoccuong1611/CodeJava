import java.util.Scanner;

public class NhanVien extends Nguoi {
    //thuộc tính
	private static final float LUONG_1_NGAY_NHAN_VIEN = 100;
	private String maQuanLy; 
    //khởi tạo
	public NhanVien() {
		super();
		this.maQuanLy = null;
	}
	public NhanVien(String hoTen, String maNV, String soDienThoai, int soNgayLamViec,String maQuanLy) {
		super(hoTen, maNV, soDienThoai, soNgayLamViec);
		this.maQuanLy = maQuanLy;
	}
	//get,set

	public String getMaQuanLy() {
		return maQuanLy;
	}
	public void setMaQuanLy(String maQuanLy) {
		this.maQuanLy = maQuanLy;
	}
	//nhập xuất
	public void nhap() {
		super.nhap();
		String chonLua = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Bạn có trưởng phòng không? \nNếu có thì nhấn 'yes', còn không hãy nhấn 'no'!");
        chonLua = input.nextLine();
		if(chonLua.equalsIgnoreCase("yes")) {
			
		}
		else {
			this.maQuanLy = null;
		}		
	}
	public void xuat() {
		super.xuat();
		System.out.println("Mã số trưởng phòng quản lý: "+this.maQuanLy);
		System.out.println("---------------------------------");
	}
	//nghiệp vụ

	@Override
	public float tinhLuong() {
		return this.luong = LUONG_1_NGAY_NHAN_VIEN * this.soNgayLamViec;
	}

}
