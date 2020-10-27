package f_game;

import e_oop.ScanUtil;

public class MyGame {

	
		//RPG게임 만들기
		
		//1. 캐릭터 만들기
		//2. 몬스터 , 몬스터를 잡으면서 레벨업
		//3. 잡으면 아이템 떨어짐
		// 만드는 순서 : 등장인물 ( 캐릭터, 몬스터, 아이템 ) 클래스 만들기  -> 메인 메서드에 등장인물들로 내용 만들기
		
		
		Character c;
		Item[ ] items;
	
		MyGame(){
			c = new Character("가렌", 100, 50, 20, 10);
			items = new Item[10];
			items[0] = new Item("무한의 대검", 0, 0, 10, 0);
			items[1] = new Item("가시갑옷",0,0,0,10);
//			items[2] = new Item("")
		}
		
		//메인 매서드는  static이 붙어있어 사용 불편함 - 시작값만 줌
 public static void main(String [] args){
	//자신의 클래스이기 때문에 클래스 객체를 만들 수 없다.		
	 new MyGame().start();
			
			
		}
		void start(){
				int input = 0;
				//String input = 0;
				battle : while(true){	//반복문에 이름 (battle)붙임
					System.out.println("1.내정보 \t2.사냥 \t3.종료");	//cf) 
					//사냥 - 사냥터 선택 - 여러가지 몬스터 나오게 
					//input = ScanUtil.nextLine();
					input = ScanUtil.nextInt();
					
					switch(input){
					case 1 : 
					//"w" (case 옆의 값은 순번이 아니라 switch(여기)여기안에 들어가 있는 값과 같은 경우를 말하는 것이다.
						c.showInfo();
						break;
						
					case 2: 
						hunt();	//다른 매서드에서 사냥 호출
						break;
						
					case 3:
						System.out.println("종료되었습니다.");
						System.exit(0);		//프로그램을 종료시키는 매서드
						break;
					}
					
				}
			
			}
		void hunt(){
				Monster m = new Monster("고블린" , 20, 10, 15, 10, new Item[]{items[0], items[1]});
				System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
				
				int input = 0; //몬스터에 대한 캐릭터의 행동 입력받기
				battle : while(true){
					System.out.println("1.공격\t2.도망");
					input = ScanUtil.nextInt();
					switch(input){
					
					case 1: //공격
						c.attack(m);	//캐릭터가 몬스터 공격
						if(m.hp <= 0 ){ //몬스터의 체력이 0보다 작아지면 죽는내용
							System.out.println(m.name + "을 처치하였습니다.");
							c.getExp(100);
							c.getItem(m.itemDrop());
								break battle;	//몬스터가 죽음- 전투종료
								}
							m.attack(c);	//몬스터가 캐릭터 공격
							break;
					
					case 2 : //도망
						break battle;
					}
				}
				
				
			}

}
