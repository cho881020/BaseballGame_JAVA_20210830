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
		
		
//		총 답안 입력 횟수를 저장할 변수. (한번 입력시마다 ++)
		int inputCount = 0;
		
		while (true) {
			
			System.out.print("3자리 숫자 입력 : ");
			int num = myScanner.nextInt();
			
//			1회 입력 추가.
			inputCount++;
			
//			입력받은 숫자를 567 => 5,6,7 세칸 배열로 쪼개주자.
			
//			배열[0] => 100의자리. [1] => 10의자리. [2] => 1의 자리.
//			전제 : 세자리 숫자를 잘 입력했다.
			
//			100의자리 : 숫자를 100으로 나눈 몫?
			inputNumberArr[0] = num / 100;
			
//			10의 자리 : 567 => 5"6"  : 1의 자리 추출
			inputNumberArr[1] = (num / 10)  % 10; 
			
//			1의 자리 : 567 => 7  : 숫자를 10으로 나눈 나머지.
			inputNumberArr[2] = num % 10;
			
			
//			s : 몇개?, b : 몇개? 구해주자.
//			갯수 => 0개 출발, 발견할때마다 ++
			
			int strikeCount = 0;
			int ballCount = 0;
			
			
//			내 숫자 하나를 들고 -> 문제 숫자 3자리 검토.  3번 반복.
			
//			같은 숫자를 찾으면 => 위치 (index) 도 같은가? => index 변수 필요.
			
			for ( int i=0; i < inputNumberArr.length ; i++) {
				
				for (int j=0 ; j < questionNumArr.length ; j++) {
					
//					지금 보는 내 입력 숫자와, 문제의 숫자가 서로 같은가?
					if (inputNumberArr[i] == questionNumArr[j]) {
						
//						같다! => S/B 추가 질문. => index도 같은가?
						if (i == j) {
//							숫자도 / 위치도 같다.
//							strike 하나 발견.
							strikeCount++;
						}
						else {
//							숫자는 같지만 / 위치는 다르다.
//							ball 하나 발견.
							ballCount++;
						}
						
					}
					
				}
				
			}
			
//			?S ?B 출력.
			
			System.out.println(strikeCount + "S " + ballCount + "B 입니다.");
			
			if (strikeCount == 3) {
//				3S 가 맞다면 => 축하메세지 출력
//				while문 깨고 탈출. => 프로그램 종료.
				
				System.out.println("축하합니다.!");
				
//				몇번만에 맞췄는지도 같이 출력.
				System.out.println(inputCount + "회 만에 정답을 맞췄습니다.");
				
				break;
				
			}
			
			
		}
		

		
		
	}

}







