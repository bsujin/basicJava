package e_oop.ex;


public class Calculatoroop {
	
	public static void main(String[] args) {	
	// Calculator의 한줄씩 계산해서 최종 결과값을 출력	
		//1. 123456+654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
			//4. 3번의 결과값 - 654321
			//5. 4번의 결과값 % 123456
			
			
		
		
		//객체생성
		Calculator ca = new Calculator();
	
		//1.
		long a = ca.plus(123456l, 654321l);
			System.out.println(a);
		
			//2.						
		long b= ca.mul(a, 123456l);
		System.out.println(b);
		
		//3.
		long c = ca.div(b, 123456l);
		System.out.println(c);
		
		//4.
		long d = ca.min(c, 654321l);
		System.out.println(d);
		
		//5.
		long e = ca.rem(d, 123456l);
		System.out.println(e);
		
		
			
		
//		
//		Calculator c1 = new Calculator();
//	
//		double result = c1.add(123456,654321);
//		result = c1. multiply(result, 123456);
//		result = c1. divide(result,123456);
//		result = c1. subtract(result, 654321);
//		result = c1. mod (result, 123456);
//		System.out.println(result);
//	
	

}
}