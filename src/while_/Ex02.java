package while_;

public class Ex02 {

	public static void main(String[] args) {

		/*
		 break : switch 또는 반복문을 빠져나올때 사용 
		 continue : 반복문의 위로 이동
		 */

		int i = 1;
		while (true) {
			System.out.println(i++);
			if (i == 5) {
				break;
			}
		}
		System.out.println("다음 문장들 실행~\n");
		
		
//		if(true) {
//			break;
//		}
//		오류발생 >> if 문 내에서는 break 사용 불가능
		
		
		for(int k=1; k<=5; k++) {
			if(k==3) {
				System.out.println("3333333");
				continue;
			}
			System.out.println(k);
		}
		System.out.println("다음 문장들 실행~");
		
		// continue;가 있을때와 없을때의 차이점 보기
		// continue를 만나면 밑으로 내려가는게 아닌 바로 위(반복문의 시작)로 올라감
		
		
		
		
		
		
	}

}
