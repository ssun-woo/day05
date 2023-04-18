package while_;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, sum = 0;

		while (true) {
			System.out.print("10~20 사이의 수 입력 : ");
			num = scan.nextInt();

			if (num < 10 || num > 20) {
				System.out.println("범위를 벗어났습니다 다시 입력해주세요");
				continue;
			}
			break;
		}

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + "까지의 합 : " + sum);

		boolean bool = true;
		int n = 1;
		while (bool) { // bool == true와 같은 의미
			System.out.println("bool 종속문장 실행");
			n++;
			if (n == 2) {
				// bool = false;
				break;
			}
			System.out.println("while 종료");
		}
		
		// bool = false와 break의 차이점
		// bool = false 는 while문을 끝까지 실행시키고 종료되고
		// break는 만나면 바로 while문을 빠져나옴
	}

}
