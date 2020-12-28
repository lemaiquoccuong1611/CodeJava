import java.util.Scanner;

public class NhanVien  {
    // thuộc tính 
	protected String MaNV;
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected float heSoLuong;
	protected double luongCoBan;
	protected double luong;
	// khởi tạo
	public NhanVien() {
		this.MaNV = null;
		this.hoTen = null;
		this.ngaySinh = null;
		this.diaChi = null;
		this.heSoLuong = 0;
		this.luongCoBan = 0;
	}
	public NhanVien(String hoTen,String maSV, String ngaySinh, String diaChi, float heSoLuong,
			double luongCoBan) {
		this.MaNV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
	// get,set	
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	// nhập xuất
	public void nhap() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập họ tên nhân viên: ");
		this.hoTen = input.nextLine();
		System.out.print("Nhập mã nhân viên: ");
		this.MaNV = input.nextLine();
		System.out.print("Nhập ngày sinh nhân viên: ");
		this.ngaySinh = input.nextLine();
		System.out.print("Nhập địa chỉ của nhân viên: ");
		this.diaChi = input.nextLine();
		System.out.print("Nhập hệ số lương của nhân viên: ");
		this.heSoLuong = Float.parseFloat(input.nextLine());
		System.out.print("Nhập lương cơ bản của nhân viên: ");
		this.luongCoBan = Double.parseDouble(input.nextLine());

	}
	public void xuat() {
		System.out.println("Họ tên: "+ this.hoTen + "\nMã nhân viên: "+ this.MaNV + "\nNgày sinh: "+ this.ngaySinh 
				 + "\nĐịa chỉ: "+ this.diaChi + "\nLương cơ bản: "+ this.luongCoBan + "\nHệ số lương: "+this.heSoLuong+"\nLương nhân viên: "+this.luong);
	}
	// nghiệp vụ
	public double tinhLuong() {
		return luong = this.luongCoBan * this.heSoLuong;
	}
	

}
