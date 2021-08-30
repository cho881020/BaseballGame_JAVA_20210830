package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		문제 출제된 숫자들이 담길 배열
		int[] questionNumArr = new int[3];
		
//		3자리 문제 출제.
		
		for (int i=0 ; i < questionNumArr.length ; i++) {
			
//			괜찮은 숫자가 나올때까지 무한 반복.
			while (true) {

//				1~9 숫자 랜덤 추출.
				int randomNum = (int) (Math.random() * 9 + 1); // 1.0001~9.9999 나오는데, int로 소수점 버림. -> 1 ~ 9
				
				boolean isDuplOk = true;
				
//				이미 출제된 숫자인지? 검사. 써도되나? 중복검사.
				for (int num  :  questionNumArr) {
					if (randomNum == num) {
//						중복 발견! 쓰면 안됨.
						isDuplOk = false;
					}
				}
				
//				괜찮다면 문제 배열에 담아주자.	
				
				if (isDuplOk) {
					questionNumArr[i] = randomNum;
					
//					i를 ++ 하기 위해 while (true) 종료.
					break;
				}
				
			}
			
			
		}
		
//		랜덤 숫자 확인용 for
		
		for (int num : questionNumArr) {
			System.out.println(num);
		}
		
	}

}







