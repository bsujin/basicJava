package j_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * 
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * 
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * -> 여러개가 이미 저장되어 있을 때 인덱스를 지정하여 그 사이에 저장(한칸씩 뒤로 밀고 저장한다)
		 *  
		 * Object set (int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * -> 기존에 있던것을 다른것으로 바꾸는 것 /  return  : 기존에 저장된것을 반환, 새로운것을 저장 
		 * 
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * 
		 * int size() : 현재 저장된 객체의 수를 반환한다. 
		 * 
		 * boolean remove(int index) : 지정된 위치의 개체를 제거한다.
		 * boolean타입의 리턴타입 -> 삭제의 유무를 리턴 (뒤에 있던것이 앞으로)
		 * 
		 */
		
		//객체생성
		ArrayList sample  = new ArrayList();
		
		//타입을 지정하지 않으면, 무엇이든지 저장가능 -> 값을 꺼낼때 어떤 타입인지 몰라서 문제 
//		sample.add("abc");
//		sample.add(100);
//		sample.add(new ArrayList());
// 	-> 이렇게 사용하지 않고 주로 타입을 지정(=제네릭)해줌 
		
		/* 제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다.
		 * 따라서 제네릭의 사용이 권장된다		 */
			
				  //제네릭				아무것도 넣어주지 않음 ( 객체에 아무거나 넣을 수 있다)-> 상관없음
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(10);	//int타입의 값 저장 (오토박싱)
//		list.add("abc"); 	저장하면 안되는 타입 -> 컴파일 에러발생
		list.add(20);
		System.out.println(list.add(30)); //true 출력 : 값의 저장에 대한 성공여부 반환
		System.out.println(list); 		  //저장된 값이 출력
		
		//파라미터 두개있는 add사용
		list.add(1,40);	//1번 인덱스부터 뒤로 밀고 값을 저장한다. 	-> 1번인덱스를 뒤로 밀고 40번 인덱스를 추가 
		System.out.println(list);
		
		//set사용 : 기존 값을 바꿔서 새로 저장
		Integer before = list.set(2,50); 	//2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		//get매서드 : 인덱스에 저장되어있는 값을 반환
		Integer integer = list.get(2);	//list[2]
		System.out.println(integer);
		
		/*i번째 인덱스를 for문을 돌면서 출력 -> 제거 
		-> 0,1번 인덱스를 제거하고 for문이 끝나는 결과
		: arraylist는 빈칸을 채움 -0번인덱스 제거, 1번인덱스 자리 채움, 배열길이 3/1번제거, 2번 자리채움, 배열길이 2 -> 증가하여 값이 끝남 */
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}System.out.println(list);  
		
		//=> 값을 제거할때는 뒤에서부터 제거해야한다.
		for(int i = list.size()-1; 0 <= i; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
	
		//list[0][0][0] list.get(0).get(0).get(0).
		
		//list에 1~100사이의 랜덤값을 10개 저장
		for(int i = 0; i< 10; i++){					//10개 저장 
			list.add( (int)(Math.random()*100)+1);	//랜덤한 값을 저장 
		} System.out.println(list);
		
		//list에 저장된 값의 합계와 평균 구하기
			int sum = 0;			double avg = 0;
			
		for (int i = 0; i< list.size(); i++){
			sum += list.get(i);
		} 
		avg = (double)sum / list.size();
		System.out.println("합계 : " + sum + " /평균 : "  + avg) ;
		
		
		//list에서 최소값과 최대값을 구해주세요
		//0번 인덱스 값 가져와서 비교
		int max = list.get(0); 
		int min = list.get(0);
		
		for ( int i = 0; i< list.size(); i++){
			if(list.get(i) < min){	
				 min = list.get(i);
					 
			}else if (list.get(i)>max){
				max = list.get(i);
			}
		}System.out.println("최대값 : " + max + "최소값 : " + min);
		
		
		//list를 오름차순으로 정렬해주세요.(선택정렬)
		
		for(int i = 0; i< list.size()-1; i++){
				min = i;
			for(int j = i+1; j< list.size(); j++){
				if(list.get(j)<list.get(min)){
					min = j;	
				}
			} 
				//i번째 인덱스를 바꿔줌 -set사용
				int temp = list.get(i);
				list.set(i,list.get(min));
				list.set(min, temp);
					
		}System.out.println(list);
		
		
		//2차원 배열
		//제네릭에 배열을 넣어줌 
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		//2차원 배열값 저장
		
		//1차원 <> 안에 들어갈 배열 저장 -> list 2에 넣을 값
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list.add(40);
		list.add(50);

		list2.add(list);
				
		System.out.println(list2);		 // -> 출력값		[[10, 20, 30], [40, 50]]
		
		
		//값을 꺼내기
		for (int i = 0; i< list2.size(); i++){
		ArrayList<Integer> li = list2.get(i);	//출력값 : [10, 20, 30]	[40, 50]
			//하나 꺼내서 Arraylist에 저장
//			System.out.println(li);
			for (int j = 0; j< li.size(); j++){
			System.out.println(li.get(j) + "\t");
		}
			System.out.println();
		}
		
		
		Integer integer2 = list2.get(0).get(0); 	// 0,1의 자리 출력 : 0번 인덱스 (10,20,30) 1번 (40,50)
		System.out.println("-----" +integer2 );
		
	}

}
