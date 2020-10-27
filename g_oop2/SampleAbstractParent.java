package g_oop2;

public abstract class SampleAbstractParent {
		//추상클래스 : 추상 매서드를 하나라도 가지고 있는것 - 예시)Animal
		
	void method(){
		
	}
	
	//추상 매서드 : 선언부만 있고 구현부는 없는 메서드 (abstract)
		//호출할 수 없음 부모클래스의 역할(=공통된 내용이 있을때 만드는것이 부모클래스)만 함
		//
	abstract void abstractMethod();
	
}

class SampleAbstractChild extends SampleAbstractParent{	
	//추상클래스는 상속받으면 컴파일 에러 발생
	//추상클래스의 매서드를 물려받음 (상속)-> 추상클래스여야 함 
	//방법 1. abstract가 있어야함 2. 오버라이딩(상속받은 매서드의 내용을 변경)을 통해 매서드의 내용을 만들어줌
	
	@Override
	void abstractMethod(){
	
}

}
