package e_oop.ex;

public class Calculator {
	//+ * - / % 연산자 하나당 하나의 메서드 만들기
	//두개의 파라미터를 가지고 있음 - 데이터로
	
	
	long plus (long p1, long p2){
		return p1 + p2;
	}
	
	
	long min (long p1, long p2){
		return p1 - p2;
	}
	
	long mul (long p1, long p2){
		return p1 * p2;
	}

	long div (long p1, long p2){
		return p1 / p2;
	}
	
	long rem (long p1, long p2){
		return p1 % p2;
	}
	


	double result = 0;
	
	double add (double p1, double p2){
		return p1 + p2;
	}
	
	
	double subtract (double p1, double p2){
		return p1 - p2;
	}
	
	double multiply (double p1, double p2){
		return p1 * p2;
	}

	double divide (double p1, double p2){
		return p1 / p2;
	}

	double mod (double p1, double p2){
		return p1 % p2;
	}
	
	
}
