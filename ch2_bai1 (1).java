package JavaCore;

import java.util.Scanner;

public class ch2_bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Nhập vào số a : ");
     double a=sc.nextDouble();
     System.out.println("Nhập vào số b : ");
     double b=sc.nextDouble();
     double Tong = a+b;
     double Hieu=a-b;
     double Tich = a*b;
     double Thuong=a/b;
     double LayDu=a%b;
     System.out.println("Tổng 2 số a và b là : " + Tong);
     System.out.println("Hiệu 2 số a và b là : " + Hieu);
     System.out.println("Tích 2 số a và b là : " + Tich);
     System.out.println("Thương 2 số a và b là : " + Thuong);
     System.out.println("Chia Lấy dư 2 số a và b là : " + LayDu);
     //các toán tử so sánh 
     System.out.println("a lớn hơn b :" +(a > b));
     System.out.println("a nhỏ hơn b :" + (a < b));
     System.out.println("a khác b : " + (a != b));
     System.out.println("a lớn hơn hoặc bằng b " +(a >=b ));
     System.out.println("a nhỏ hơn hoặc bằng b " + (a <= b));
	}

}
