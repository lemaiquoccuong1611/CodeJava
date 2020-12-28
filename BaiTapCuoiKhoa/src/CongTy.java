import java.util.LinkedList;
import java.util.Scanner;

public class CongTy {
     //thuộc tính
	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private LinkedList<Nguoi> dsNguoi;
	
	//khởi tạo
	public CongTy() {
		dsNguoi = new LinkedList<Nguoi>();
	}

	public CongTy(String tenCongTy, String maSoThue, float doanhThuThang, LinkedList<Nguoi> dsNguoi) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
		this.dsNguoi = dsNguoi;
	}
	//get ,set
	
	//nhập xuất
	public void khoiTaoDuLieu() {
		Nguoi nhanVien1 = new NhanVien("Thịnh","nv1","123", 20,"tp1");
		Nguoi nhanVien2 = new NhanVien("Tiến","nv2","234", 22,"tp2");
		Nguoi nhanVien3 = new NhanVien("Khoa","nv3","345", 21,"tp1");
		Nguoi truongPhong1 = new TruongPhong("Hân","tp1","456",28);
		Nguoi truongPhong2 = new TruongPhong("Liêm","tp2","567",24);
		Nguoi giamDoc1 = new GiamDoc("Cường", "gd1", "678", 29,15);
		Nguoi giamDoc2 = new GiamDoc("Hiền", "gd2", "789", 30,30);
		
		this.dsNguoi.add(nhanVien1);
		this.dsNguoi.add(nhanVien2);
		this.dsNguoi.add(nhanVien3);
		this.dsNguoi.add(truongPhong1);
		this.dsNguoi.add(truongPhong2);
		this.dsNguoi.add(giamDoc1);
		this.dsNguoi.add(giamDoc2);

		phanBoNhanVien();
		capNhatNhanVienTruongPhong();
		
	}
	public void nhapCongTy() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập tên công ty: ");
		this.tenCongTy = input.nextLine();
		System.out.print("Nhập mã số thuế công ty: ");
		this.maSoThue = input.nextLine();
		System.out.print("Nhập doanh thu công ty: ");
		this.doanhThuThang = Float.parseFloat(input.nextLine());
	}
	public void xuatCongTy() {
		System.out.println("Tên công ty: "+this.tenCongTy);
		System.out.println("Mã số thuế của công ty: "+this.maSoThue);
		System.out.println("Doanh thu tháng của công ty: "+this.doanhThuThang);
	}
	public void xuat() {
		for(Nguoi nguoi:this.dsNguoi) {
			nguoi.xuat();
		}
	}
	public void xuat(LinkedList<Nguoi> danhSach) {
		for(Nguoi nguoi:danhSach) {
			nguoi.xuat();
		}		
	}
	public void xuat2(LinkedList<NhanVien> danhSach2) {
		for(NhanVien nv:danhSach2) {
			nv.xuat();
		}
	}
	public void xuat3(LinkedList<TruongPhong> danhSach3) {
		for(TruongPhong tp:danhSach3) {
			tp.xuat();
		}
	}
	public void xuat4(LinkedList<GiamDoc> danhSach4) {
		for(GiamDoc gd:danhSach4) {
			gd.xuat();
		}
	}
    //2
    public void phanBoNhanVien() {
    	System.out.println("Vui lòng sắp xếp nhân viên: ");
    	for(Nguoi nv: this.dsNguoi) {
    		if(nv instanceof NhanVien) {
    		Scanner input = new Scanner(System.in);
    		System.out.print("Nhập mã trưởng phòng: ");
    		String maTruongPhong = input.nextLine();
    		for(Nguoi tp: this.dsNguoi) {
    			if(tp instanceof TruongPhong) {
    				if(tp.maNV.equalsIgnoreCase(maTruongPhong)) {
    		             ((NhanVien) nv).setMaQuanLy(maTruongPhong);
    		             break;
    				}
    			}
    		}
    	 }
      }
    }
    //3
    public boolean themNhanVien() {
    boolean ketQua = false;
    NhanVien nv = new NhanVien();
    nv.nhap();
	Scanner input = new Scanner(System.in);
	System.out.print("Nhập mã trưởng phòng: ");
	String maTruongPhong = input.nextLine();
	for(Nguoi tp: this.dsNguoi) {
		if(tp instanceof TruongPhong) {
			if(tp.maNV.equalsIgnoreCase(maTruongPhong)) {
	             ((NhanVien) nv).setMaQuanLy(maTruongPhong);
	             ((TruongPhong) tp).setSoNhanVienDuoiQuyen(((TruongPhong) tp).getSoNhanVienDuoiQuyen()+1);
	             break;
			}
		}
	}
    this.dsNguoi.add(nv);
    return ketQua;
    }
    public void themTruongPhong() {
		TruongPhong tp = new TruongPhong();
		tp.nhap();
		this.dsNguoi.add(tp);
		System.out.println("Thành công!");
	}
    public void themGiamDoc() {
		GiamDoc gd = new GiamDoc();
		gd.nhap();
		this.dsNguoi.add(gd);
		System.out.println("Thành công!");
	}
	 //4
    public boolean xoaTruongPhongTheoMa() {
 
    	boolean ketQua = false;
    	Scanner input = new Scanner(System.in);
    	System.out.print("Nhập mã trưởng phòng cần xóa: ");
    	String maTruongPhongCanXoa = input.nextLine();
 
    	TruongPhong tp = new TruongPhong();
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof TruongPhong) {
    			if(nguoi.maNV.equalsIgnoreCase(maTruongPhongCanXoa)) {
    				tp =(TruongPhong)nguoi;
    				ketQua = true;
    				break;
    			}
    		}
    	}
    	if(ketQua == true) {
    	this.dsNguoi.remove(tp);  
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof NhanVien) {
    			if(((NhanVien) nguoi).getMaQuanLy().equalsIgnoreCase(maTruongPhongCanXoa)) {
    				((NhanVien) nguoi).setMaQuanLy(null);
    			}
    		}
    	}
    }
    	//b3  	
    	return ketQua;
    }
    public boolean xoaNhanVienTheoMa() {
    	boolean ketQua = false;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Nhập mã nhân viên bạn muốn xóa: ");
    	String maNhanVienCanXoa = input.nextLine();
    	NhanVien nv = new NhanVien();
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof NhanVien) {
    			if(nguoi.getMaNV().equalsIgnoreCase(maNhanVienCanXoa)) {
    				nv = (NhanVien)nguoi;
    				ketQua = true;
    				break;
    			}
    		}
    	}
    	if(ketQua == true) {
    		this.dsNguoi.remove(nv);
    	}
    	return ketQua;
    }
    public boolean xoaGiamDocTheoMa() {
    	boolean ketQua = false;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Nhập mã giám đốc bạn muốn xóa: ");
    	String maGiamDocCanXoa = input.nextLine();
    	GiamDoc gd = new GiamDoc();
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof GiamDoc) {
    			if(nguoi.maNV.equalsIgnoreCase(maGiamDocCanXoa)) {
    				gd = (GiamDoc)nguoi;
    				ketQua = true;
    				break;
    			}
    		}
    	}
    	if(ketQua == true) {
    		this.dsNguoi.remove(gd);
    	}
    	return ketQua;
    }
	//6	
	public float tinhTongLuong() {
		float tong = 0;
		for(Nguoi nguoi:this.dsNguoi) {
			tong = tong + nguoi.tinhLuong();
		}
		System.out.println("Tổng lương của công ty: "+tong);
		return tong;
	}
	//7
    public LinkedList<NhanVien> timNhanVienCoLuongMax(){
    	LinkedList<NhanVien> dsKetQua = new LinkedList<NhanVien>();
    	float max = 0;
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof NhanVien) {
    			if(((NhanVien)nguoi).tinhLuong() > max) {
    				max = ((NhanVien)nguoi).tinhLuong();
    			}
    		}
    	}
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof NhanVien) {
    			if(((NhanVien)nguoi).tinhLuong() == max) {
    				dsKetQua.add(((NhanVien)nguoi));
    			}
    		}
    	}
    	return dsKetQua;
    }
    //8
    public void capNhatNhanVienTruongPhong(){
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof NhanVien) {
    			for(Nguoi ns:this.dsNguoi) {
    				if(ns instanceof TruongPhong) {
    					if(((NhanVien) nguoi).getMaQuanLy().equalsIgnoreCase(ns.maNV)) {
    						((TruongPhong) ns).setSoNhanVienDuoiQuyen(((TruongPhong) ns).getSoNhanVienDuoiQuyen()+1);
    					}
    				}
    			}
    		}
    	}
    }  
    public LinkedList<TruongPhong> timTruongPhongCoNhanVienMax(){
    	LinkedList<TruongPhong> dsKetQua = new LinkedList<TruongPhong>();
    	int max = 0;
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof TruongPhong) {
    			if(((TruongPhong) nguoi).getSoNhanVienDuoiQuyen() > max) {
    				max = ((TruongPhong) nguoi).getSoNhanVienDuoiQuyen();
    			}
    		}
    	}
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof TruongPhong) {
    			if(((TruongPhong) nguoi).getSoNhanVienDuoiQuyen() == max) {
    				dsKetQua.add(((TruongPhong) nguoi));
    			}
    		}
    	}
      	return dsKetQua;
    }
    //9
    public LinkedList<Nguoi> sapXepTangDanTheoTen(){
    	LinkedList<Nguoi> dsKetQua = new LinkedList<Nguoi>();
    	dsKetQua = this.dsNguoi;
    	for(int i= 0 ; i < dsKetQua.size() - 1;i++) {
    		for(int j = i + 1;j < dsKetQua.size();j++) {
    			if( dsKetQua.get(i).tachTen().compareToIgnoreCase(dsKetQua.get(j).tachTen()) > 0 ) {
    				Nguoi tam = null; // không thể Nguoi tam = new Nguoi(); được vì đây là abstract
    				tam = dsKetQua.get(i);
    				dsKetQua.set(i, dsKetQua.get(j));
    				dsKetQua.set(j, tam);
    			}
    		}
    	}
    	return dsKetQua;
    }
    //10
	public LinkedList<Nguoi> sapXepTheoThuTuLuongGiamDan() {
	    LinkedList<Nguoi> dsKetQua = new LinkedList<Nguoi>();
	    dsKetQua = this.dsNguoi;
	     for(int i = 0; i < dsKetQua.size() - 1;i++) {
		   for(int j = i+1 ; j < dsKetQua.size();j++) {
			 if(dsKetQua.get(i).tinhLuong() < dsKetQua.get(j).tinhLuong()) {
				Nguoi tam = dsKetQua.get(i);
				dsKetQua.set(i, dsKetQua.get(j));
				dsKetQua.set(j, tam);
			}
		  }
	   }
	     return dsKetQua;																			
    }	
    
    //11
    public LinkedList<GiamDoc> timGiamDocCoPhanMax(){
    	LinkedList<GiamDoc> dsKetQua = new LinkedList<GiamDoc>();
    	float max = 0;
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof GiamDoc) {
    			if(((GiamDoc) nguoi).getSoCoPhan() > max) {
    				max = ((GiamDoc) nguoi).getSoCoPhan();
    			}
    		}
    	}
    	for(Nguoi nguoi:this.dsNguoi) {
    		if(nguoi instanceof GiamDoc) {
    			if(((GiamDoc) nguoi).getSoCoPhan() == max) {
    				dsKetQua.add((GiamDoc)nguoi);
    			}
    		}
    	}
    	return dsKetQua;
    }
	//12
    public float tinhLoiNhuanCongTy() {
    	float loiNhuan = 0;
    	float tong = tinhTongLuong();
    	loiNhuan = this.doanhThuThang - tong;
    	System.out.println("Lợi nhuận công ty: "+loiNhuan);
        return loiNhuan;
    }
   
    public float tinhThuNhapGiamDoc() {
    	float thuNhap = 0;
    	float loiNhuan = tinhLoiNhuanCongTy();
    	int n = 1;
    	for(int i = 0; i < this.dsNguoi.size();i++) {
    		if(this.dsNguoi.get(i) instanceof GiamDoc) {
    			thuNhap = this.dsNguoi.get(i).getLuong() + (((GiamDoc) this.dsNguoi.get(i)).getSoCoPhan()*loiNhuan);
    			System.out.println("Thu nhập của giám đốc "+ n + ":" + thuNhap);
    			n++;
    		}
    	}	
    	return thuNhap;
    }
}
