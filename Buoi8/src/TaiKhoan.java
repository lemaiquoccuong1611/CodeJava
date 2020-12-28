import java.util.Scanner;

public class TaiKhoan {
	
	
	//thuoc tinh
	private String soTaiKhoan;
	private String tenTaiKhoan;
	private double soTienTrongTaiKhoan;

	//khoi tao
	public TaiKhoan() {
		this.soTaiKhoan = null;
		this.tenTaiKhoan = null;
		this.soTienTrongTaiKhoan= 0;
	}
	public TaiKhoan( String tenTaiKhoan,String soTaiKhoan, double soTienTrongTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;		
	}			
	// get,set
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public double getSoTienTrongTaiKhoan() {
		return soTienTrongTaiKhoan;
	}
	public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
		this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
	}	
	//nhap xuat
	public void nhap() {		 	
	         Scanner input = new Scanner(System.in);
	         System.out.print("Nhập tên tài khoản: ");
	         this.tenTaiKhoan = input.nextLine();
	 		 
	         System.out.print("Nhập số tài khoản: ");
	         this.soTaiKhoan = input.nextLine();
	         
	         System.out.print("Số tiền còn trong tài khoản: ");
	         this.soTienTrongTaiKhoan = Double.parseDouble(input.nextLine());        
	    
    }
	public void xuat() {
		int i=1;
		System.out.println("Khách hàng: "+i++);
		System.out.println("Nhập tên tài khoản: "+this.tenTaiKhoan);
		System.out.println("Nhập số tài khoản: "+this.soTaiKhoan);
		System.out.println("Số tiền còn trong tài khoản: "+this.soTienTrongTaiKhoan);	
	}
	public double napTien() {
		Scanner input = new Scanner(System.in);
		System.out.println("Vui lòng nhập số tiền bạn muốn nạp: ");
		double tienNap = Double.parseDouble(input.nextLine());
		if(tienNap >0) {
		this.soTienTrongTaiKhoan = this.soTienTrongTaiKhoan + tienNap;
		System.out.println("Bạn vừa nạp: "+ tienNap + " vào tài khoản.");
		System.out.println("Trong tài khoản bạn lúc này có: "+ this.soTienTrongTaiKhoan);
		}
		else {
			System.out.println("Vui lòng nhập lại!");
		}
		return tienNap;
	}
	public double rutTien() {
        double tienPhi = 10;
        double tienRut;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền bạn muốn rút: ");
        tienRut = Double.parseDouble(input.nextLine());
       
        if (tienRut <= (soTienTrongTaiKhoan - tienPhi)) {
        	this.soTienTrongTaiKhoan = this.soTienTrongTaiKhoan - (tienRut + tienPhi);       
            System.out.println("Bạn vừa rút " + tienRut +".Phí là 10.");
            System.out.println("Trong tài khoản bạn lúc này có: "+ this.soTienTrongTaiKhoan);
        } else {
            System.out.println("Vui lòng nhập lại!");      
        }
        return tienRut;
    }
	
}
	
	  
	
