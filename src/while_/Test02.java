package while_;

public class Test02 {

	public static void main(String[] args) {
		
		
		// 구구단 홀수단만 출력
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				if(j%2==0) {
					continue;
				}
				System.out.print(j+"*"+i + "=" + i*j +"\t");
			}
			System.out.println();
		}
		
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(i%2==0) {
					continue;
				}
				System.out.print(i+"*"+j + "=" + i*j +"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
