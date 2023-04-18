package while_;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

//		rpg만들기
//        
//		적의 hp 자신의 count(10)와 mp(100)를 만들고 적의 hp가 0이하가 되거나 자신의 count가 0이 되면 종료
//
//		일반공격과 스킬은 각각 10, 20의 데미지를 각각 입히며 count는 한 번의 공격을 할 때마다 1씩 감소
//
//		스킬을 사용하면 mp가 20씩 소모된다.
//
//		적의 hp는 난수를 이용 EX) Math.floor( Math.random() * 500 );

		Scanner scan = new Scanner(System.in);

		int count = 10;
		int mp = 100;
		int hp = (int) Math.floor(Math.random() * 500);
		int skill = 20;
		int attack = 10;

		while (true) {

			System.out.println("1. 기본공격\t2. 스킬공격\t3.적 체력 보기");
			System.out.print("원하는 기능 선택 : ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				count--;
				hp -= 10;
				System.out.println("기본공격을 사용합니다");
				System.out.println("남은 count : " + count);
				System.out.println("남은 적 체력 : " + hp);

				if (count == 0) {
					System.out.println("패배했습니다");
					return;
				}
				if (hp <= 0) {
					System.out.println("승리했습니다");
					return;
				}
				break;
				
			case 2:
				if(mp>=20) {
					mp -= 20;
					hp -= 20;
					count--;
					System.out.println("스킬공격을 사용합니다");
					System.out.println("남은 count : " + count);
					System.out.println("남은 적 체력 : " + hp);
					System.out.println("남은 mp : " + mp);
				}else {
					System.out.println("mp가 부족합니다");
					continue;
				}
				if (count == 0) {
					System.out.println("패배했습니다");
					return;
				}
				if (hp <= 0) {
					System.out.println("승리했습니다");
					return;
				}
				break;
			case 3:
				System.out.println("남은 적 체력 : " + hp);
				System.out.println("남은 count : " + count);
				break;

			}

		}

	}
}
