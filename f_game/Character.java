package f_game;

public class Character {
	
	
	String  name; 	//이름
	int maxHp;		//최대체력
	int hp;			//체력 
	int maxMp;		//최대마나
	int mp;			//마나
	int att; 		//공격력
	int def; 		//방어력
	int exp; 		//경험치	
	int level; 		//레벨
	Item[] items;  	//보유아이템 -클래스새로 생성
		
	// 생성자 만들기 - 생성자는 클래스 이름과 동일
	
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHp = hp; 	//파리미터로 받은 값으로 초기화
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
				
	}
	
	//캐릭터의 상태창 만들기
	
	void showInfo(){
		System.out.println("====================================");
		System.out.println("---------------상태------------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)"); 	//최대 경험치를 100의로 표시 -> 100이 넘어가면 레벨업 
		System.out.println("체력 : " + maxHp);
		System.out.println("마나 : " + maxMp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("-----------------아이템-----------------");
		for (int i = 0; i< items.length; i++){
			if(items[i] != null){	//기본값이  null이므로 null이 아닌값 넣어주기
				System.out.println(items[i].itemInfo());
				}
		}
	System.out.println("=========================================");
	
	
}
	
	//몬스터 사냥 (주업무)
	void attack(Monster m){
		//데미지 계산하는 공식
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage; //삼항연산자 사용 = 0보다 작으면 안됨, -가 나오면 체력이 찰 수있다. (공격력이 방어력보다 큰 경우 -가 될수 없도록)
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; //데미지가 몬스터가 가진 체력보다 클 수 있다. (체력만큼만 감소시키기)
		System.out.println(name + " 가 공격으로 " + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	//경험치 획득
	
	void getExp(int exp){
		
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){ 	//경험치가 100 이상인 경우 레벨업 해주기 위해 사용
			levelUp();
			this.exp -= 100; 	// 레벨업을 할때마다 경험치가 100 감소
		}
		}
	
	//레벨업을 하면 생기는 값
	void levelUp(){ 
		level++; 
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp; //현재 hp를 채워주는것 
		mp = maxMp;
	System.out.println(" LEVEL UP!! ");	
	}
	
	//아이템을 얻는 매서드  (파미터로 받은 아이템 - 배열에 넣어주기) 
	void getItem(Item item){
		System.out.println(item.name + " 을 획득하였습니다.");
		for(int i = 0; i < items.length; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		
		//아이템의 능력만큼 증가시키기
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	
		}
	

}



