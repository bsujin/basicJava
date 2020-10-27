package e_oop;

public class ClassMaker {

	// 전역변수 하나를 선언 및 초기화
	
	int a=10;
	
	
	// 리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요
	// 메서드 안에서 전역변수를 출력
	
	
	void method1 (){
		System.out.println(a);
		
	}
	
	//전역변수와 동일한 '타입'의 리턴타입이 있고 파라미터는 없는 메서드하나를 만들어 주세요
	//메서드 안에서 '전역변수'를 리턴해주세요 (method 자리는 변수이름 원하는대로 상관없음)
	
	int method2 (){  //컴파일 에러가 발생 - 변수가 들어가면 리턴타입이 있어야함 
	return a;	//method2번 호출한 곳으로 감 
		
}
	//리턴타입은 없고 파라미터가 있는 메서드를 하나 만들어주세요,
	//메서드 안에서 파라미터를 출력

	void method3 (String p){
		System.out.println(p);		
	}
	
	//int타입의 리턴타입과 int타입의 (파라미터) 두개가 있는 메서드 하나를 만들어주세요
	//(,) -> ,로 구분하여 여러개를 넣을 수 있음 
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴
	
	int method4 (int p1, int p2){
		return p1 * p2;
		}
	
	
}
