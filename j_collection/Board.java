package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	

	static Scanner sc = new Scanner(System.in);

	static int no;
	static String boardName;
	static String write;
	static String name;
	 static Date today = new Date(); 
	 static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



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
	//날짜 포맷
	
	ArrayList <HashMap<String, Object>> boardlist = new ArrayList<>();
	HashMap<String, Object>board = new HashMap<>();	
	for (int i1 = 0; i1 < boardlist.size(); i1++) {
		board = boardlist.get(i1);
		for (String key : board.keySet()) {
			System.out.println(key + "\t" + board.get(key));
			}
		
	}  
	
	
	list();
	
	}




 private static void list(){		
	 	ArrayList <HashMap<String, Object>> boardlist = new ArrayList<>();
		
	 	while (true){	
			System.out.println("====================================");
			System.out.println("번호\t" + "제목\t" + "작성자\t" + "작성일");
			System.out.println("====================================");
			for (int i= 0; i< boardlist.size();i++){
				HashMap<String, Object>board = boardlist.get(i);
//				System.out.print( i+1 + "\t" );
				System.out.println(board.get("번호")+ "\t" + board.get("제목") + "\t" + board.get("작성자") + "\t" + board.get("글내용") + "\t" + board.get("작성일"));
			}								//new SimpleDateFormat("MM-dd").format(board.get("작성일")));

			
			int input = 0;
	
			System.out.println("1.조회 \t" + "2.등록\t" + "3.종료");
			input = sc.nextInt();
			
			switch(input){
			
			case 1: 
				read(boardlist);
				break;
			
			case 2 : 
				write(boardlist);
				break ;
				
			case 3 : 
			System.out.println("종료되었습니다.");
			System.exit(0);
				break;
			}
		}
			
			
		
}		
 
 
	
	
	public static void write(ArrayList <HashMap<String, Object>> boardlist){	
		
		HashMap<String, Object>board = new HashMap<>();	
		int maxNo = 0;
		//큰수가 자동 생성 되도록
		
		for(int i = 0; i< boardlist.size(); i++){
			 HashMap<String, Object>temp = boardlist.get(i);
			if( maxNo < (Integer)temp.get("번호") ){		 
				maxNo = (Integer)temp.get("번호");
		}
		} 
		
		System.out.println("게시글 제목을 입력하세요 > ");
		boardName = sc.next();
		System.out.println("내용을 써주세요 > ");
		write = sc.next();
		System.out.println("작성자(이름)를 입력하세요 > ");
		name = sc.next();

		board.put("번호", maxNo+1);
		board.put("제목", boardName);
		board.put("작성자", name);
		board.put("글내용", write);
		board.put("작성일", date.format(today));
		
			
		boardlist.add(board);
		System.out.println("게시글 등록이 완료되었습니다.");

	
}
		
	public static void read(ArrayList <HashMap<String, Object>> boardlist){
		HashMap<String, Object>board = new HashMap<>();	
		
		System.out.println("게시글 번호를 입력하세요 > ");
		int no = sc.nextInt();
		
			board = null;
		  for(int i=0; i < boardlist.size(); i++){
			  HashMap<String, Object>temp = boardlist.get(i); 
			if((Integer)temp.get("번호")==no){
				board = temp;
				break;
			}
//			else{				
//				System.out.println("게시글을 입력해주세요>");
//				}write(boardlist);
//		
		
		  }
		  	System.out.println("====================================");
			System.out.println("번호\t : " + board.get("번호"));
		  	System.out.println("제목\t" + board.get("제목") );
		  	System.out.println("작성자\t" + board.get("작성자"));
		  	System.out.println("작성일\t" + board.get("작성일"));
			System.out.println("====================================");
		
			System.out.println("1.삭제 \t" + "2.수정\t" + "3.종료");
			int input = sc.nextInt();
			switch(input){
			
			case 1: 
				delete(board, boardlist);
				break;
			
			case 2 : 
				update(boardlist);
				break ;
			
			case 3: 
				break;
			}
			}




	private static void update(ArrayList <HashMap<String, Object>> boardlist) {
		HashMap<String, Object>board = new HashMap<>();	
		
		System.out.println("게시글 제목을 입력하세요 > ");
		boardName = sc.next();
		System.out.println("내용을 써주세요 > ");
		write = sc.next();
		System.out.println("작성자(이름)를 입력하세요 > ");
		name = sc.next();

		board.put("번호", no);
		board.put("제목", boardName);
		board.put("작성자", name);
		board.put("글내용", write);
		board.put("작성일", date);
		boardlist.add(board);
		for (int i = 0; i < boardlist.size(); i++) {
			HashMap<String, Object> b = boardlist.get(i);
			for (String key : b.keySet()) {
				System.out.println(key + "\t" + board.get(key));
			}
		}
		
	}




	private static void delete(	HashMap<String, Object>board ,ArrayList <HashMap<String, Object>> boardlist) {
		
		System.out.println("게시글 번호를 입력하세요 > ");
		no = sc.nextInt();
		boardlist.remove(no-1);
		
//		for(int i=0; i< boardlist.size();i++){
//			if (boardlist.size()==board.size()){
//				
//				System.out.println("삭제되었습니다.");
//			} }
		
		
	
			
	
	
}




	public int hashCode() {
		HashMap<String, Object> board = null;
		board.put("번호", no);
				return 0;
	}
	
			
	
		
			
		
		
		
				
		
		
		
		
		
		
	
	
	
}

	
	