package j_collection;

import java.util.ArrayList;

public class score {

	public static void main(String[] args) {
//		우리반 모두의 국어, 영어, 수학, 사회, 과학, oracle, java점수를 0~100 까지 랜덤으로 생성 
//		
		
		
		//이름
		ArrayList<String>name = new ArrayList<String>();
		name.add("홍"); name.add("길"); name.add("동");
		name.add("백"); name.add("수"); name.add("진");
//		System.out.println(name+ "\t");
		
		//과목
		ArrayList<String>sub = new ArrayList<String>();
		sub.add("국어"); sub.add("영어"); sub.add("수학");
		sub.add("사회"); sub.add("과학"); sub.add("oracle");
		sub.add("java");
//		System.out.println(sub);
		
		//성적
//		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		
			
//		score1.add(name.size()); score.add(score1);
//		score1.add(sub.size());	score.add(score1);
	
		for (int i = 0; i < name.size(); i++){
		ArrayList<Integer> score = new ArrayList<>();
			for (int j = 0; j < score.size(); j++){
			score.add((int)(Math.random()*100)+1);
				
			}System.out.println("점수 : " + score);
		}	
		
		
		
		
//		Integer integer2 = score.get(0).get(0);
		

		ArrayList<Integer>num = new ArrayList<>();
		
		
//		int sum = 0;			double avg = 0;
//		
//		for (int i = 0; i< score.size(); i++){
//			sum += num.get(i);
//		} avg = (double)sum / num.size();
//		System.out.println("합계 : " + sum + " /평균 : "  + avg) ;
//		
		
		
	}
}
	


