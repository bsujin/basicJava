package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 배열 ( 배열안에 값이 저장) 
		 * 
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태
		 *  
		 */
		//2차원
		int [][] array2; 
		//타입 배열이름[열의길이][행의길이];
		
		//3차원(잘 사용하지 않음)
		int [][][] array3;

		
		//2차원 배열 초기화 방법
		//1.
		int [][] arr = new int [2][3]; 	//2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
			//3칸이 두개 있으므로 6개 배열 생성 가능 
		//2.
		int arr2[][] = new int [][]{ {1,2,3,}, {4,5,6} }; //넣어준 값의 개수로 배열의 길이가 정해진다.

		//3.
		int []arr3[] = { {1, 2, 3}
					,{4, 5, 6}
					,{7, 8, 9} }; 	//선언과 초기화를 동시에 해야한다.
		
		
		//4.
		int [][] arr4 = new int [3][]; //가변배열	: 사용할 때 다르게 정해서 사용을 할 수 있다.(서로 다른 크기의 2차원 배열이들어갈 수 있음)
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		//2차원 인덱스까지 접근하여 사용할 수 있다.
		System.out.println(arr[0][1]);
		
		//arr[0] = 10; 	//값을 저장할 수 없다
	//일차원에는 (일차원) '배열을 저장할 수 있다'
		arr[0] = new int [5];
		arr[0][0] = 10;	//2차원에 값을 저장할 수 있다.
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		//다차원 배열에서의 길이
		System.out.println(arr.length); //arr.length -1차원 배열의 길이
		System.out.println(arr[0].length); //arr[0].length - 2차원 배열의 길이

		for(int i = 0; i <arr.length; i++){
			for (int j=0; j < arr[i].length; j++){
				System.out.println("arr[" + i +"] [" + j + "] : " + arr[i][j]);
				
				
				// => 2차원 배열은 [] , for 문이 2개
				// 처음에 정하고 들어가도 인덱스마다 배열을 다르게 저장하여 사용할 수있음, 가변배열은 정하지 않음				
			}
		}

		int[][] scores = new int[3][5]; // int [학생수][과목수]
		// int[] sum = new int [scores.length]; //합계
		// double[] avg = new double[scores.length]; //평균

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}

		// 합계와 평균을 구해주세요.
		// scores 는 5개의 점수 와 길이
//
//		int[] sum = new int[scores.length]; // 초기화를 배열로 하면 for문 안에도 [] 꼭 붙이기**
//		double[] avg = new double[scores.length];
//
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < scores[i].length; j++) {
//		
//				sum[i] += scores[i][j];
//				avg[i] = (double) sum[i] / 5; // scores[j] 로 나눌수 없음( j가 0)
//
//			}
//			System.out.println(sum[i]);
//			System.out.println(avg[i]);
//		}

		
		int[] sum = new int[scores.length]; // 초기화를 배열로 하면 for문 안에도 [] 꼭 붙이기**
		double[] avg = new double[scores.length];

		for (int i = 0; i < scores.length; i++) {
		for (int j = 0; j < scores[i].length; j++) {
	
			sum[i] += scores[i][j];
			}
		avg[i] = (double) sum[i] / scores[i].length;
		System.out.println("합계 " + sum[i] + " / 평균 : " + avg[i]);
		}
		

	
	}

}
