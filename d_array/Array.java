package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		/*
		 * 배열
		 * 여러개의 값을 하나의 변수에 저장해서 사용하는것 (같은 타입의 값)
		 * 참조형 타입	
		 * (참조형 타입 : 변수에다 값을 저장하는 것이 아니라 따로저장, 따로 저장한 주소를 저장하는 것)
		 * 인덱스로 값을 구분함 (저장된 공간에 붙어서 저장하므로, 인덱스 사용 , 0부터 시작) 
		 * 길이를 변경할 수 없다.	(->기존은 변경이 안되므로 새로운 배열을 만들어야함, 새로운걸 만들면 기존 변수는 사라짐)
		 * 		 
		 */
		 //int[] array; 	[]타입 뒤에 보통 붙임, 배열을 저장할 수 있는 공간이 만들어짐 ->배열의 주소를 저장할 공간이 만들어진다.
		 //array = new int[5];	 -> 배열이 생성되고 그 주소가 저장된다.	배열의 크기를 지정 (5개의 크기를 지정)
		 //[] =배열을 만들 때의 크기를 지정함배열의 크기를 지정 (5개의 크기를 지정)
		 //배열 초기화시 기본값이 저장된다.
		 //기본값은 숫자는 0		ex)5개의 공간에 각각 0이 들어감
		 //boolean : false
		 //char 기본값은 0 (공백) -> ' ' 
		 //참조형 타입 (배열, string) : null
		 // cf) char같은 문자- 컴퓨터에서 문자를 표현할 때, 숫자& 문자 연결하여 표현 (유니코드 표)
		 
		 // 배열을 만드는 방법
		 //1.
		 int[] array; 	//[]타입 뒤에 보통 붙임, 배열을 저장할 수 있는 공간이 만들어짐 ->배열의 주소를 저장할 공간이 만들어진다.
		 array = new int[5];	//배열이 생성되고 그 주소가 저장된다.	배열의 크기를 지정 (5개의 크기를 지정)

		 //2.
		 array = new int[] {1,2,3,4,5};	 
		
		 //3. 
		//array = {1,2,3,4,5}; 
		//선언과 초기화를 따로 해주면 안됨 =>선언과 초기화를 동시에 해야한다.
		int[] array1 = {1,2,3,4,5};
		
		//배열에 들어가있는 값에 접근
		//인덱스 - 지금은 0번 인덱스의 값을 출력
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		
		for (int a = 0; a < array.length; a++){
		} 
		
		//배열=인덱스를 사용하여 값을 읽거나 저장한다.
		
		//반복문과 같이 사용
		
		int sum = 0;	//인덱스가 0부터 시작하므로 0으로 초기화
		for(int i = 0; i < array.length; i++){		//length : 배열의 크기 또는 길이를 저장하고 있는 변수
				sum += array[i];					
		}
		System.out.println("합계 : " + sum);
		
		// 단축키
		// 자동완성 : Ctrl + spacebar
		// 한줄복사 : Ctrl + Alt + 방향키
		// 한줄 삭제 : Ctrl + d
		// 한줄 이동 : Alt + 방향기

		//예제
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화
//		int []  array3 = {1,2,3,4,5,6,7,8,9,10};
		int [] arr = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 '저장
		for (int i = 0; i <arr.length; i++){
			arr[i] = (int)(Math.random() * 100)+1;
			
		//배열에 저장된 모든 값의 합계와 평균 구하기
		sum = 0;
		for (int a = 0; i<arr.length; i++){
			sum += arr[i];
		}	
		
		//합계를 구한 뒤 arr.length =길이가 10개(갯수) 로 
		double avg = (double)sum /arr.length;   
		 System.out.println(" 합계 : " + sum + "/ 평균 : " + avg);
		}
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		//1. 최소값과 최대값 변수선언
		int max = 0;
		int min = 0;
		
		//2. 0번 인덱스 값에 저장
		max = arr[0];
		min = arr[0];
				 	 
		//3. 배열을 for문을 사용하여 비교하기
		//arr의 값을 새로주기
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()* 100);
			if(arr[i] < min){
				min = arr[i];	
			if (max < arr[i]){
				max = arr[i];
			}
			}
			}System.out.println(" min : " + min + " / max :  " + max);
			
			
			
			//================================
			
			int [] shuffle = new int[10];
			for(int i=	0; i < shuffle.length; i++){
				shuffle[i] = i +1;
			}
			System.out.println("변경 전 : "+Arrays.toString(shuffle));
			
			
			// 배열의 값을 섞어 주세요.
			//1. 랜덤한 인덱스를 발생시킨다.
			
			for(int i=0; i < shuffle.length; i++){
				int random = (int) (Math.random() *  shuffle.length);
				
				//2. 0번 인덱스와 랜덤 인덱스의 값을 교환한다.
				int temp = shuffle [0];		//shuffle[0]의 값 저장이 필요함 ->값을 저장해야 하는 변수 필요 
				shuffle [0] = shuffle[random];
				shuffle[random] = temp;
	
			}
			System.out.println("변경 후 : tab " + Arrays.toString(shuffle));
	
			//3. 위 내용을 반복 (for)
			
			
			//예제 3) 1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력
			
			//1. 랜덤값 생성 - 500번
			
			int [] count = new int [10]; //10개짜리 배열을 저장(횟수
		
			
			
			for (int i = 0; i < 500; i++){
				int ran = (int)(Math.random() * 10)+1;
				count[ran-1]++;					//인덱스의 규칙 
			}
			
				System.out.println(Arrays.toString(count));
					
			
			
			//2. 각각의 숫자가 발생된 횟수
			
				int[] arr1;
				arr1 = new int[500];  	//500번 생성

				int[] bss;
				bss = new int[10];		//1~10까지 랜덤

				for (int i = 0; i < arr1.length; i++) {
				arr1[i] = (int) (Math.random() * 10 + 1);


				for(int j=0; j<bss.length; j++){
				if(arr1[i]==j+1){
				bss[j]++;
				}
				}System.out.print(i + 1 + " : ");

				for(int j = 0; j<count[i]; j++){
				System.out.print("*");	//갯수만큼 돌면서 찍음
			}
		System.out.println(" " + count[i]); 	
	}
				}
	}


