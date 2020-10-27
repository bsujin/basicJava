package practice;

public class Index {
	
	private int [] unsortedArr = new int []{56,50,45,30,25,4,2,30,1,55,20};	//정렬 안되어있음
	private int [] sortedArr = new int[]{1, 2, 4, 20, 25, 30, 30, 35, 45, 50, 55, 56};	//오름차순 정렬

	
	

	public static void main(String[] args) {
		
		//System.out.println(UUID.randomUUID().toString());
	
			//객체생성
			Index index = new Index();
			
		//매소드 호출
		index.UnsortedArray(30);
		index.soretedArray(30);
		//이름이 유사하여 알려줌 
		
	
	
	}
	private void soretedArray(int value) {
		// sortedArr에서 value 값이 몇번 등장하는지 찾고, 몇번 등장하는지 결과 출력 
		int count = 0;
		for(int i = 0; i< sortedArr.length; i++){
			if(sortedArr[i]==value){
				count++;
			}else if(sortedArr[i] > value){
				break;
			}
		}
		
		
	}
	//매소드 생성
	private void UnsortedArray(int value) {
		// sorteArr에서 value 값이 있는지 찾고, 몇번 등장하는지 결과 출력 

		int count1 = 0;
		for(int i = 0; i<unsortedArr.length; i++){
			if (unsortedArr[i]==value){
				count1++;
			} 
		}
		
		
		
		
	}

}
