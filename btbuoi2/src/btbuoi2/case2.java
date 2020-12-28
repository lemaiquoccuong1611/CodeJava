package btbuoi2;

import java.util.Scanner;

public class case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final double chieuDaiCanhCua = 5;
        final double chieuRongCanhCua =2;
        final double chieuDaiCuaSo = 2;
        final double chieuRongCuaSo = 1;
        final double dienTichCanhCua = chieuDaiCanhCua * chieuRongCanhCua ;
        final double dienTichCuaSo = chieuDaiCuaSo * chieuRongCuaSo ;
        double soSon ;
        double chieuDai,chieuRong,chieuCao,dienTich,dienTichTran;
        int soCanhCua,soCuaSo;
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Chieu dai cua can nha la: ");
        chieuDai = scan.nextDouble();
        scan.nextLine();
        System.out.print("Chieu rong cua can nha la: ");
        chieuRong = scan.nextDouble();
        scan.nextLine();
        System.out.print("Chieu cao cua can nha la: ");
        chieuCao = scan.nextDouble();
        
        dienTich = ((2*chieuCao)*(chieuDai + chieuRong));
        
		System.out.print("So canh cua: ");
		soCanhCua = scan.nextInt();
		scan.nextLine();
		
		System.out.print("So cua so: ");
		soCuaSo = scan.nextInt();
		scan.nextLine();
		
		System.out.print("So son tren m^2 la: ");
		soSon = scan.nextDouble();
		scan.nextLine();
		
	    double sonTuong = (dienTich - ((soCanhCua * dienTichCanhCua)+(soCuaSo*dienTichCuaSo))) * soSon;
		String text = String.format("So son can thiet de son tuong la: " + sonTuong +" lit");
		System.out.print(text);
		scan.nextLine();
		
		
		dienTichTran = chieuDai * chieuRong * soSon ; 
		String text1 = String.format("So son can thiet de son tran la: " + dienTichTran +" lit");
		System.out.print(text1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
