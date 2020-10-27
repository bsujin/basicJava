package RPG;

public class Chracter {

	String name;	//이름
	int hp;			//체력
	int maxHp;		//최대체력
	int att;		//공격력
	int def;		//방어력
	int exp;		//경험치
	int level;		//레벨

	
	
	Chracter(String name, int hp, int maxHp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.hp = this.maxHp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
	}
	
	void showInfo(){
		System.out.println("================================");
		System.out.println("----------상태-----------------");
		System.out.println();
	}
	
	
	
}
