package g_oop2;

public abstract class Animal {
	//추상클래스 예시 
	
	
	//동물에 대한 매서드 
	void run(){
		System.out.println("달려간다~~~");
	}

	abstract void sound();
	
}

class Dog extends Animal{
	//추상클래스의 매서드를 상속 -> 오버라이딩  DOG + (Ctrl +1) add~ : 자동으로 오버라이딩 해주는 매서드를 만듦
	
	@Override
	void sound() {
		System.out.println("멍멍!!");
	}
	
}


class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("냐옹~");
	}
	
	
}

class Cow extends Animal{

	@Override
	void sound() {
		System.out.println("음매에 ~");
		
	}
	
	
}




