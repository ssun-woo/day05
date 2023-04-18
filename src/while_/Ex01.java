package while_;

public class Ex01 {
	
	public static void main(String[] args) {
		/*
		 while(조건식){
		 	종속문장
		 }
		 다음문장
		 */
		
		int i=0, sum=0;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("while : "+ sum);
		
		
		// for과 while은 똑같이 사용이 가능
		
		i=1; sum=0;		// 위에서 값이 바꼈기 때문에 다시 초기화
		for( ; i<=10; ) {
			sum += i;
			i++;
		}
		System.out.println("for : "+ sum);
		
		
	}
	
	
}
