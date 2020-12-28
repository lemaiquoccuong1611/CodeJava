import java.util.Scanner;

public class GiamDoc extends Nguoi {

	 // thuộc tính
		private static final float LUONG_1_NGAY_GIAM_DOC = 300;
		private float soCoPhan;
		
	    //khởi tạo
		public GiamDoc() {
			super();
			this.soCoPhan = 0;
		}
		public GiamDoc(String hoTen, String maNV, String soDienThoai, int soNgayLamViec,float soCoPhan) {
			super(hoTen,maNV,soDienThoai,soNgayLamViec);
			this.soCoPhan = soCoPhan;
		}
		//get,set
		public float getSoCoPhan() {
			return soCoPhan;
		}
		public void setSoCoPhan(float soCoPhan) {
			this.soCoPhan = soCoPhan;
		}
		//nhập xuất
		public void nhap() {
			super.nhap();
			Scanner input = new Scanner(System.in);
			System.out.print("Nhập số cổ phần: ");
			this.soCoPhan = Float.parseFloat(input.nextLine());
		}
		public void xuat() {
			super.xuat();
			System.out.println("Số cổ phần: "+this.soCoPhan);
			System.out.println("---------------------------------");
		}
		//nghiệp vụ
		@Override
		public float tinhLuong() {
			return LUONG_1_NGAY_GIAM_DOC * this.getSoNgayLamViec(); 
		}

}
