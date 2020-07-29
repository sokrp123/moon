package moon;

public class moon {

	public static void main(String[] args) {
		
		int count = 0;  // 숫자에 포함되어 있는 8의 개수
		
		for(int i = 1; i <= 10000 ; i++) {
			
			//1의 자리에 8이 있는 경우
			if(i%10 == 8)
				count ++;
			//10의 자리에 8이 있는 경우
			if((i/10)%10 == 8)
				count ++;
			//100의 자리에 8이 있는 경우
			if((i/100)%10 == 8)
				count ++;
			//1000의 자리에 8이 있는 경우
			if((i/1000)%10 == 8)
				count ++;
		}
		System.out.println("8의 개수:" + count);

	}

}
