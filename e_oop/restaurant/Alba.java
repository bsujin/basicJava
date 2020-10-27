package e_oop.restaurant;

public class Alba {
	
	
	//파라미터와 리턴타입 정하는것이 중요
	//메서드 : 알바가 할 일 (보스가 알바에게 시킨 일)
	//파라미터 : 일을 하기 위해 필요한 것 (보스가 알바에게 주는 것)
	//리턴타입 : 일을 하고 난 후 돌려주는 것 (알바가 보스에게 주는 것)
	
	//주문받기 위해 필요한 것? 파라미터 없음
	//주문 받은 후 보스에게 줄 것? 주문서 -음식의 목록 String타입 (제대로 하려면 클래스 배열 사용)
	
	//1. 주문받음
	String[] order () { 
		System.out.println("주문 하시겠습니까?");
		return new String[]{"짜장면", "탕수육"};	//값
		}
	
	//서빙하기 위해 필요한것? - 메서드  / 필요한것 -파라미터와 메소드
	//서빙 후 보스에게 줄것? -리턴타입
	void serve(String[] foods){
		System.out.println("맛있게 드세요.");
	}
	
	//계산하기 위해 필요한것? - 계산서
	//계산 후 보스에게 줄 것 ? - 없음 -> 리턴타입이 없으니 void
	void pay (String[] order){
		System.out.println("2만원입니다. 안녕히 가세요.");
	}
	

}
