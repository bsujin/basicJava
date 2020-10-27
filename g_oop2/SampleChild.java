package g_oop2;
							//상속받기 => 변수와  매서드 상속
public class SampleChild  extends SampleParent{

	void chilMethod(){
		// 상속받은 변수와 메서드를 사용할 수 있다.
		
		System.out.println(var);	 			//상속받은 변수
		System.out.println(method(7,13));	 	//상속받은메서드
	}
	
	
	// 상속 : 사용하고자 하는것을 물려받아 사용
	// 파생된 개념들 : 오버라이딩, super, super(), 다형성
	
	
	// 1. 오버라이딩 : 상속받은 매서드의 내용을 재정의하는것  
	//-> 실수 방지를 위해  : 어노테이션 사용 (무조건 오버라이딩 되는 매서드로 실수일 때 컴파일에러 발생됨 ) 
	@Override 	// 어노테이션 : 클래스, 변수, 매서드 등에 표시해놓는것
		int method(int a , int b){	// 부모클래스의 선언부의 내용 (리턴타입, 매서드명, 파라미터)은 모두 같아야한다 
		return a * b;		//부모 클래스와 다르게 내용을 변경 
		}
	
	
	// 2. super : 부모클래스의 변수와 자식클래스의 변수의 이름이 중복될 때 둘을 구분하기 위해 사용
	//  super () :  생성자에서 부모 클래스의 변수 호출 
			// = this(전역변수와 지역변수의 이름이 같을 때 사용)와 유사( 혼동하지말기)
	
	//부모클래스에 똑같은 변수 var가 3개 
		int var;
				
		void test(double var){
			System.out.println(var); 			//지역변수
			System.out.println(this.var);		//인스턴스 변수
			System.out.println(super.var);		//부모클래스의 인스턴스 변수
			
			System.out.println(this.method(10, 20));	//samplechild 의 매서드
			System.out.println(super.method(10, 20));	//sampleparent
		}
		
		//생성자 만들기
		SampleChild(){	 
			super(); 	//부모클래스의 생성자 호출 - 자식클래스에서 반드시 해줘야한다.
			//super () 를 통해 부모클래스의 생성자를 호출하고 부모 클래스의 인스턴스 변수도 초기화한다.
			//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
		}
		
	
	// - 다형성 : 부모자식 관계의 객체 타입과 변수타입을 다르게 사용, 	 DEF a = new ABC();
				//= 객체생성 - 클래스의 이름과 동일한 변수  ABC  a = new ABC();  유사 ( 혼동하지말기)
	
		public static void main(String[] args){
			SampleChild sc = new SampleChild();
			SampleParent sp = new SampleChild();	 
			//부모타입의 변수로 자식타입의 객체를사용하는 것이 다형성이다.
		
			//부모 자식간에는 서로  형변환이 가능함
			sc = (SampleChild) sp;	// 부모타입의 변수 (객체사용하여 에러가 발생하지 않음)

			sp = (SampleParent) sc;
				sp = sc; //자식타입의 변수 
			//자식타입 -> 부모타입 형변환은 생략 할 수 있다.
				
			// SampleChild sc2 = (SampleChild) new SampleParent(); -에러발생
			//SampleParent는 2개의 멤버를 가지고 있다.
			//SampleChild는 5개의 멤버를 가지고 있다.
			//SampleChild 타입의 변수는 5개의 멤버를 사용할 수 있어야 하는데 
			//SampleParent 객체는 2개의 멤버만 가지고 있다.
			// 그러므로 부모타입의 객체를 자식타입으로 형변환 하는것은 에러를 발생시킨다.
		
			//SampleParent 타입의 변수로는 SampleChild 객체를 가지고도 2개의 멤버만 사용할 수 있다.
			SampleParent sp3 = new SampleChild();
			System.out.println(sp3.var);
			System.out.println(sp3.method(10, 20));
//			사용불가
//			sp3.childMethod();
//			sp3.test(); 	
				
			//=> 객체와 변수의 타입을 다르게 사용, 자식의 객체를 부모타입의 변수로 사용
			//문제는 자식타입의 객체의 멤버가 아무리 많아도 부모타입의 멤버만 사용 가능함
			
			//사용하는 이유
			
			
			
				
		}
		
		
	
	
	
	
	
	
}
