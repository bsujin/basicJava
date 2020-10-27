package e_oop;

import java.util.Scanner;

public class ScanUtil {
	 
	
	private static Scanner s = new Scanner(System.in);
	
	//매서드가 유틸리티 성향의 메서드인 경우 static을 붙인다.
	//한줄로 쉽게 사용 가능한것이 유틸리티(자주,많이 사용)
	
	public static String nextLine(){
		return s.nextLine();
		
	}
		
	
	public static int nextInt() {
			//Math.random() 
			//Math.round(a)	--반올림 해주기 위해 매서드를 만듦 
					
	return Integer.parseInt (s.nextLine());
		
		
	}
	}
	
	
	

