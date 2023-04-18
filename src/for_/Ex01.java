package for_;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * F11 : 디버깅 시작
		 * 
		 * (ctrl + F11)과 F11은 보이는 기능은 같으나 실질적인 기능은 조금 다름 숫자 옆 파란 바를 더블클릭하면 브레이킹 포인터를 설정할
		 * 수 있음
		 * 
		 * F5 : 한줄씩 실행(메소드 안으로 들어감) 
		 * F6 : 한줄씩 실행
		 * F8 : run (다음 break point 지점으로 이동)
		 * 
		 * main시작에 브레이킹 포인터를 설정하고 F11을 누르면 보이는게 조금 다름 
		 * (ctrl + F2)로 디버깅 종료할 수 있음
		 * 
		 * 브레이킹 포인터를 실행한게 아님, 그 길행 차례 바로 전을 나타냄
		 * 
		 */

		System.out.println("main 시작");

		int sum = 0;

		for (int i = 1; i <= 100000; i++) {
			sum += i;
			System.out.println(i + "종속문장");
		}
		System.out.println("sum : " + sum);
		System.out.println("main 종료");
		
		// i의 값과 sum의 값이 내가 설정하고 생각한대로 바뀌는지 F6누르면서 확인
		
		for (int i = 1; i <= 100000; i++) {
			sum += i;
			System.out.println(i + "종속문장");
		}
		System.out.println("sum : " + sum);
		System.out.println("main 종료");
		
		// 처음이 아닌 보고싶은 곳(28번줄)에 브레이킹 포인트를 설정함
		// 이후에 보고싶은 다른 곳(37번줄)에 브레이킹 포인트 설정 후 기존(28번줄)의 브레이킹 포인트를 해제하고
		// F8을 누르면 그 위치로 이동하며 이전에 코드들이 실행된 상태로 이동됨
	}
}
