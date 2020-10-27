package g_oop2;

public class AccessTest {
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		//접근제한이 없으므로 가능
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//같은 패키지므로 가능
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		//같은 패키지므로 가능
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		//같은 클래스에서만 가능하여 접근할수 없으므로 컴파일에러 발생 => 접근을 막는것이 제어자
		//System.out.println(am.privateVar);
		//am.privateMethod();
		
	}

}
