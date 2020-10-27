package g_oop2;

public class Starcraft {

	public static void main(String[] args) {
		
		//전략 시뮬레이션 게임 - 테란(scv-기계수리, 자원)
			
		//객체생성
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
	
//		scv.repair(marine); //repair를 상속받지 않은 marine 은 컴파일 에러 발생
	}

}


class Unit{
	int hp;					//현재체력
	final int MAX_HP; 		//최대 체력(초기화 안해주면 컴파일 에러발생)
	
	Unit(int hp){			//생성자를 통해 초기화
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit {	//파라미터가 있어 컴파일 에러 -> 반드시,생성자 호출
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}


class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}

	// scv-수리하는 매서드
	void repair(Repairable r){  
		if(r instanceof Unit){	//Unit으로 형변환이 가능한지 확인
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
			u.hp++;
			}		
		}
	}
}

//파라미터로 받을 만한 타입이 없을때, 인터페이스 작성 (Marine빼고 묶어주기)

interface Repairable {
	
}



