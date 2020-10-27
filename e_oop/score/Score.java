package e_oop.score;

import d_array.ex.score;

public class Score {

	public static void main(String[] args) {
		//클래스를 사용한 성적처리 프로그램
		
		Student [] students = new Student[10];	//기본값 - null -> 객체로 바꿔주기
		// 같은 패키지 안의 student 
		
		for(int i = 0; i < students.length; i++){
			Student student = new Student();	//*for문안에서 객체 생성해줘야함 - 학생의 값 (for문 밖에서 만들경우 똑같은 값으로 10개 저장됨) 
			
			student.name = "학생" +  (i + 1);
			student.rank = 1;
			student.kor = (int)(Math.random() * 101);
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
			
			students[i] = student;			//저장
		
		}
		

		//성적관리 프로그램을 완성해주세요.
		
		//합계와 평균 구하기
		for (int i = 0; i < students.length; i++){ //배열안 접근- 인덱스 지정
									
		students[i].sum = students[i].kor + students[i].eng + students[i].math; //클래스의 인덱스 지정
		students[i].avg = Math.round((double)students[i].sum/3 * 100) / 100.0;	// (과목수로 나누기)
		
		//students[i].avg = (int)Math.round(students[i].sum/3.0 * 100 ) / 100.0; 
		}
		
		//등수 구하기
		for (int i=0; i< students.length; i++){
			for(int j=0; j<students.length; j++){
				if(students[i].sum< students[j].sum){
					students[i].rank++;
				}
			}
			
		}
		
		for (int i=0; i<students.length -1 ; i++){
		int max = i;
			for (int j = i + 1; j<students.length; j++){
				if (students[max].sum < students[j].sum){
					max = j;
					
							
				
				}
			}
			
			
		
			
			Student temp = students[i];
			students[i] = students[max];
			students[max] = temp;

//  	=>일일히 다 바꿔줄 필요 없이 students[i]만 바꿔주면 됨
			
//			int temp = students[i].rank;
//			students[i].rank = students[max].rank;
//			students[max].rank= temp;
//			
//			int temp1 = students[i].sum;
//			students[i].sum = students[max].sum;
//			students[max].sum= temp1;
//			
//			double temp2 = students[i].avg;
//			students[i].avg = students[max].avg;
//			students[max].avg= temp2;
////			
//			String temp3 = students[i].name;
//			students[i].name= students[max].name;
//			students[max].name = temp3;
//			
//			int temp4 = students[i].kor;
//			students[i].kor= students[max].kor;
//			students[max].kor = temp4;
//			
//			int temp5 = students[i].eng;
//			students[i].eng= students[max].eng;
//			students[max].eng = temp5;
//			
//			int temp6 = students[i].math;
//			students[i].math= students[max].math;
//			students[max].math = temp6;
//			
			
			
			
		}
		
		
		System.out.println("이름\t국어 \t영어 \t수학 \t합계 \t평균 \t석차");
		System.out.println();
		for (int i = 0; i< students.length; i++){
				System.out.println(students[i].name  + "\t"+ students[i].kor + "\t" + students[i].eng + "\t" + students[i].math + "\t"
								+ students[i].sum + "\t" + students[i].avg + "\t" + students[i].rank);
				System.out.println();
				
		}
		
		//저장 필요
		int [] sums = new int [3];
		for (int i = 0; i<students.length; i++){
			sums[0] += students[i].kor;
			sums[1] += students[i].eng;
			sums[2] += students[i].math;
				
		}
		
		double[] avgs = new double[sums.length];
		for(int i = 0; i < avgs.length; i++){
			avgs[i] = (int)Math.round(sums[i] /(double)students.length * 100) /100.0;  //100.0으로 해야 소수점 둘째자리까지 , 학생수로 나누기 
		}
		System.out.print("과목 합계");
		for (int i = 0; i < sums.length; i++){
			System.out.print("\t" + sums[i]);
		}
		System.out.println();
		System.out.print("과목 평균");
		for (int i = 0; i < avgs.length; i++){
			System.out.print("\t" + avgs[i]);
		}
		
		
	}

}
