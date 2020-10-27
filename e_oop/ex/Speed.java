package e_oop.ex;

public class Speed {
	
	

	
	
	int speed;
		
	void on (){
		System.out.println("시동이 켜졌습니다.");
	}
	
	void run (){
	for (int i = 10; i< 60; i+=10){
		speed = i;
			System.out.println("현재 시속은  : " + i + "입니다.");
	
			if (i == 50){
			System.out.println("속력을 줄이세요.");
			break;
		}
		
	}
	}
	
	
	

}
