package 백수진;

import java.util.Scanner;


public class Start {
	
	public static void main(String[] args) {
		
	  
		Scanner sc = new Scanner(System.in);	//입력받는 객체
		GameRull r = new GameRull();			//게임 룰 클래스 객체 
		User user = new User();					//user 클래스 객체생성
		r.Rull();								
		user.showInfo();
}
}	


