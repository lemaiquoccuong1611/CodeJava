package btbuoi2;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ten1,ten2,ten3;
        int namSinh1,namSinh2,namSinh3,tuoiNguoi1,tuoiNguoi2,tuoiNguoi3;
        
        Scanner scan = new Scanner(System.in);
       
        
        System.out.println("Moi ban nhap ten nguoi thu nhat: "); 
        ten1 = scan.nextLine();        
        System.out.println("Moi ban nhap nam sinh nguoi thu nhat: ");        
        namSinh1 = scan.nextInt();
        scan.nextLine();     
       
        System.out.println("Moi ban nhap ten nguoi thu hai: ");
        ten2 = scan.nextLine();        
        System.out.println("Moi ban nhap nam sinh nguoi thu hai: ");
        namSinh2 = scan.nextInt();
        scan.nextLine();            
       
        System.out.println("Moi ban nhap ten nguoi thu ba: ");
        ten3 = scan.nextLine();	        
        System.out.println("Moi ban nhap nam sinh nguoi thu ba: ");
        namSinh3 = scan.nextInt();
        	
        
        
        tuoiNguoi1 = 2020 - namSinh1;
        tuoiNguoi2 = 2020 - namSinh2;
        tuoiNguoi3 = 2020 - namSinh3;
        
        System.out.print("Sinh vien tre nhat la: ");
		
        if(namSinh1 > namSinh2 && namSinh1 > namSinh3 ) 
        {String text1 = String.format("Ho ten: "+ ten1 ) + " . " + "Tuoi: "+ tuoiNguoi1;
        	System.out.println(text1);}
		
        else if(namSinh2 > namSinh1 && namSinh2 > namSinh3 )
        {String text2 = String.format("Ho ten: "+ ten2 , " . " )+ " " + "Tuoi: "+ tuoiNguoi2;
        	System.out.println(text2);}
		
        else if ( namSinh3 > namSinh1 && namSinh3 > namSinh2 )
        {String text3 = String.format("Ho ten: "+ ten3 )+ " . " + "Tuoi: "+ tuoiNguoi3;
        	System.out.println(text3);}
        
        
		
		
		
		
		
		
		
		
		
		
	}

}
