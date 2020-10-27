package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * 메서드 예외 선언하기 
		 * - 메서드 호출 시 발생할 수 있는 예외를 선언해 줄 수 있다.
		 * - void method() throws IOException { }
		 * - try 처리를 하지않아도 가능
		 * - 메서드의 구현부 끝에 throw 예약어와 예외 클래스명(throws IOException)으로 예외를 선언 할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
		//매서드 호출 -> 매서드 만들기 -> 매서드 안에서 강제로 예외 발생 -> 예외 처리대신 선언 - 넘겨줄 수 있음 -> 메인 매서드를 TRY-CATCH처리
		
		try {
			method();	
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		try {
			new FileInputStream ("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	 //예외처리를 반드시 해줘야함 (생성자 호출-생성자에 예외가 선언- 확인 F3)
				
	
	}

	private static void method() throws IOException {	//매서드 만들기
		//강제로 예외 발생시키기 - 예외처리 대신 예외를 선언해줌
		//매서드 안이 아니라 메인 매서드에서 예외를 처리해줌 -> 메인 매서드를  TRY-CATCH

		throw new IOException();
				
		
	}
}



