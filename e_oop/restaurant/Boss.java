package e_oop.restaurant;

import java.util.Arrays; //ctrl + 1 

public class Boss {

public static void main(String[] args) { //main
		
	
	
	//객체 생성
		Alba alba = new Alba();
		
		// 주문 받음
		String [] order = alba.order();
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리 만드는 중 ..........완성 !!");
		String[] foods = {"완성된 짜장면", "완성된 탕수육"};
		
		alba.serve(foods);
		
		alba.pay(order);
		
	}

}
