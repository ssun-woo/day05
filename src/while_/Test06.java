package while_;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		 문제 1.
//
//		잔액확인하는 프로그램
//		- 현재 가지고 있는 돈과 얼마를 썼는지를 입력받아 잔액을 출력하고 0이되면 종료

		Scanner scan = new Scanner(System.in);
		int now, use;
		System.out.print("현재 가지고 있는 돈을 입력하세요 : ");
		now = scan.nextInt();

		while (true) {
			System.out.print("사용할 금액을 입력하세요 : ");
			use = scan.nextInt();
			if (use > now) {
				System.out.println("잔고가 부족합니다");
				System.out.println("현재 잔고 : " + now);
				continue;
			} else {
				now -= use;
				System.out.println("현재 잔고 : " + now);
				if (now == 0) {
					System.out.println("종료합니다");
					break;
				}
			}

		}

	}

}
