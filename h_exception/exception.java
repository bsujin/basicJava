package h_exception;

public class exception {

	public static void main(String[] args) {
	//예외 발생 
		int number = 100;
		int result = 0;
//		for (int i=0; i<10; i++){
//			result = number/(int)(Math.random()*5);
//			System.out.println(result);
//		}
// 실행 결과 - 50, 100이 발생되다 예외 		
//		Exception in thread "main" 
//		50 	100
//		java.lang.ArithmeticException: / by zero
//			at h_exception.exception.main(exception.java:10)
//
		//반복횟수가 2회만 진행하고 프로그램 종료 -> 예외 발생되어도 진행되어야한다
	

		for(int i=0; i<10; i++){
			int re = (int)(Math.random()*5);
			System.out.println("이거 " + re);
		try{
			result = number/re;
			System.out.println(result);
		}catch (ArithmeticException e){
			System.out.println("0으로 나누지 마시오");
			//예외 발생할때 문자가 나타남
		}
	}
		
		
		
	}

}
