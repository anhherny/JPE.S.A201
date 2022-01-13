package Assignment_201_AnhNT241;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int s1;
		int s2;
		int s3;
		int s4;
		System.out.println("Nhập số nguyên đầu tiên: ");
		s1=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 2: ");
		s2=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 3: ");
		s3=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 4: ");
		s4=sn.nextInt();
		if(s1==s2 && s1==s3 && s1==s4)
		{
			System.out.println("Các con số bằng nhau");
		}
		else {
			System.out.println("Các con số khác nhau");
		}
	}

}
