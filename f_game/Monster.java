package f_game;

public class Monster {
	
	String  name; 	//이름
	int maxHp;		//최대체력
	int hp;			//체력 
	int maxMp;		//최대마나
	int mp;			//마나
	int att; 		//공격력
	int def; 		//방어력
	int level; 		//레벨
	Item[] items;  	//보유아이템 
	
	//여러종류의 몬스터 = 하나의 클래스 , 몬스터마다 속성 다르게 해야하므로 "생성자" 사용
	//몬스터에 대한 생성자 만들기
	
	Monster(String name, int hp, int mp, int att, int def, Item[ ] items ){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.att = att;
		this.def = def;
		this.items = items;
		}
	
	void attack(Character m){
		//몬스터는 캐릭터를 공격 - 파라미터 변경
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage; 				
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; 
		System.out.println(name + " 가 공격으로 " + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	//공격 당했을때 아이템을 주는 매서드 - 몬스터가 죽었을 때 랜덤으로 생성
	Item itemDrop(){
		return items[(int)(Math.random() * items.length)];
	}

}



