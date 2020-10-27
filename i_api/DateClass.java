package i_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// import => java.util, java.sql 두가지의 패키지 존재 
		
		//date 클래스 객체 생성 - 기본적으로 저장 되어있는 날짜 => 현재날짜,시간이 저장
		Date today = new Date();
		System.out.println(today);
		//기본적 출력 방식 : 보기 불편한 방식
			
		//바꿔주기
		// 날짜 -> 문자열 (SimpleDateFormat 사용)
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS"); 		//SSS : 1/1000단위로 표현  
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //년월일 시분초
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss a"); //뒤에있는 20 두자리만 표현
		//(E) 요일                a : 오전 오후 표시 
		//y : 연도  / M : 월을 나타냄 (대소문자를 가린다) , d: 일	
		//HH (대문자 - 24시간 기준 ) , mm : 분 
		 
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		
		//문자열 -> 날짜
		String str = "1987년 05월 01일";
		//-> date객체로 바꿔주기 - 날짜 적힌 그대로 포맷 
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		//서로 포맷이 맞지 않으면 컴파일 에러 발생 (데이트 객체로 바꿀 수 없다) -> 예외처리 (0000이 들어감)
		try {
			Date dateStr = sdf5.parse(str);
			System.out.println(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		} 	
		
		
		
		// Calendar사용
	
		//변수저장 = 매서드 호출  (객체 생성이 아니라 매서드 호출로 사용)
		new Date();	 							//객체생성 : 각각의 고유한 객체 
		Calendar cal = Calendar.getInstance(); //싱글톤 패턴  : 객체를 한번만 만들어 사용 - 객체를 만들어서 빌려줌 
		//Calendar cal = Calendar.getInstance(); //처음에만 객체생성, return 되는 객체는 똑같음 
	
		cal.setTime(new Date());				//set타임을 통해 데이트 객체를 넘겨줌
		cal.set(2020, 8, 29); 					//2020/09/29(월은 0부터 시작 -> 9가 아니라 8)
		
		System.out.println(cal.getTime());
	
		
		
		// 날짜 계산 
		 cal.add(Calendar.YEAR, 1); //2020년도에 1만큼 더하겠다
		 cal.add(Calendar.MONTH, 2); // 월에 2를 더한다 (월은 0~11)
		 cal.add(Calendar.DAY_OF_MONTH, -3); // 음수를 넣으면 빼기
		 cal.add(Calendar.HOUR, 4);		//4시간을 더해준다
		 cal.add(Calendar.MINUTE, 10); 	//10분을 더해준다
		 cal.add(Calendar.SECOND, -15);	//-15초
		 cal.add(Calendar.DAY_OF_WEEK, 10); // 1~7 : 일~토
		 	 
		 System.out.println(sdf3.format(cal.getTime()));
		 
		 
	}									
}
