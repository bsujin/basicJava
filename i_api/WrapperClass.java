package i_api;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * - boolean	 : Boolean
		 * - char 		 : Character
		 * - byte		 : Byte
		 * - short 		 : Short
		 * - int 		 : Integer
		 * - long 		 : Long
		 * - float		 : Float
		 * - double		 : Double
		 */
		
		//Integer 객체생성
		Integer iw = new Integer(20);
		
		//int라는 문자열이 같이 넘어옴 (4byte = 32bit)
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit");
	    
		//int타입이 표현할 수 있는 범위 (가장 작은 범위(-20억) ~ 가장 큰 값(20억))
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		//형변환하는 매서드 포함 -> int타입의 숫자(정수)를 반환
		//문자열(parseInt)안에 반드시 숫자로 이루어진 문자만 가능 ( 공백, 특수문자, 한글, 영문자 x)
		int parseInt = Integer.parseInt("20");
		
	
		// ArrayList: 사용하기 편한 배열 - 길이를 지정하지 않고, 저장을 하면 저장을 한 만큼 길이가 늘어남
		// 저장할 수 있는 것 = 객체만 저장 가능 (기본형 타입 저장 x) -> wrapper클래스의 객체 저장
		// 배열의 한계 = int의 길이만큼(20억)
		// <Integer> : ArrayList 안에 <저장할 수 있는 값 >지정 -> int, integer객체 저장 가능
		ArrayList <Integer> list = new ArrayList<>();
		list.add(new Integer(10));	//0번 인덱스에 저장
		list.add(10); 			    // 1번 인덱스에 저장
		// int를 자동으로 Integer로 형변환 해줌  -> 오토박싱 : 기본형타입이 wrapper 클래스로 자동 변환  */
		
		Integer integer = list.get(0); 		//해당 인덱스에 있는 값을 가져올 수 있음 ( 타입 = Integer -> 저장)
		int i = list.get(0); 				// (int타입에도 저장가능) => 언박싱 : wrapper클래스가 기본형 타입으로 자동변환

		// 	=> 기본형 타입과 wrapper은 형변환이 가능하다
				
		
	}

}





