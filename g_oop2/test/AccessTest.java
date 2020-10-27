package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier{ 	//2)상속 => 컴파일 에러
	public static void main(String[] args) {
		
		//다른 패키지에서 접근제어자 사용해보기
		
		//다시 접근
		AccessModifier am = new AccessModifier();
		
		//접근제한 없으므로 가능
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//같은패키지거나 상속받은 클래스가 아니므로 접근 제어 => 1)상속받기
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
//		=> 3) AccessModifier 에 접근이 아니라 AccessTest를 통해 접근받아야함

		AccessTest at = new AccessTest();
	
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
		//4개의 변수를 상속 받았으나 다른 패키지에서는 default,private x -> 컴파일 에러 
//		System.out.println(at.defaultVar);
//		System.out.println(at.privateVar);
//		
//		즉, 다른 클래스에서 접근을 가능하게 할건지, 불가능하게 할건지 결정하는 것
		
	}

}
