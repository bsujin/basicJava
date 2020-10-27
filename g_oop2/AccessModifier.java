package g_oop2;

public class AccessModifier {

	//접근 제어자 : public
	//class, 변수, 매서드 에 접근을 할 수 있는지 결정을 해주는 것
	
	//4가지 종류 (외우기) - public, protected, default, private
	
	public String publicVar = "public : 접근 제한이 없음 ";		// 누구든지, 어디서든  접근할 수 있음 
	
	protected String protectedVar = "protected : 같은 패키지 + 상속받은 클래스에서 접근 가능 ";
	//같은 패키지안에 있는 클래스에서만 접근을 가능(다른 패키지에 있는 경우 변수에 접근할 수 없으나 상속 받은 경우 가능함"
	
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	//반드시 생략을 해야 default (접근 제어자를 적지 않은것 = default ) 
	
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	//클래스안에서만 접근이 가능하고 다른 클래스에서는 접근이 불가능함
	
	
	//접근제어자 만들기
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}



	//클래스안에서 메인 메서드 만들어 각각의 변수와 메서드에 접근
	public static void main (String[]args) {
		AccessModifier am = new AccessModifier();
	
		//public 접근 - 어디서든 접근 가능, 클래스내에서도 접근
		System.out.println(am.publicVar);
		am.publicMethod();
	
		//protected
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		//default - 메인메서드는 같은 클래스 안에 있어 접근 가능
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		//private - 같은 클래스 안
		System.out.println(am.privateVar);
		am.privateMethod();
		
	
	//다른 클래스 안일 경우 접근이 제한 (AccessTest)

	
	/*
	 * 접근제어자를 사용하는 이유
	 * 1. 데이터를 보호하기 위해 -> Time(예시. 변수에 접근을 제어)
	 *  -사용자의 잘못된 입력을 막기 위해 접근제어자를 사용 
	 * 2. 불필요한 멤버를 감추기 위해
	 * ex) 맥도날드 주문 - 빅맥, 1955, 상하이 라는 메뉴 
	 * 주문할때 몰라도 되는 재료들(패티, 케첩,마요네즈)이 메뉴에 있음 - 알필요가x
	 * 접근 제어자를 사용 ( 감추는것  -> private패티, private 케첩, private 마요네즈)
	 */

	//객체 생성
	Time t = new Time();
	
	//시간이라는 변수를 불러와 설정 (무조건 그 값이 들어감)
//	t.hour = 9;
//	t.minute = 390;
//	t.second = -50;
	
	
	t.setHour(23);
	t.setMinute(350);
	t.setSecond(-50);
	System.out.println(t.getTime());
	

	t.clock();	//불필요한 멤버(stop)를 감추기 위해 사용 
				//->  clock만 알아도 실행 가능하나 사용하기 위해 매서드를 만듦 (실행할때 필요 없으므로 private를 사용)
	
	
}
}