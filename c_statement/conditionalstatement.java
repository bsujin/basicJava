package c_statement;

import java.util.Scanner;

public class conditionalstatement {

	public static void main(String[] args) {
		//블럭이 시작되는 곳, 계층 표현 (tab 사용) 
		//*정렬 (블록지정 + ctrl + shift + f)
		// 찾아서 바꿔주기 ctrl + f
		
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if(조건식){} : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다. (= 다 false인 경우)		
		 */
		

		int a = 1;
		
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		 
		if (a == 0) { 
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		} // if 문이 수행되지 않고 종료됨
		
		
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}if (a == 0) { 
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}	//if 뒤에 if문 사용=> 두개 다 실행됨(별개의 조건)
		
		
		if (a == 1) {
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if (a == 2){
			System.out.println("a가 2인 경우에 하고싶은것");
		}else if (a == 3){
			System.out.println("a가 3인 경우에 하고싶은것");
		}else{
			System.out.println("이외의 경우에 하고싶은것");
		}				
		//if 뒤에 else if 사용 => 한 문장, 둘 중 하나만 실행 - 실행 순서 (위-true-수행, 밑에 조건 상관없이 끝/ false여야 다음으로 수행)
		
		
		//예제 ) 시험점수가 60점 이상이면 합격, 그렇지 않으면 불합격
		
		int test = 60;
		if (test <= 60){
		System.out.println("합격");
		}else { 
			System.out.println("불합격");
		}
		
		
		
		
		// 성적에 등급(a~f)을 부여하는 프로그램을 작성해주세요. (60미만 f)
		int avg = 80;  
		String grade = null;	  //아무런 값이 없는것으로  초기화 해줘야함  (else가 없는 경우 오류 가능성)
		
		//100을 넘지 않는다는 조건 필요  
		if (avg <= 90 && avg <= 100) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else { System.out.println("F");}
		
		
		
			//_7점 이상 A+ 미만 - 조건 추가
		
		avg = 100;
		grade = null;
		
	
		
		if (avg >= 90) {
			grade = "A";
			if (97 <= avg) {
				grade += "+";
			} else if (avg <= 93) {
				grade += "-";
			}
		} else if (avg >= 80) {
			grade = "B";
			if (87 <= avg) {
				grade += "+";
			} else if (avg <= 83) {
				grade += "-";
			}
		} else if (avg >= 70) {
			grade = "C";
			if (77 <= avg) {
				grade += "+";
			} else if (avg <= 73) {
				grade += "-";
			}
		} else if (avg >= 60) {
			grade = "D";
			if (67 <= avg){
				grade += "+";
			}else if (avg <= 63){
				grade += "-";
			}
		}  else { 
			grade = "F";
			}
		
		
		
			System.out.println(avg + "점에 대한 등급은 " + grade + " 입니다.");
				
				
				/*
				 * switch문
				 * - switch(int/string){ case 1 : break; }   
				 * - 조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용) 허용한다.
				 * - 조건식과 일치하는 (값이 같은)case문 이후의 문장을 수행한다.
				 */ 
				//case는 break 까지만 출력 (예제에 case 1 에서 2 까지 실행하려면, break 없애기) 
				//default는 그 외의 값 출력 (있을 수도, 없을수도)
				//switch는 조건이 제약, 주로 if문 많이 사용 

		a = 4;
		switch (a) {
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은것");
			break;
		case 3:
			System.out.println("a가 3인 경우에 하고싶은것");
			break;
		default:
			System.out.println("a가 1,2,3이 아닌 경우에 하고싶은것");
							}
		
			//문장인 경우
				
		String b = "a";
		switch (b) {
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것 ");  //-> \가 앞에 붙으면 역할이 바뀜
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것 ");
			break;
		default:
			System.out.println("그외의 경우에 하고싶은것");
			break; //여기서의 break는 큰 의미없음
		}
	
		//주어진 월에 해당하는 계절을 출력해보자.
		int month = 1;   
		String season = null;
		switch(month){
		
		//3-5월 봄
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
			
		//6-8월 여름
		case 6: case 7: case 8:
			season = "여름";
			break;
			
		case 9: case 10: case 11:
			season = "가을";
			break;
			
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월의 계절은 " + season + " 입니다.");
		
		
		//case문을 줄이는 방법 : 
		
		avg = 90;
		grade = null;
		switch(avg / 10){
		
		case 10: case 9:  grade = "A";
			break;
			
		case 8: grade = "B";
			break;
		
		case 7: grade = "c";
			break;
			
		case 6: grade = "D";
			break;
		default :  	grade = "F";
			break;
			
		
	}

		System.out.println(avg + "점에 대한 등급은" + grade + "입니다.");
		
		
		
	//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력해주세요 >");
		int num;
		num = Integer.parseInt(sc.nextLine());
	 	
		
		//조건문
		if ( num == 0){
			System.out.println(num +"0입니다.");
		}else{
			System.out.println(num + "0이 아닙니다");
		}
	
		
		//case문
		switch (num){
		case 0:
			System.out.println("0입니다.");
		break;
			default:
			System.out.println("0이 아닙니다.");
		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
		System.out.println("숫자를 입력해주세요 >");
		a = 0;
		a = Integer.parseInt(sc.nextLine());
		
		if (a%2 == 0){
			System.out.println("짝수");
		}else { 
			System.out.println("홀수") ;
		}
		
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		
		System.out.println("국어>");
		int num1;
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어>"); 
		int num2;
		num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학>"); 
		int num3;
		num3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("점수의 총합은 " + (num1 + num2 + num3));
		
		double av1 = (num1 + num2 + num3)/3;
		
		System.out.println("점수의 평균은 " + avg);
		

		if (avg >= 90) {
			grade = "A";
			if (97 <= avg) {
				grade += "+";
			} else if (avg <= 93) {
				grade += "-";
			}
		} else if (avg >= 80) {
			grade = "B";
			if (87 <= avg) {
				grade += "+";
			} else if (avg <= 83) {
				grade += "-";
			}
		} else if (avg >= 70) {
			grade = "C";
			if (77 <= avg) {
				grade += "+";
			} else if (avg <= 73) {
				grade += "-";
			}
		} else if (avg >= 60) {
			grade = "D";
			if (67 <= avg){
				grade += "+";
			}else if (avg <= 63){
				grade += "-";
			}
		} else { 
			grade = "F";
			}
			
		//숫자 3개를 입력받아 오름차순으로 출력해주세요.
		//a b c
		
		System.out.println("첫번째 숫자를 입력해주세요>");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 숫자를 입력해주세요>"); 
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println("세번째 숫자를 입력해주세요>"); 
		int z = Integer.parseInt(sc.nextLine());
		
		if(x > y){
			    x=y;
	            y=x;
	        int t = x;	//x의 값을 보관하여 바꿈
	        } 
		if( x > z ){
	        	x=z;
	        	z=x;
	        	int t = z;
	        }
		if(y > z){
	        	y=x;
	        	x=y;
	        int t = z;
	        }
	           System.out.println(x + " , " + y + " , " + z);
	           
	           	        }
	        
	   
	           


			
	        	            
	            
	            
	            
		} 
		
		

		
	
				
