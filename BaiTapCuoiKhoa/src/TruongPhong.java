import java.util.Scanner;

public class TruongPhong extends Nguoi {
    // thuộc tính
	private static final float LUONG_1_NGAY_TRUONG_PHONG = 200;
	private int soNhanVienDuoiQuyen;
	
    //khởi tạo
	public TruongPhong() {
		super();
       this.soNhanVienDuoiQuyen = 0;
	}

	public TruongPhong(String hoTen, String maNV, String soDienThoai, int soNgayLamViec) {
		super(hoTen, maNV, soDienThoai, soNgayLamViec);
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}

	//get,set
	public int getSoNhanVienDuoiQuyen() {
		return soNhanVienDuoiQuyen;
	}

	public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}
	//nhập xuất
	public void nhap() {
		super.nhap();
		Scanner input = new Scanner(System.in);
		System.out.print("Số nhân viên dưới quyền: ");
		this.soNhanVienDuoiQuyen = Integer.parseInt(input.nextLine());
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số nhân viên dưới quyền: " + this.soNhanVienDuoiQuyen);
		System.out.println("---------------------------------");
	}
	//nghiệp vụ

	@Override
	public float tinhLuong() {
		//
		return this.luong = LUONG_1_NGAY_TRUONG_PHONG * this.soNgayLamViec + 100*this.soNhanVienDuoiQuyen;
	}


}
