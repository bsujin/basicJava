package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 점수를 전부 다 비교해 작은 점수의 등수를 증가시키는 방식 
		 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는
		 * 방식 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식 (=두개씩 비교)
		 * 삽입정렬 : 두번째 숫자부터 앞의숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식 (=큰수와 작은 수 사이의 중간에 들어감)
		 * 
		 */

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr)); // import 해주기
//
	printRank(arr); // 1. 석차구하기 (ctrl + 1 : 메서드 호출)
	//SelectSort(arr); // 2. 선택정렬
	//bubblesort(arr); // 3. 버블정렬
	//insertsort(arr); //4. 삽입정렬
		
	//퀵정렬 
		Arrays.sort(arr);	// 정렬
		System.out.println(Arrays.toString(arr));
	}
	//삽입정렬
	private static void insertsort(int[] arr) {
			// 임시저장 변수 필요
		
				for (int i = 1; i < arr.length; i++) {
					int temp = arr[i];
					int j = 0; 				// (for문 밖에 j계산이 있으므로),선언 안하면, 컴파일 에러 발생
					for (j = i - 1; j >= 0; j--) {		//앞의 값이랑 비교 (-1)
						if (temp < arr[j]) {
							arr[j + 1] = arr[j]; // 큰 값을 뒤로 밀기 +1

						} else { // 작은 값을 만났을 때의 경우
							break;

						}
				
					}			
					arr[j + 1] = temp;
					System.out.println(Arrays.toString(arr));
				}	
				
				System.out.println(Arrays.toString(arr));
					// 더 큰값만 만나는 경우 (else로 진입을 못하므로, for문이 끝날때

		
		
	}

	// 버블정렬 : 비교를 할때마다 큰수와 작은수를 변경해줘야함
	private static void bubblesort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) { 	//i는 for문이 도는 횟수 (9번 돌면 모든 비교가 끝남)
			System.out.println((i+1)+"번");
			boolean changed = false; 		// (if문에 들어오는지 안들어오는 지 확인-자리가 변경되는지, 변수만들기)
									
			for (int j = 0; j < arr.length - 1 -i; j++) { // 맨뒤에는 정렬이 끝, i가 계속 증가하므로 -i
															
				if (arr[j] > arr[j + 1]) { // 두개씩 비교
					int a = arr[j]; // 큰수가 뒤에 값으로  자리변경 [j]
					arr[j] = arr[j + 1];
					arr[j + 1] = a;
					changed = true;			
				}
				System.out.println("버블 : " + Arrays.toString(arr));
			} 
			
			if (!changed) {					//변수의 값이 한번도 바뀌지 않았다면 멈춘다
											//if (changed==false) 같은표현이나, 뜻이 다름 /'!changed 로 쓰면 바뀌지 않을때 브레이크' 
				break;
			}
			
		}
		
		
	}

	// 선택정렬
	private static void SelectSort(int[] arr) {
		// 인덱스 비교, 최소값 , 자리바꾸기
		// 비교 범위 설정 *

		for (int i = 0; i < arr.length - 1; i++) { // 마지막자리는 구하지 않아도 됨 -1
			int min = i; // 값이 아니라 위치를 찾음, 인덱스 비교 인덱스가 i (숫자로 주면 값이 안나옴)
			for (int j = i + 1; j < arr.length; j++) { // j = i +1 이어야 i부터 시작
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
		System.out.println("선택  : " + Arrays.toString(arr));

	}

	// 석차구하기
	private static void printRank(int[] arr) {
		// 석차를 저장할 배열을 생성한다.
		// 석차를 저장할 배열의 모든 인덱스를 1로 초기화한다 (

		int[] rank = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		// 점수를 비교해 작은 점수의 석차를 증가시킨다.

		for (int i = 0; i < rank.length; i++) { // 점수
			for (int j = 0; j < rank.length; j++) { // 석차
				if (arr[i] < arr[j]) {		 // i (0 ) = j ( 1,2,3,4,5,6,7,8,9) 하나씩 비교
					rank[i]++;
				}
			}
		}
		System.out.println("석차 : " + Arrays.toString(rank)); // Arrays.toString'배열
																// 전체가 나온다'

		
	}

}
