package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터타입
		 * - 데이터의 최종 진화된 형태이다. (변수 -> 배열 -> 클래스)	
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 */
		
		//변수 (1개의 변수에는 1개의 데이터만 저장)
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		// 배열 (같은 타입의 데이터를 여러개 저장)
		int [] scores;
		int sum2;
		double avg2;
		String name2;
		
		Student  student; //참조형 타입 변수 
		student = new Student(); //초기화 해주기 : 객체 생성 (인스턴스화)
		
		student.kor = 80; //값 저장
		student.eng = 90;
		student.math = 60;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "홍길동"; 
		
		
		System.out.println(student.name);	//위에 저장 된 값을 출력
		System.out.println(student.avg);
		
		
		
	}

}

//클래스  -설계도 만듦
class Student{	//클래스의 타입을 가진 변수를 만들어 사용 
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}












