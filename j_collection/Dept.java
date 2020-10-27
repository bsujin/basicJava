package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class Dept {

	public static void main(String[] args) {

		//ArrayList와 HashMap을 사용해 dept테이블의 구조를 만들어주고,
		///저장된 모든값을 출력해주세요. 
	
		//배열에 저장
		ArrayList<HashMap<String, Object>>table = new ArrayList<>();
		
//		System.out.println(dept);
		
		
		//HashMap 생성 (dept) - 구조만들기
		HashMap<String, Object> dept = new HashMap<>();
		dept.put("DETPNO", 10);
		dept.put("DNAME", "ACCOUTING");
		dept.put("LOC", "NEW YORK");
		table.add(dept);
		
		//데이터 추가하기
		dept = new HashMap<>();	//새로운 HashMap 생성
		dept.put("DEPTNO", 20);
		dept.put("DNAME", "RESEARCH");
		dept.put("LOC", "DALLAS");
		
		table.add(dept);
//		System.out.println(dept);
		
		dept = new HashMap<>();
		dept.put("DEPTNO", 30);
		dept.put("DNAME", "SALES");
		dept.put("LOC", "CHICAGO");
		
		table.add(dept);
//		System.out.println(dept);
		
		dept = new HashMap<>();
		dept.put("DEPTNO", 40);
		dept.put("DNAME", "OPERATONS");
		dept.put("LOC", "BOSTON");
		
		table.add(dept);
//		System.out.println(dept);
		
//	
		
		
//		for(HashMap<String, Object> key : table){
//			System.out.println(key);
//		} 배열을 전체 출력
		
		
		
		//for문을 사용하여 배열의 값을 하나씩 저장하여 출력 
		//for-each문만 사용할 경우  dept변수가 하나, 마지막 저장된 '키의 값'만 가져옴
		
		
		for(int i = 0; i<table.size(); i++){	//배열을 가져옴 
			HashMap<String, Object> d = table.get(i);
//			Set<String> keySet = d.keySet();
//			for(String key : keySet){
		for(String key : d.keySet()){
				System.out.println(key + " : " + dept.get(key));
			}
			System.out.println("----------------------------------");
//		}
		
	}

	}
}

