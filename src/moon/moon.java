package moon;

public class moon {

	public static void main(String[] args) {
		
		int count = 0;  // ���ڿ� ���ԵǾ� �ִ� 8�� ����
		
		for(int i = 1; i <= 10000 ; i++) {
			
			//1�� �ڸ��� 8�� �ִ� ���
			if(i%10 == 8)
				count ++;
			//10�� �ڸ��� 8�� �ִ� ���
			if((i/10)%10 == 8)
				count ++;
			//100�� �ڸ��� 8�� �ִ� ���
			if((i/100)%10 == 8)
				count ++;
			//1000�� �ڸ��� 8�� �ִ� ���
			if((i/1000)%10 == 8)
				count ++;
		}
		System.out.println("8�� ����:" + count);

	}

}
