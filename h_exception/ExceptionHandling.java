package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {

		/*
		 * 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러 (빨간줄)  				-- 컴파일 : 작성된 언어를 컴퓨터가 알아듣게 하는것 
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는것 (버그)
		 * - 런타임 에러 : 실행시에 발생되는 에러
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류 (처리불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리가능)
		 * 
		 * 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외 처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 	=RuntimeException의 자식이 아닌 나머지는 예외처리가 가능
		 *  
		 *  예외처리 (try-catch)
		 *  - try { } catch (Exception e) { } 
		 *  - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 *  - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 *  - catch의 ()안에는 처리할 예외를 지정해 줄 수 있다. 
		 *  	-> 파라미터가 있어야한다.(예외가 발생한 위치의 클래스를 변수로 만들어 넣어줌)
		 *  - 여러종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 *  - 발생한 예외와 일치하는 catch 블럭 안의 내용이 수행된 후 try-catch를 빠져나간다.
		 *  - 발생한 예외와 일치하는 catch가 없을 경우(ex.클래스가 다를 경우) 예외는 처리되지 않는다.
		 *  
		 */
		
		//예외 
//		int result = 10/0; 	-> 0으로 나눌수가 없어 예외 발생
//		System.out.println(result);
//		
//		Exception in thread "main" java.lang.ArithmeticException(클래스의 위치 - 클릭하면 출력하는 위치를 설정가능 ): / by zero
//		at h_exception.ExceptionHandling.main(ExceptionHandling.java:37-원인)
		
	//중간에 종료되므로 밑에 실행되지 않음 -> try-catch  사용	
	try{
		int result = 10/0; 	
		System.out.println(result);
	}catch(ArithmeticException e){ 	//파라미터 안에 객체생성	
		// -> 아무것도 없어도 try -catch로 감싸주면 예외가 정상적으로 처리 가능
		//try안에 내용은 실행되지 않음- 출력도 안됨  e.printStackTrace(); 사용하여 출력
		
		e.printStackTrace();	//예외 메시지를 출력한다. -> 아까와 같은 메시지 나옴 
			
	}
	
	
	
	
//	//여러가지 예외를 동시처리하는 방법
		try{
		int result = 10/0; 
		System.out.println(result);
		}catch(ArithmeticException | IndexOutOfBoundsException e){ //1. 파라미터를 여러개 넣는다(변수는 둘중에 하나의 타입이 된다 )
			e.printStackTrace();  
	}catch(NullPointerException e){	//2. catch를 추가하는 방법
		String str = null;		//null이 발생되는 예 
	System.out.println(str.length ());	
	}catch(Exception e){	//3.파라미터 안에  Exception 넣어주기(어떤 예외도 상관없이 파라미터로 받아줌 -> 모든 예외 처리가능 )
		
	}

	//IndexOutOfBoundsException : index가 범위를 벗어남 (배열의 인덱스 범위)	-	ex.크기가 10개인 배열에서 10번 인덱스 참조 
	//NullPointerException : null안에서 새로운 무언가를 참조하려고 함 (오류)
	

		test1();
		
		/*JVM
		 * - Method Area
		 * - Call stack : 호출되어있는 메서드 (현 - main, text1, text2 저장)
		 * - Heap : 
		 */
		
		
	}

	private static void test1() {
	test2();
		
	}

	private static void test2() {
		//	System.out.println(10/0);
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {	//예외처리를 받지않으면 컴파일 에러 발생-import하고  surround *
				e.printStackTrace();
		}  
		
		//다른 패키지 사용 - import  ->자동완성 하면 알아서 해줌(FIS써도됨)
		
		
	}
}
