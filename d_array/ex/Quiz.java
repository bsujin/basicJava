package d_array.ex;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
		//생각을 코드로 표현하는 연습 ***
		//프로그래머스 사이트 (코딩 테스트 연습-모든문제-난이도선택-자바 선택- 문제 ) (1차원 배열 문제)
		
		//quiz1();		//거스름돈의 동전개수
		//quiz2();	//그래프 그리기
		//quiz3();	//같은숫자는 싫어
		quiz4();		//나누어 떨어지는 숫자배열
		
		
		
		
		
		
		
	}

	private static void quiz4() {
		int[] arr = new int [100];
		for (int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random() * 100) +1;
			
		}
		/*
		 * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 5
		 * [5,10,15,20,25]
		 */
		//2~5 랜덤수  
		// 나누어 떨어지는 숫자 배열 정렬
		
		int[]temp = new int [100];
		int n = (int)(Math.random() * 4) +2;
//		System.out.println(n);
		int count =0;	
		for (int i = 0; i <arr.length; i++){
			if (arr [i] % n == 0){
				temp [count ++] = arr[i];
				
			}
			
		}
		
		arr= new int [count];
		for ( int i = 0; i<arr.length; i++){
			arr[i] = temp[i];
		}
		for ( int i = 0; i<arr.length -1; i++){
			int min = i;
		for (int j = i + 1 ; j<arr.length; j++){
				if (arr[j]> arr[min]){
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min]= tmp;
			
			
		}System.out.println("n : " +n);
		System.out.println(Arrays.toString(arr));
	}

	private static void quiz3() {
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * 
		 * [1,3,3,2,1,4,5,5,1,3]
		 * [1,3,2,4,5]
		 * 
		 */
		//임시로 배열 하나 만들기
		int []arr = new int [10];
		
		int [] temp = new int [5];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) +1;
			boolean flag = false;
			
			for(int j = 0; j < temp.length; j++){
				if(arr[i] == temp[j]){					//같은게 하나라도 있는지 확인 - 확인해주는 변수 만들기
					flag=true;
				}
			}
			if(!flag){
				temp[count++] = arr[i];		//같지 않은것은 갯수로 표현 (count 변수 추가)
				
			}
		}
		System.out.println(Arrays.toString(temp));			//temp는 빈칸이 생길 수 있으므로 새로운 배열을 만든다
	
		
		int [] result = new int [count];				
		for (int i = 0; i< result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
	}

	private static void quiz2() {
		int[]arr = new int[20];
		for(int i = 0; i <arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}System.out.println(Arrays.toString(arr));
		
		
		
		
		
		//1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요
		//발생된 만큼 	i[] a = 5  
		//			
		/*1 : ***3	
		 2	:  ***4
		 3 	: **2
		 4 	: *****5
		 5 	: *1*/
		
		//1. 배열을 하나 만들기 (count 셀것)
		
		int [] count = new int [5];
		
		for(int i = 0; i <arr.length; i++){
			count [arr[i] -1]++;
		}System.out.println(count);
		
		for(int i = 0; i <arr.length; i++){
			if(i+1==6){
				break;
			}
				System.out.print(i + 1 + " : ");

					for(int j = 0; j<count[i]; j++){
					System.out.print("*");	//갯수만큼 돌면서 찍음
				}
			System.out.println(" " + count[i]); 	
		}
	}	
		
	
	

	private static void quiz1() {
		int money = (int)(Math.random()* 500) *10;	//0~490 10단위
		int [] coin = {500, 100, 50, 10};
		System.out.println("거스름돈 : " + money);
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 동전의 단위 
		 * 
		 * 거스름돈 : 2860원    change
		 * 500원 5개 (a) change / 500;  change% =500;
		 * 100원 3개	(b) change / 100; change% = 100;
		 * 50원 1개 	
		 * 10원 1개	
		 * 
		 */
		
		

//		int []count = {0,0,0,0};
//		
//		count[0] = money / coin [0];
//		
//			System.out.println(coin [0] + "원 : " + count[0] + "개");
//		
//		count[1] = money / coin [1];
//		money = money % coin[1];
//		System.out.println(coin [1] + "원 : " + count[1] + "개");
//		
//		count[2] =  money / coin [2];
//		money = money % coin[2];
//		System.out.println(coin [2] + "원 : " + count[2] + "개");
//		
//		count [3]=  money / coin [3];
//		money = money % coin[3];
//		System.out.println(coin [3] + "원 : " + count[3] + "개");
//	
		
			for (int i = 0; i < coin.length; i++){
				int count = money / coin[i];
				count = money % coin[i];
				System.out.println(coin[i] + "원 : " + count + "개");
				
			}
			
		
		}
			
		
		
		
		
		
		
		
	
	}
			
		
		
		
		
		
		




