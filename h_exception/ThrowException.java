package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * 예외 발생시키기
		 * - throw new Exception(); 
		 * - throw 예약어와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다. 
		 */
		//예외가 발생되면 객체 생성
		
		IOException ioe =  new IOException();
		
		try {
			throw ioe;	//컴파일 에러 - 예외처리를 해줘야함 
			} catch (IOException e) {
			 e.printStackTrace();
		} 
		
		//거의 사용하지는 않음, 예외가 발생하는 상황 테스트시 사용 
		
		
	}

}
