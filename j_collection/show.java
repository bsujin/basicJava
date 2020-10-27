package j_collection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class show {

	int num = 1;
	String boardName;
	String write;
	String name;
	Scanner sc = new Scanner(System.in);
	
	
	//날짜 포맷
//	
			Date today = new Date(); 
			SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
	void showInfo(){
		
		System.out.println("====================================");
		System.out.println("번호\t" + "제목\t" + "작성자\t" + "작성일");
		System.out.println("====================================");
		System.out.println(num + "\t" + boardName +"\t"+ name +"\t"+ date.format(today));
				
	}
	
	
	
	
	void board(){
		
	
		int input = 0;
		while (true){
			System.out.println("1.조회 \t" + "2.등록\t" + "3.종료");
			input = sc.nextInt();
			switch(input){
			
			case 1: 
				showInfo();
					break;
			
			case 2 : 
				
				break ;
				
			case 3 : 
				break;
			}
		}
		
		
	
		
		
		
		}
		
	}
	
	

