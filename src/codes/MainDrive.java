package codes;

import java.util.Scanner;

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
		
		
//		정답을 맞출때까지 계속 숫자를 입력받자.
//		Scanner 한번 만들고 => 계속 활용.
		
		Scanner myScanner = new Scanner(System.in);
		
		
//		입력값을 담아줄 배열
		int[] inputNumberArr = new int[3];
		
		while (true) {
			
			System.out.print("3자리 숫자 입력 : ");
			int num = myScanner.nextInt();
			
//			입력받은 숫자를 567 => 5,6,7 세칸 배열로 쪼개주자.
			
//			배열[0] => 100의자리. [1] => 10의자리. [2] => 1의 자리.
//			전제 : 세자리 숫자를 잘 입력했다.
			
//			100의자리 : 숫자를 100으로 나눈 몫?
			inputNumberArr[0] = num / 100;
			
			
			
			
		}
		

		
		
	}

}







