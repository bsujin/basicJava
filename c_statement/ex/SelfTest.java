package 

c_statement.ex;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		
		System.out.println("해당하면 1, 해당하지 않으면 0");
		  
		
		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다 ");
		int a1 = Integer.parseInt(sc.nextLine());
				
		System.out.println("밥,빵,과자 등 음식을 먹기 시작하면 끝이없다 ");
		int a2 = Integer.parseInt(sc.nextLine());
	
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다 ");
		int a3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("정말 배고프지 않더라도 먹을 떄가 있다 ");
		int a4 = Integer.parseInt(sc.nextLine());
		
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지않는다");
		int a5 = Integer.parseInt(sc.nextLine());
		
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다");
		int a6 = Integer.parseInt(sc.nextLine());
		
		System.out.println("책상이나 식탁 위에 항상 과자,초콜릿 등이 놓여있다");
		int a7 = Integer.parseInt(sc.nextLine());
		
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안잡힌다");
		int a8 = Integer.parseInt(sc.nextLine());
		
		System.out.println("과자, 초콜릿 등 단 음식은 상상만해도 먹고싶어진다");
		int a9 = Integer.parseInt(sc.nextLine());
		
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못간다");
		int a10 = Integer.parseInt(sc.nextLine());
		
		int sum1 =  a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
		
		
		if (sum1<=3){
			System.out.println("주의! 위험한 수준은 아니지만 관리필요");
		}else if (sum1<=4 && sum1<=6){
				System.out.println("위험 ! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
				}else {
					System.out.println("중독! 전문의 상담이 필요함");
				}
			
		System.out.println(sum1 + "개");
	
	}

}
