package g_oop2;

public class Store {		
	// 상점만들기
	// 공통적인 속성 = 물건의 이름, 가격 (부모 클래스)
	// 상속받는 물건들
	// 구매할 손님

	public static void main(String[] args) {
		//객체 생성
		Desktop d1 = new Desktop("삼성 컴퓨터", 1000000);
		Desktop d2 = new Desktop("LG 컴퓨터", 1500000);
		
		Aircon ac1 = new Aircon("삼성 에어컨", 200000);
		Aircon ac2 = new Aircon("LG 에어컨", 250000);
		
		TV tv1 = new TV("삼성 TV", 300000);
		TV tv2 = new TV("LG TV", 350000);
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d1); //c.buy((product)d1);의 형태 : (product- d1을 형변환 하여 값을 넣어줌)		

		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac2);
		
		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv2);
		
		c.showItem();
	}

}

// 부모클래스 만들기
class Product {
	String name; // 이름
	int price; // 가격

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 상품의 정보를 반환하는 메서드
	String getInfo() {
		return name + "(" + price + "원)";
	}
}

// 상품의 정보를 상속받는 메서드
class Desktop extends Product { // 파라미터가 있어서 호출하지 못함 -> 직접 생성자 만들어서 호출

	Desktop(String name, int price) {
		super(name, price); // 생성자를 만들어 부모의 name, price 호출
	}

	void programmin() {
		System.out.println("프로그램을 만듭니다.");
	}
}

class Aircon extends Product {
	Aircon(String name, int price) {
		super(name, price);
	}

	void setTemperature() {
		System.out.println("온도를 설정합니다.");
	}

}


class TV extends Product{
	TV(String name, int price){
		super(name,price);
	}
	
	void setchanel(){
		System.out.println("채널을 변경합니다.");
	}

}


//손님을 클래스로 만들기

class Customer{
	
	int money = 100000000;
	//구매할 물건을 저장할 변수 만들기 -->TV, Aircon, Desktop = Product 타입으로 배열 만들기
	Product[] item = new Product[100]; //부모타입으로 형변환하면 저장 가능
	
	void buy(Product p){	//메서드는 정보가 필요함- 어떤 정보가 필요한지 파라미터로, 
		if (money < p.price){
			System.out.println("돈이 부족하다.");
			return;
		}
		money -= p.price; //돈을 지불 (가지고 있는 돈에서 물건을 갖고있는 만큼 뺌)
		
		for(int i = 0; i< item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했다.");
		
	}
	
//내가 가지고 있는 물건의 내용을  출력해줌ㅈ
	void showItem(){
		System.out.println("============아이템목록=============");
		for(int i = 0; i< item.length; i++){
		if(item[i] == null){
			break;
		}else{
			System.out.println(item[i].getInfo());
		}
	}
	System.out.println("=====================================");
	}
	
	
	
	
}