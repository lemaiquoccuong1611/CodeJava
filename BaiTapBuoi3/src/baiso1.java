import java.util.Scanner;

public class baiso1 {

	public static String khuVuc;
	public static float monNhat;
	public static float monHai;
	public static float monBa;
	
	public static float DIEM_A = 2;
	public static float DIEM_B = 1;
	public static float DIEM_C = (float) 0.5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      nhap();
      
      float diem = tinhDiem();
	  String loai = xepLoai();
	  
	  inDiem(diem,loai);
		
		
	}
    public static void nhap() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Ban thuoc khu vuc nao: ");
    	khuVuc = input.nextLine();
    	System.out.print("Nhap diem mon thu nhat: ");
    	monNhat = Float.parseFloat(input.nextLine());
    	System.out.print("Nhap diem mon thu hai: ");
    	monHai = Float.parseFloat(input.nextLine());
    	System.out.print("Nhap diem mon thu ba: ");
    	monBa = Float.parseFloat(input.nextLine());
    }
    public static float tinhDiem() {
    	float diem = 0;
    	
    	if (khuVuc.equalsIgnoreCase("A"))   	
    		diem = monNhat + monHai + monBa + DIEM_A;  
    		
    	else if ( khuVuc.equalsIgnoreCase("B"))
    	
    		diem =  monNhat + monHai + monBa + DIEM_B;
    	  
    	else if ( khuVuc.equalsIgnoreCase("C"))   	
    		diem = monNhat + monHai + monBa + DIEM_C;
    	
    	return diem;
    }	
    public static String xepLoai() {
    	String loai = null;
    	int diemChuan = 20;
    	float diem = tinhDiem();
    	if (diem >= diemChuan) {
    		loai = "Dau";
    	} else { 
    		loai = "Rot";
    	} 
    	if (monNhat == 0 || monHai == 0 || monBa ==0 ){
    		loai = "Rot";
    	}
    	  return loai;  	    
    }
    	    	
    	    	    	    	    	    	   	   	    		    
   public static void inDiem(float diem, String loai) {
	   System.out.println("Tong diem dat duoc:" + diem);
	   System.out.println("Thi sinh do: "+ loai);
	   
   }
    
    
}

