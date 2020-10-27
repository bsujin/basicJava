package e_oop.ex;

import java.util.Scanner;

public class BankClerk {

	String[] order() {
		System.out.println("어떤일 때문에 오셨습니까?");
		return new String[] { "입금", "출금" };
	}

	Scanner s = new Scanner(System.in);

	void order1() {
		int q;
		System.out.println("입력 : ");
		q = Integer.parseInt(s.nextLine());
		if (q == 1) {
			System.out.println("입금");
			System.out.println("얼마를 입금:");
			q = Integer.parseInt(s.nextLine());
			System.out.println("입금중입니다....");
		}
		if (q == 2) {
			System.out.println("출금");
			System.out.println("얼마를 출금:");
			q = Integer.parseInt(s.nextLine());
			System.out.println("출금 중입니다....");
		}

	}

}
