package g_oop2;

public interface SampleInterface {

	//interface 만들기
	
	//추상클래스-추상매서드를 가질 수 있지만 다른 일반적인 매서드도 갖을 수 있음 
	//*interface의 특징 :  추상 매서드와 상수만 가질 수 있음, 여러개의 인터페이스를 상속받을 수 있다.
	//여러가지 용도로 활용 가능 : 관계없는것들 끼리 관계를 지어줄 수 있음 - 예시 : Starcraft
	
	
	
	//인터페이스의 모든 멤버 변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1;
	
	//모든 멤버변수의 제어자가 같기때문에 생략이 가능하다.
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
		
	
}


	//클래스를 상속 - extends
	//인터페이스는 - implements -> 오버라이딩 해줘야함
	// 부모클래스의 역할을 하는것, 다중상속이 가능함
										//여러개의 인터페이스를 상속  , 사용 
	
class SampleImplement implements  SampleInterface, SampleInterface2{

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	
}

//중복은 제외하고 만들어줌 (method1 제외하고 3만 만들어줌 )^
interface SampleInterface2{
	void method1();
	void method3();
}