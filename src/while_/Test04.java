package while_;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		

		//<3번 문제>
		//입력받은 숫자가 소수인지 확인하시오

		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		num = scan.nextInt();
		
		for(int i=2; i<num;) {
			if(num%i == 0) {
				System.out.println("소수가 아닙니다");
				break;
			}else {
				System.out.println("소수입니다");
				break;
			}
		}
		
		
	}

}
