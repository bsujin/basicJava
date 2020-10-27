package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규 표현식 : 문자열의 패턴을 검사하는 표현식
		 * -> 넓은 범위의 표현보다 좁은 범위의 표현을 검사하는것이 중요 
		 * 사용하는 방법이 많아 책으로도 나옴 -> 공부하는것이 좋음
		 * 
		 *  ^		뒷문자로 시작			// ^a -> a로 시작하는문자를 검사
		 *  $ 		앞문자로 종료			// a$ -> a라는 문자열이 끝나는지 검사 
		 *  . 		임의의 문자(줄바꿈제외) 	//영어, 한글, 특수문자 상관없음
		 *  * 		앞 문자가 0개 이상		// a* -> a라는 문자가 없을수도, 여러개 
		 *  + 		앞 문자가 1개이상		// a+ -> 최소한 1개이상 
		 *  ? 		앞 문자가 없거나  1개
		 *  [] 		문자의 집합이나 범위 ([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌것) -> 그 사이의 모든 알파벳 ,숫자,문자
		 *  {} 		앞 문자의 개수 ({2} : 2개, {2,4}: 2개이상 4개이하)	
		 *  () 		그룹화 (여러개의 문자를 1개의 문자처럼 인식)
		 *  | 		OR 연산 (여러개의 문자중 1개)
		 *  \s 		공백, 탭, 줄바꿈
		 *  \S 		공백, 탭, 줄바꿈이 아닌 문자
		 *  \w 		알파벳이나 숫자
		 *  \W  	알파벳이나 숫자가 아닌 문자
		 *  \d  	숫자
		 *  \D 		숫자가 아닌 문자
		 *  (?i)	 뒷 문자의 대소문자 구분안함
		 *  \ 		정규 표현식에서 사용되는 특수문자 표현 -> \? \* 이런식으로 사용 (그냥 기호만 사용하면 문자로 인식)
	     *  
		 */ 
	
	//주로 회원가입할 때 사용( 아이디는 5~10자, 숫자와 특수기호만 사용 ) -> 조건을 만들 때 
	
		//검사 할 문자열 만들기
		
//			String str = "abc123"; 
			
			//정규표현식 검사 
		//	String regex = "[a-z]{3}[0-9]{1,3}";	//범위가 좁은 식이 좋음 
		// a-z, 0-9까지  어떤 글자든 상관 없이 3개가 온다
		//	String regex = "[a-z0-9]+"; 	//[]안에 범위를 한번에 넣을 수 있음, 뒤에 개수를 지정 해줘야함 (안하면 1개) 
		//정규표현식에 공백이 아무곳이나 들어가면 안된다(알파벳, 숫자사이에 무조건 공백이 있다 라는 의미) -> 결과값이 달라짐 
		//	String regex = "\\w*";	//앞문자가 0개이상  (\\는 2개 사용 )
//			String regex = ".*";	//어떤문자든지 상관없이 0개 이상 
	
	
//		Pattern p = Pattern.compile(regex); 	//정규 표현식을 해석해서 돌려줌
//		Matcher m = p.matcher(str);				//정규표현식과 파라미터로 넘겨진 문자열을 매치 
//		System.out.println(m.matches());
//		
		
		
		//아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		//아이디 
		String id = "bsjin7231";
		 String reg1 = "[a-z0-9]{5,20}\\_?\\-?\\w";
		
				 
		Pattern i = Pattern.compile(reg1);
		Matcher j = i.matcher(id);
		System.out.println(j.matches());
		
			
		//전화번호	
		String tel = "010-7339-1257";
		String reg2 = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
		
		Pattern a = Pattern.compile(reg2);
		Matcher b = a.matcher(tel);
		System.out.println(b.matches());
	
		
		//이메일 
		String mail = "bsjin7231@naver.com";
//	    String mail = "@naver.com";
//	    String reg3 = "\\@.\\w.*";
	    String reg4 = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))";
		Pattern c = Pattern.compile(reg4);
		Matcher d = c.matcher(mail);
		System.out.println(d.matches());
				
						
			
		}
		
		
	}


