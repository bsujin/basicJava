package e_oop.ex;

public class TV {

	//TV에 여러가지 속성 = 변수로
	// 채널, 음량(볼륨조절), 전원(티비 ON,OFF) - 매서드
	//채널 - 직접입력, 채널 1씩 증가, 1씩 감소 - 3개의 매서드
	// 전원  on ,off 2개
	// 음량 올리거나 내리거나 2개 

	// tv에 쓸 변수 ( 전역변수 설정)
	boolean power;
	int ch;
	int vol;
	
	final int max_ch = 50;
	final int min_ch = 1;
	final int max_vol = 30;
	final int min_vol = 1;
	
	// 기본값 설정
	
	TV(){	 
		power = false;
		ch = 1;
		vol = 5;
	}
	
	//전원 켜짐
	void power (){
		power = !power;
				System.out.println(power? "tv켜짐" : "tv꺼짐" );
	}
	
	//채널 설정 
	void changech (int ch){
		if (power){
		if(min_ch<= ch && ch <= max_ch){
			this.ch = ch;
		}System.out.println("채널 : " + this.ch);
		}
	}
	
	//채널 변경
	void chUp (int ch){
		changech(ch++);
	}

	void chDown(int ch){
		changech(ch--);
	}

	//볼륨변경
	void volUp(int vol){
	if (power){
		if (vol<=max_vol){
				vol++;
		} showvol();
	}
	}
	void voldown(int vol){
		if (power){
			if(min_vol <= vol){
			vol--;
		} showvol();
	}
	}
	
	void showvol(){
		System.out.println("음량 : ");
	for(int i=min_vol; i< max_vol; i++ ){
		if(i <= vol){
			System.out.println("▲");
		}else{
				System.out.println("▽");	
		}
	}System.out.println();
	}	
	}
