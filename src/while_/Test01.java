package while_;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 문제만들기

		// 물건구매
		//
		// 사과 2000원 배 1500원 바나나 1700원 포도 3000원
		// 구매 총 갯수가 10개 이상이면 전체금액의 10% 할인
		// 구매 총 갯수가 20개 이상이면 전체금액의 20% 할인
		//
		// 이후 받는 금액 입력
		// 총 금액보다 낮으면 금액이 모자랍니다 출력 후 다시 입력
		// 총 금액보다 높으면 잔돈계산 후 출력

		Scanner scan = new Scanner(System.in);
		int appleSum = 0, pearSum = 0, bananaSum = 0, grapeSum = 0; // 각 과일 총 금액 초기값
		int totalSum = appleSum + pearSum + bananaSum + grapeSum;
		int apple = 0, pear = 0, banana = 0, grape = 0; // 각 구매갯수 초기값
		int total = 0;
		int money = 0;
		int totalSum10 = 0, totalSum20 = 0;

		while (true) {
			System.out.println("=====================");
			System.out.println("1. 사과(2000원)\t2. 배(1500원)\t3. 바나나(1700원)\t4. 포도(3000원)\n5. 구매내역 확인\t6. 결제\t\t7. 종료");
			System.out.println("10개 이상구매시 10%, 20개 이상 구매시 20% 할인");
			System.out.println("=====================");
			System.out.print("번호 입력 : ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("구매할 사과 개수 입력 : ");
				apple = scan.nextInt();
				if (apple < 0) {
					System.out.println("잘못된 입력입니다");
					apple = 0;
					appleSum = 0;
				} else {
					appleSum = apple * 2000;
					totalSum += appleSum;
					total += apple;
				}
				break;
			case 2:
				System.out.print("구매할 배 개수 입력 : ");
				pear = scan.nextInt();
				if (pear < 0) {
					System.out.println("잘못된 입력입니다");
					pear = 0;
					pearSum = 0;
				}
				pearSum = pear * 1500;
				totalSum += pearSum;
				total += pear;
				break;
			case 3:
				System.out.print("구매할 바나나 개수 입력 : ");
				banana = scan.nextInt();
				if (banana < 0) {
					System.out.println("잘못된 입력입니다");
					banana = 0;
					bananaSum = 0;
				}
				bananaSum = banana * 1700;
				totalSum += bananaSum;
				total += banana;
				break;
			case 4:
				System.out.print("구매할 포도 개수 입력 : ");
				grape = scan.nextInt();
				if (grape < 0) {
					System.out.println("잘못된 입력입니다");
					grape = 0;
					grapeSum = 0;
				}
				grapeSum = grape * 3000;
				totalSum += grapeSum;
				total += grape;
				break;
			case 5:
				System.out.println("============");
				System.out.println("구매 내역");
				if (total == 0) {
					System.out.println("현재 구매 내역이 없습니다");
				} else {
					System.out.println("사과 : " + apple);
					System.out.println("배 : " + pear);
					System.out.println("바나나 : " + banana);
					System.out.println("포도 : " + grape);
					if (total >= 10) {
						totalSum10 = (int) (totalSum * 0.9);
						System.out.println("총 금액은 : " + totalSum10 + "원 입니다");
						totalSum10 = totalSum;
					} else if (total >= 20) {
						totalSum20 = (int) (totalSum * 0.8);
						System.out.println("총 금액은 : " + totalSum20 + "원 입니다");
						totalSum20 = totalSum;
					} else {
						System.out.println("총 금액은 : " + totalSum + "원 입니다");
					}
				}
				break;
			case 6:
				System.out.println("결제");
				if (total == 0) {
					System.out.println("현재 구매 내역이 없습니다");
					continue;
				} else {
					if (total >= 10) {
						totalSum10 = (int) (totalSum * 0.9);
						System.out.println("총 금액은 : " + totalSum10 + "원 입니다");
						while (true) {
							System.out.print("받은 금액 : ");
							money = scan.nextInt();
							if (totalSum10 > money) {
								System.out.println("금액이 모자랍니다");
								continue;
							} else {
								System.out.println("잔액 : " + (money - totalSum10));
								break;
							}
						}
						totalSum10 = totalSum;
					} else if (total >= 10) {
						totalSum20 = (int) (totalSum * 0.8);
						System.out.println("총 금액은 : " + totalSum20 + "원 입니다");
						while (true) {
							System.out.print("받은 금액 : ");
							money = scan.nextInt();
							if (totalSum20 > money) {
								System.out.println("금액이 모자랍니다");
								continue;
							} else {
								System.out.println("잔액 : " + (money - totalSum20));
								break;
							}
						}
						totalSum20 = totalSum;
					} else {
						System.out.println("총 금액은 : " + totalSum + "원 입니다");
						while (true) {
							System.out.print("받은 금액 : ");
							money = scan.nextInt();
							if (totalSum > money) {
								System.out.println("금액이 모자랍니다");
								continue;
							} else {
								System.out.println("잔액 : " + (money - totalSum));
							}
						}
					}
				}
				System.out.println("안녕히가세요");
				return;
			case 7:
				System.out.print("안녕히가세요");
				return;
			default:
				System.out.println("잘못된 입력입니다");
				break;
			}

		}

	}
}
