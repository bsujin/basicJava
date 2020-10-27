package g_oop2;

public class Time {

	//시간을 표현하는 속성 : 시, 분, 초
	
	//시, 분, 초를 나타내는 변수 만들기 (아무런 접근제어자가 없는 변수)
	// -> 사용자의 잘못된 입력을 막기 위해 접근제어자를 사용 -> 메인 메서드의 변수 제어 
	private int hour;
	private int minute;
	private int second;
	
	
	
	
	
	public int getHour() {				//get - 변수에 있는 매서드를 얻기위한 매서드
				return hour;
	}
	
	public void setHour(int hour) { 	//set - 변수의 값을 저장하는 매서드
		if(hour < 0){
			this.hour = 0;
		}else if (23< hour){
			this.hour = 0;				//0일때 바뀌므로 0의 값을 넣어준다.
										//set에 올바른 값을 저장하기
		}else{							//조건 = if문 사용 (시간은 0~23 , 아니면 올바른값을 저장하도록)
			this.hour = hour;								//0보다 작은값은 0, 23보다 큰값은 23으로 맞춰주기
		}
	 		
	}
	
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute < 0){
			this.minute = 0;
		}else if( 59 < minute){
		this.minute = 0;
		setHour(this.hour +1);
		}else {
		this.minute = minute;
		
	}
	}
	
		
	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0) {
			this.second = 0;
		} else if (59 < second) {
			this.second = 0;
			setMinute(this.minute +1);			
		} else {
			this.second = second;
			
		}
	}


	//변수에 접근하는 매서드를 만드는것  Source - Getters and Setters - select all => 매서드 생성 (6개의 매서드를 만들어줌)
	
	//시간을 알려주는 매서드 만들기 -> AccessModifier가서 set으로 시작하는 매서드 호출 (변수값 저장)
	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	//시간이 계속 나오도록 하기 (초가 증가 -> 분이 바뀌도록, 분이 증가 -> 시가 바뀌고 증가)
	
	//초가 증가 
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(100);			//1초 동안 멈추고
			setSecond(second + 1);			//증가 
			}
	}

	//분이 증가 
	
	
		//stop 매서드 만들기	//Threda.sleep - 파라미터가 넘겨진 시간만큼 정지함 -  
								//Thread.sleep(i); + (Ctrl +1) surround try 클릭
	private void stop(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
