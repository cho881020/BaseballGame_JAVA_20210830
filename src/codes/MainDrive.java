package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
		int[] questionNumArr = new int[3];
		
		for (int i=0 ; i < questionNumArr.length ; i++) {
			
			while (true) {

				int randomNum = (int) (Math.random() * 9 + 1); // 1.0001~9.9999 나오는데, int로 소수점 버림. -> 1 ~ 9
				
				boolean isDuplOk = true;
				
//				이미 출제된 숫자인지? 검사. 써도되나? 중복검사.
				for (int num  :  questionNumArr) {
					if (randomNum == num) {
						isDuplOk = false;
					}
				}
				
				
				if (isDuplOk) {
					questionNumArr[i] = randomNum;
					break;
				}
				
			}
			
			
		}
		
		for (int num : questionNumArr) {
			System.out.println(num);
		}
		
		Scanner myScanner = new Scanner(System.in);
		
		
		int[] inputNumberArr = new int[3];
		
		
		int inputCount = 0;
		
		while (true) {
			
			System.out.print("3자리 숫자 입력 : ");
			int num = myScanner.nextInt();
			
			inputCount++;
			
			inputNumberArr[0] = num / 100;
			inputNumberArr[1] = (num / 10)  % 10; 
			inputNumberArr[2] = num % 10;
			
			
			int strikeCount = 0;
			int ballCount = 0;
			
						
			for ( int i=0; i < inputNumberArr.length ; i++) {
				
				for (int j=0 ; j < questionNumArr.length ; j++) {
					
					if (inputNumberArr[i] == questionNumArr[j]) {
						
						if (i == j) {
							strikeCount++;
						}
						else {
							ballCount++;
						}
						
					}
					
				}
				
			}
			
			System.out.println(strikeCount + "S " + ballCount + "B 입니다.");
			
			if (strikeCount == 3) {
				System.out.println("축하합니다.!");
				System.out.println(inputCount + "회 만에 정답을 맞췄습니다.");
				
				break;
				
			}
			
			
		}
		

		
		
	}

}







