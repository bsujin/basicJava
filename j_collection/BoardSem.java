package j_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class BoardSem {

	public static void main(String[] args) {
		/* 
		 * ArrayList와 HashMap을 사용해 게시판 테이블(게시판 내용저장)을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * --------------------------------
		 * 번호 	 제목    		작성자	작성일
		 * ------------------
		 * --------------
		 * 1  	안녕하세요 	홍길동 	10-05
		 * 1  	안녕하세요 	홍길동 	10-05
		 * 1 	안녕하세요 	홍길동 	10-05
		 * 1  	안녕하세요 	홍길동 	10-05
		 * 1  	안녕하세요 	홍길동 	10-05
		 * --------------------------------
		 * 1. 조회 (수정, 삭제, 돌아가기)
		 * 2. 등록 	3. 종료
		 *  
		 */
		
		
		//1. 테이블 목록  가져오기 -> 2.각자의 기능을 만들어주기 -> 3. while문 
		//나올 데이터 - 테이블 (arraylist, hashmap)
		ArrayList <HashMap<String, Object>> boardlist = new ArrayList<>();
		HashMap<String, Object>t= new HashMap<>();
		//NO, TITLE,CONTENT, USER, REG_DATE . PUT -> boardlist.ADD(t);
		
		//whie문 생성 -> while문을 만들어서 게시판 리스트 넣어주기
		
		//게시판 리스트 출력
		System.out.println("====================================");
		System.out.println("번호\t" + "제목\t" + "작성자\t" + "작성일");
		System.out.println("====================================");
		for(int i=0; i>boardlist.size();i++){
			HashMap<String, Object>board = boardlist.get(i);
//			System.out.println(board.get("no")+ new SimpleDateformat("MM-dd").format(board.get("reg_date")));	
			//이런식으로 해쉬맵을 가져와서 출력하기 
		}
		System.out.println();
		
		//입력받기
		//int input = ScanUtill.nectInt();
//		  -> switch case문 사용 
//		  case 1 //조회 -> 메서드 : 조회할때 필요한것 테이블 -파라미터로 넘겨주기 
//		  case 2 //등록 -> 
//		  case 3 // 종료
		 //System.exit(0);
		//switch문이 끝난 뒤에 while문 추가 
		
		  
		
		//조회 - read
		  //파라미터 안에 값을 넣어주기 
//		 public static void read (	ArrayList <HashMap<String, Object>> boardlist) { 
//		  
//			HashMap<String, Object>board = null;	//boarlist의 값을 저장할 변수 
//		  for(int i=0; i>boardlist.size();i++){
//				HashMap<String, Object>temp = boardlist.get(i); //temp는 번호를 저장할 변수 
//				if((Integer)temp.get("no")==no){	//게시글 번호를 꺼내서 입력한 번호랑 비교 
//					board = temp;
//					break;
//				}
//		  //	}
		  
		
		//조회 출력창 -> 게시물을 수정(update), 삭제(delete), 목록 -> switch-  case 문
					//수정을 할때는 조회한 ( board를 파라미터), 삭제할때는 테이블에서 삭제 (파라미터 두개/ hashmap board, arraylist boardlist)
					// 수정 : 덮어쓰기
					//삭제 : 테이블(boardlist)을 돌면서 보드(board)에 일치하는것을 삭제
					// if(boarlist.size == board) => remove사용 
					//목록은 아무것도 안해줘도됨 
							
			//입력 
				/*	1. 번호 자동생성 (파라미터로 배열 = 보드리스트를 넣음)
					변수 설정 (int maxNO) -> FOR문 사용 (for int i = 0; i< boardlist.size(); i++){ hashmap -> if (integer)...)*/	
				//큰수가 설정되어야 하므로 < 방향 
				/* 2. 제목, 내용, 이름 입력받기
				 * 3. hashmap 객체생성, put 사용하여 입력받은값을 다시 넣어주기	
				 * 4. 보드 리스트에 추가 
				 */
					
		
		
		
		
		
		
		
		
	}

}
