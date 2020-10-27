package practice;

public class DiffAVG {

	public static void main(String[] args) {
		
		int [] arr =  new int [] {36,21,11,6,4};
		
		/* PL/SQL - 커서나 테이블타입의 변수
		 *	- 테이블타입을 이용  
		 */
		
		// arr 변수에 담긴 값들의 간격의 평균 구하기
		
		// 36-21 = 15
		// 21-11 = 10
		// 11-6 = 5
		// 6-4 = 2
		//(15+10+5+2)/4 = 8
		
		int sum= 0;
		for (int i = 0; i<arr.length -1; i++){
			int result = arr[i] - arr[i+1]; 
						//	다음 인덱스 이므로 +1 
			System.out.println(arr[i] + " 과 " + arr[i+1] + " 의 간격 : "+ result);	
				sum += result;
//			System.out.println("s:" + sum);
//			
//			int avg = sum/4;
//			System.out.println(avg);
		}  	
			int avg = sum/(arr.length-1);
			System.out.println("평균 : " + avg);
			
			
			
		
				
			
		
		
		
		
		
		
	}

}
