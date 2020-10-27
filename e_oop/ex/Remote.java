package e_oop.ex;

import e_oop.ScanUtil;

public class Remote {

	public static void main(String[] args) {
	
	//객체 생성
		TV tv = new TV();
		
	while(true){
		System.out.println("==================================");
		System.out.println("1.전원\t2.채널변경\t3.채널up\t4.채널down"
							 +"\n5.음량up\t6.음량down\t0.종료");
		System.out.println("=================================================");
		int input = ScanUtil.nextInt();
		
	switch (input){
	case 1 : tv.power();	 break;
	case 2 : System.out.println("변경할 채널을 입력 : ");
		int ch = ScanUtil.nextInt();
		tv.changech(ch);
	}
	}
	
	
	}

}
