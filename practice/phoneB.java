package practice;
import java.util.Scanner;
public class phoneB {

	 Scanner sc = new Scanner(System.in);
     
	 phone phone[];
      int i;
      System.out.print("인원수 >> ");
      int num = sc.nextInt();
      phone = new phone[num];
      for(i=0; i<phone.length; i++) {
         System.out.println("이름>>");
         String name = sc.next();
         System.out.println("전화번호>>");
         String tel = sc.next();
         phone[i] = new phone(name, tel);
      }
      System.out.println("저장되었습니다...");
      while(true) {
         System.out.print("검색할 이름 >>");
         String name = sc.next();
         for(i=0; i<num; i++) {
            if(name.equals(phone[i].getName())) {
               System.out.println(name+"의 번호는 "+phone[i].getTel()+" 입니다.");
               i--;
               break;
            }
         }
         if(name.equals("그만")) break;
         if (i == num) System.out.println(name+"이 없습니다.");
      } 
}
}
