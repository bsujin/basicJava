package e_oop.ex;

import java.util.Arrays;

public class bank {

	public static void main(String[] args) {

		BankClerk bc = new BankClerk();
		String [] order = bc.order();
		System.out.println(Arrays.toString(order));

		bc.order1();
		System.out.println("완료.. 안녕히가세요");
	}

}
