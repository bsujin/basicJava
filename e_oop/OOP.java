package e_oop;



public class OOP {

	public static void main(String[] args) {	
		/*
		 * 객체지향 프로그래밍 (Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것
		 * - 코드의 재사용이 높고 유지보수가 용이하다. (메서드로 통해 반복적으로 사용하는 것이 효율적임)
		 */
	
		//객체 생성
		SampleClass sc = new SampleClass();	
		
		System.out.println(sc.field);	
		
		sc.method1();	// SampleClass 에 있던 method1 내용호출
		
		String returnValue = sc.method2(5);
		System.out.println(returnValue);
		
		System.out.println(sc.method2(10)); //결과값이 동일하게 출력됨
		
		
		sc.flowTest1(); //1번만 호출해도 2,3이 연결되있어서 호출이 됨
	
		// 실행은 sampleclass가 아니라 oop에서 실행 
	
		//방금 ClassMaker에서 만든 클래스의 객체를 생성하고 변수에 저장
		// 객체가  저장된 변수를 통해 메서드를 호출
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주고,
		//리턴타입이 있는 메서드는 리턴받은값을 출력
		
		//1.객체생성
		ClassMaker maker = new ClassMaker();
		
		//파라미터도 없고 리턴타입도 없는 메서드 호출
		maker.method1();
	
		
		//전역변수 메서드 출력
		System.out.println(maker.method2());
		
		//스트링 타입 파라미터 메서드 출력 
		maker.method3("aaaa");
		
		//(,) p1, p2안에 내용 넣기
		System.out.println(maker.method4(15, 23));
		
		
		
	
	
	
	
	
	
	
	}
}
