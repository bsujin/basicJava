package d_array.ex;

import java.util.Arrays;

public class score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, oracle, java점수를 0~100까지 랜덤으로 생성해주시고, 아래와
		 * 같이 출력해주세요. 국 영 수 사 과 오라클 자바 (8과목) 과목합계 평균 합계, 평균, 석차 구하가 학생수 5명
		 */

		
		String[] name = new String[] { "김경찬", "김우성", "김형석", "안용현", "유승종",
				"김강영", "김건호", "김도영", "김보연", "김선중", "김수연", "김준혁", "박소영", "백수진",
				"송하섭", "오제헌", "유동기", "이건영", "이수정", "이수훈", "이연승", "이예슬", "전영헌",
				"최동준", "황시연" };
		
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		
		int[][] score = new int [name.length][subjects.length];
		int []  nameSum = new int [score.length];
		float [] nameAvg = new float [score.length];
		int [] subSum = new int [subjects.length];
		float [] subAvg = new float[subjects.length];
		int [] rank = new int [score.length];
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random() * 101);
			}
		}
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				nameSum[i] += score[i][j];
			}
		}
		
		for(int i = 0; i < score.length; i++){
			nameAvg[i] = Math.round((float)nameSum[i] / subjects.length * 100) / 100f;
		}
		
		for(int i = 0; i < subjects.length; i++){
			for(int j = 0; j < score.length; j++){
				subSum[i] += score[j][i];
			}
		}
		
		for(int i = 0; i < subjects.length; i++){
			subAvg[i] = Math.round((float)subSum[i] / score.length * 100) / 100f;
		}
		
		for(int i = 0; i < score.length; i++){
			rank[i] = 1;
			for(int j = 0; j < score.length; j++){
				if(nameSum[i] < nameSum[j]){
					rank[i]++;
				}
			}
		}
		
		for(int i = 0; i < nameSum.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < nameSum.length; j++){
				if(nameSum[j] > nameSum[min]){
					min = j;
				}
			}
//			int[] temp = score[i];
//			score[i] = score[min];		//for문 안에다 넣어주면 안됨, 값이 계속 바뀌어 원하는 결과를 못얻음
//			score[min] = temp;
//			
//			int temp2 = nameSum[i];
//			nameSum[i] = nameSum[min];
//			nameSum[min] = temp2;
//			
//			float temp3 = nameAvg[i];
//			nameAvg[i] = nameAvg[min];
//			nameAvg[min] = temp3;
//			
//			int temp4 = rank[i];
//			rank[i] = rank[min];
//			rank[min] = temp4;
//			
//			String temp5 = names[i];
//			names[i] = names[min];
//			names[min] = temp5;
		}
		
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		
		for(int i = 0; i < score.length; i++){
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		
		System.out.print("과목합계");
		for(int i = 0; i < subSum.length; i++){
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		
		System.out.print("과목평균");
		for(int i = 0; i < subAvg.length; i++){
			System.out.print(subAvg[i] + "\t");
		}
	}

}
		