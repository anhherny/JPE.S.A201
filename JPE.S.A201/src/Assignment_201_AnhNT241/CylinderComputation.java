package Assignment_201_AnhNT241;

import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		float r,h;
		float Sxq,Stp,V;
		System.out.println("Nhập bán kính: ");
		r=sn.nextInt();
		System.out.println("Nhập chiều cao: ");
		h=sn.nextInt();
		Sxq= (float) (2*3.14*r*h);
		Stp=(float) (2*3.14*r*(r+h));
		V=(float) (3.14*r*r*h);
		System.out.println("Diện tích xung quanh =" +Sxq);
		System.out.println("Diện tích toàn phần =" +Stp);
		System.out.println("Thể tích = "+V);
	}

}
