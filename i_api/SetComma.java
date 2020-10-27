package i_api;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요.
		//1,000,000
		
		//입력받을때는 string 출력은 숫자에 3자리마다 콤마
		// 과정 : 숫자를 입력 => 뒤에서부터 숫자를 가져오기 -> 숫자를 셀 변수 만들기 -> 3자리마다 찍히는 조건 -> 맨 앞에는 , 붙이지 않기 
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 숫자를 입력해주세요>");
		String num = sc.next();
		String comma = ""; 
//		String cash = String.format("%,d", num);
		
//		뒤에서부터 가져오기 -> 바로 출력하면 거꾸로 출력되므로 앞에다 붙여주기 -> 숫자를 셀 변수 만들엊귀 
		
		
		int count = 0; 		//숫자를 셀 변수를 만들어주기
		//뒤에서부터 가져오기 
		for (int i = num.length()-1; i >=0; i--){
		  // 	comma += num.charAt(i);
		   	//comma = comma + number.charAt(i); -> 이렇게 출력됨 
		   	comma = num.charAt(i) + comma; //앞에다 붙여줌
		   		count++;
		   	
		   	//3자리마다 찍히는 조건  && 조건 추가 (맨앞에는 안붙이기)
		   	if(count % 3 == 0 && count != num.length()){
		   		comma = "," + comma;
		   	}
		} System.out.println(comma); //3자리마다 찍힘 -> 앞에 수가 없을 때도 붙음
		   	
		   	
	}
}	   	
		   	
		   	
		   	
//		String sub1 = rev.substring(3);	
//		System.out.print(sub1 + ",");
//		String sub2 = rev.substring(4,6);		
//		System.out.print(sub2 + "," );
//		String sub3 = rev.substring(7,9);		
//		System.out.print(sub3 + "," );
//		
//		

	
	


		
	
		


