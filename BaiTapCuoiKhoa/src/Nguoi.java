import java.util.Scanner;

public abstract class Nguoi {
    // thuộc tính
	protected String hoTen;
	protected String maNV;
	protected String soDienThoai;
	protected int soNgayLamViec;
	protected float luong;
	//khởi tạo
	public Nguoi() {
		this.hoTen = null;
		this.maNV = null;
		this.soDienThoai = null;
		this.soNgayLamViec = 0;		

	}
	public Nguoi(String hoTen, String maNV, String soDienThoai, int soNgayLamViec) {
		this.hoTen = hoTen;
		this.maNV = maNV;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;

	}
	//get,set
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}
	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	//nhập, xuất
	public void nhap() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		this.hoTen = input.nextLine();
		System.out.print("Nhập mã nhân viên: ");
		this.maNV = input.nextLine();
		System.out.print("Nhập số điện thoại: ");
		this.soDienThoai = input.nextLine();
		System.out.print("Nhập số ngày làm: ");
		this.soNgayLamViec = Integer.parseInt(input.nextLine());
	}
	public void xuat() {
		System.out.println("Họ tên: "+this.hoTen);
		System.out.println("Mã nhân sự: "+this.maNV);
		System.out.println("Số điện thoại: "+this.soDienThoai);
		System.out.println("Số ngày làm: "+this.soNgayLamViec);
	}
	//nghiệp vụ
    public abstract float tinhLuong();
    
    public String tachTen() {
    	String ten=null;
    	this.hoTen = this.hoTen.trim();
    	int viTriKhoangTrangCuoi = this.hoTen.lastIndexOf(" "); //lastindexof là lấy ra vị trí " " cuối của tên.
    	ten = this.hoTen.substring(viTriKhoangTrangCuoi + 1, this.hoTen.length());
    	return ten;
    }
	
	
	
}
