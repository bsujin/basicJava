package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {

		//배열 사용시 길이가 정해져있어 변경이 어려움, 새로 생성 
		String str = "a";
		
		//만번을 돌면서 계속 문자열을 변경 => 만번 객체 생성
		
		//앞뒤로 시작과 끝난시간을 계산하여 총 걸린시간 구하기. 
//		long start = System.currentTimeMillis(); 
//		
//		for(int i = 0; i <100000; i++){
//			str += "a";
//			//System.out.println(str);
//			
//		}
//		
//		long end = System.currentTimeMillis(); 
//		System.out.println(end - start + "ms");
//		=> 5010ms 출력 
		
		
		
		
		//string buffer = 문자열을 많이 바꿀때 사용, * 스트링은 비효율적으로 변경됨
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i<100000; i++){
			sb.append("a");
		} 
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}
	
	

}
