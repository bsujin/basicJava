package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 * finally
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생 여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동 자원 반환
		 * - try(변수선언;변수선언) { } catch(exception) { }
		 * - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try블럭 종료시 자동으로 반환된다.
		 * 
		 */
		//예외가 반드시 실행되어야 한다 할때 finally에 넣어줌 
		//FileInputStream : 파일을 읽어오는 객체 (운영체제 도움을 받으므로 close를 꼭 붙여야한다 - 안닫으면 메모리 낭비)
		
		FileInputStream fis = null; //파일 읽기
		
		try {
			fis = new FileInputStream("d:/file.txt");	//()안에 있는 위치의 파일을 읽겠다.
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally { 	
				try{
					fis.close();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
	
//		 예외 발생 : TRY -> CATCH -> FINALLY
//		 예외 미발생 : TRY -> FINALLY

		//	자동자원반환 (jdk1.7) - 코드가 너무 길어지므로 사용
		// FileOutputStream : 파일을 만드는 스트림
		
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str = "아무 내용이나 써보자...";
			
			byte[] bytes = str.getBytes();	//바이트로 쪼개어 배열 생성
			
			for(int i = 0; i< bytes.length; i++){
				fos.write(bytes[i]);
			} 
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
}
