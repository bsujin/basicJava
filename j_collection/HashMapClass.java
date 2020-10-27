package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
		//인덱스가 아닌, 키를 만들어 키로 저장하는것 (순서없음)

	public static void main(String[] args) {
		/*
		 * Object put(object key, object value) : 지정된 키와 값을 '저장'한다. (가져올때도 key를 가져옴)
		 * Object remove(object key) : 지정된 키로 저장된 값을 제거한다. (키와 값을 같이 삭제)
		 * Object get(object key) : 지정된 키의 값(없으면 null)을 반환한다. 
		 * 															(그 키의 값을 가져온다,데이터가 없어도 에러가 안뜸 = null)
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다. (키만 가져온다) -> 중복되지 않는 값만 저장 
		 * -인터페이스 = list(array), map(hash), set 3개 & (대표적인것)
		 * 
		 *<제네릭 = 키, 값의타입>  키는 주로 string을 많이 사용함, 키를 정해줄 때 의미있는 이름으로 -> 무슨 타입인지 유추가능 
		 */
		HashMap<String, Object>map = new HashMap<>();
		
		//object타입이라 어떤 값이든 저장 가능 
		
		map.put("a",10);			//int타입 저장
		map.put("b", "홍길동");		//string타입 저장
		map.put("c", new Date());	 //date타입도 저장가능
		
		System.out.println(map); 	//출력결과 : 순서가 없어 b,c,a순으로 나옴
		
		
		//덮어쓴다.
		map.put("b","이순신");		// => 기존에 저장된 키에 다른 값을 덮어쓴다. (하나의 값만 저장가능)
		System.out.println(map);
		
		//제거한다.
		map.remove("b");
		System.out.println(map);	
		
		//가져온다.
		Object value = map.get("a");		//get메서드 :위에 설정한 타입(object)의 값을 얻어온다. 
		System.out.println(value);
		
			
		//HashMap 에 저장된 모든 키를 가져온다. (돌려주는것은 set)
		Set<String> keys = map.keySet(); 
		
		//set의 키 값 꺼내기 
		for(String key : keys){		
			System.out.println(">" + key + " : " + map.get(key));
		}
		
		/*> for문사용 (for-each)
		 * (앞의 변수 : 값이 여러개 들어있는 변수 (set의 변수)) => 값에있는 모든 값을 key에 저장 
		 *	저장되어있는 값이 string( 저장되어있는 값의 타입에 맞게 변수를 저장)
		 */
		
	
		
		//SQL -  LPROD테이블
		
		HashMap<String, Object> lprod = new HashMap<>();
			
		//LPROD테이블의 데이터를 HashMap키로 값 저장
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		
		//배열로 저장 (정렬된 데이터)
		ArrayList<HashMap<String,Object>> table = new ArrayList<>();
		table.add(lprod);		//lprod 키 저장 
		System.out.println(table);
		
		//변수의 이름을 한번에 바꿔줄 때 : 변수 이름 + ctrl + 1  -> rename 
		
		//새로운 해쉬맵 생성
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		
		table.add(lprod);
		
		System.out.println(table);	//-> 2개의 해쉬맵 출력 
		
		
			
		
		
		
	}

}
