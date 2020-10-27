package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String 
		 * - 여러개의 문자(배열)를 사용하기 쉽게 만들어 놓은 클래스
		 * 
		 * String의 주요 메서드
		 * - equals(): 문자열의 내용이 같은지 반환한다.
		 * - length(): 문자열의 길이를 반환한다.
		 * - charAt(): 특정 인덱스에 위치한 문자를 반환한다.
		 * - substring () : 문자열의 특정 부분을 잘라서 반환한다.
		 * - indexOf(): 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * - contains(): 문자열이 특정 문자열을 포함하고 있는지 반환한다.
		 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
		 * - trim(): 문자열 앞 뒤의 공백을 제거해 반환한다.
		 * - valueOf(): 다른 타입의 데이터를 문자열로 변환해 반환한다.
		 * - replace(): 문자열 내의 특정 문자를 다른 문자로 변경한다.
		 * 
		 */
		//API : 어떤 기능을 사용하기 쉽게 만든것 
	
		//문자열 비교 equals-boolean 타입으로 반환
		boolean equals="문자열".equals("문자열");
						
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));
		// System.out.println(str2.equals(str1));  str2가 null이므로 에러발생
		//null이 있을 수 있는 변수를 뒤에둔다 ( 앞에두면 에러발생)
		
		
		//length
		String str = "12345";
		int length = str.length();
		for (int i = 0; i < length; i++){
			char charAt = str.charAt(i);		//반환해주는 타입이 문자열 - char
			System.out.println(charAt);
			//1,2,3,4,5가 하나씩 반환되면서 출력(charAt)
		}

		
		//문자열 뒤집기 (rev)
		//위의 12345를 뒤집어 출력 -> 문자열 뒤에서부터 charAt을 사용하여 하나씩 가져오기
		String rev = "";	
		//뒤집어줘야 하므로 0이 아니라  str.length로 
		for(int i = str.length() -1; 0 <=i; i--){
			rev += str.charAt(i);
			}System.out.println(rev);

			
		//substring	
		str = "0123456789";
		String sub1 = str.substring(3);	//3번 인덱스부터 잘라서 반환한다.
		System.out.println("1 : " +sub1);
		String sub2 = str.substring(5,8);		//5번 인덱스부터 8번 인덱스 전까지 잘라서 반환한다 (5,6,7 =  끝 인덱스는 포함되지 않는다)
		System.out.println(sub2);

		
		//위치를 알려줌 (indexOf) -> int 타입으로 반환해줌 (문자열 찾기)
		str = "수박 오렌지 귤 블루베리";					//-> 3번째에서 시작되므로 3라고 값 출력
		int index = str.indexOf("오렌지"); 				//오렌지의 시작 인덱스를 반환한다 
		System.out.println(index);
		
		//substring(문자열자르기) 과 indexOf를 조합해서 문자열 자르기
		//이름만 잘라오고 싶은데 길이가 달라 index를 통해 찾는것 
		String [] menu = {
				"수박 20000원",	//수박  (공백이 있음)=> 단어의 끝을 공백으로 찾음
				"오렌지 10000원",
				"귤 500원",
				"블루베리 3000원"
		
		};
		
		for (int i = 0; i<menu.length; i++){
			//스트링 타입으로 저장  = "공백"으로 잘라서 
			String name = menu[i].substring(0, menu[i].indexOf(" ")); 	
			System.out.println(name);
		}
	
		for (int i = 0; i< menu.length; i++){
			String name = menu[i].substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원"));
			//시작인덱스값이 다 다르므로 공통된 공백으로 지정 , indexOf를 통해 문자열을 찾아줌
			//공백을 int로 하면 에러 * 공백을 지워주기-> 공백 다음이므로 (+1을 해줘야함) 
			//=>substring(시작인덱스.indextOf(문자열),출력할 문자열다음(그 전까지 출력됨).indextOf("문자열")
			int num = Integer.parseInt(name);
			//다른 방식 : int num = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원"))); 
			System.out.println(name);
		} 	
		
		//포함여부를 알려줌(contains)
		//문자열이 포함되어있는지 아닌지 => true, false로 반환 - boolean타입
		str = "abcd";
		// 저장
		boolean contains = str.contains("c");
		System.out.println(contains);
	
		//오렌지가 메뉴의 몇번 인덱스에 있는지 찾기
		for (int i = 0; i <menu.length; i++){
			if (menu[i].contains("오렌지")){ 	//오렌지라는 단어를 찾기 
			//if (오렌지가 포함되어있는 인덱스를 알 수있는곳)
			System.out.println("오렌지" + i + "번 인덱스에 있습니다.");
		}
		}
		
		//문자열을 split() 파라미터 안에있는 기준으로 나누는것을 string타입 배열형태로 나눠줌
		str = "a/b/c";
		String [] split  = str.split("/");	 //(/을 기준으로 나누기)
		System.out.println(Arrays.toString(split));
		
		//split을 사용하여 메뉴명과 가격을 나누기 => 공백으로 나누기(for문 사용)
		for(int i = 0; i< menu.length; i++){
			String[] m = menu[i].split(" ");
			//=> 이름은 0번 인덱스, 가격은 1번 인덱스로 들어감
			System.out.println("메뉴명 : " + m[0] + " \t 가격 : " + m[1]);
		}
		
		
		
		//공백제거 = trim 
		str = "   문자열    ";		//앞 뒤의 공백만 없애줌
		String trim = str.trim();
		System.out.println(" [" + str + "]  ->  [" + trim + "] ");
		
		//trim은 주로 사용자의 입력을 실수하는것을 방지할 때 사용
		// 사용자의 실수로 아이디나 비밀번호 앞 뒤에 공백이 들어가는 것을 방지하기 위해 사용할 수 있다.
		String id = "  myid";
		String password = " mypassword "; //특히 뒤에 공백은 찾기 어려움
		System.out.println("trim 사용 전 ");
		System.out.println(id);
		System.out.println(password);
		System.out.println("trim 사용 후 ");
		System.out.println(id.trim());
		System.out.println(password.trim());
	
	
	//string이 아닌 다른 타입의 변수를 string으로 변환
	//문자열로 변경방법 2가지
	//1. value of 2.number + "" ; (number에 공백을 더해줌=> string이 됨 )
		
		int number = 10;
		str = number + "";
		str = String.valueOf(number);
		
		
		
		
		//REPLACE 
		//문자열 안에서 어떤특정한 문자열을 다른 문자열로 바꿔줌 
		
		str = "123456789";
		str = str.replace("3","짝");	 //(3을 짝으로 바꾸겠다) (문자열안에 문자열, 바꿀 문자열)
		System.out.println(str);
		
		str =  str.replace("6","＃");
		str =  str.replace("9", "☆");
		System.out.println(str);
		
		//바꿀 문자열이 3개면 다같이 바뀜 -> 같은 문자열이 여러개이면 다 같이 바뀐다.
		
		str = "banana";
		str = str.replace("a","u");
		System.out.println(str);
		
}
}