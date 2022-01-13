package Assignment_201_AnhNT241;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int s1;
		int s2;
		int s3;
		int s4;
		int s5;
		System.out.println("Nhập số nguyên đầu tiên: ");
		s1=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 2: ");
		s2=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 3: ");
		s3=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 4: ");
		s4=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 5: ");
		s5=sn.nextInt();
		int tong=s1+s2+s3+s4+s5;
		System.out.println("Tổng là: "+ tong);
	}

}
