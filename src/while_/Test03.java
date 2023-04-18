package while_;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
//		<1번 문제>
//
//		<입력한 숫자의 합계 구하기>
//		1. 숫자 입력
//		2. 입력한 숫자 보여주기
//		2. 0을 입력하면 사용종료 후 합계 출력
//
//		EX) 숫자 입력 => 2
//		     2
//		     숫자 입력 => 3 
//		     3
//		    숫자 입력 => 0
//		     0
//		    숫자 입력을 종료합니다.
//		    합계 : 6
		
		
		int num, sum=0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("수 입력 : ");
			num = scan.nextInt();
			
			System.out.println(num);
			sum += num;
			
			if(num == 0) {
				System.out.println("숫자 입력을 종료합니다");
				System.out.println("합계 : " + sum );
				break;
			}
			
		}
		
		
	}
}
