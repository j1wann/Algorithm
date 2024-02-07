import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int X = Integer.parseInt(N);
		int cnt = 0;
		int a;
		int b;
		int c;
		/*
		 * 100 < X 으로 걸러냄 100 아래일 떄 : X 그대로 출력 100 < x 일때 : 99 + ?
		 * 
		 * 정수 X는 a*100+b*10+c라고 할 수 있음 X에서 a, b, c를 먼저 구분 >> 등차수열 조건을 만족하는지 확인
		 * 
		 * 구분 : charat
		 * i 숫자 분리 
		 * 
		 * 
		 */
		if (X < 100) {
			System.out.println(X);
		} else {
			for(int i = 100; i<=X; i++) {
				a = i/100;
				b = (i-100*a)/10;
				c = (i-100*a-b*10);
				if((a-b)==(b-c))
					cnt++;
			}
			System.out.println(99+cnt);
		}
		
	}
}
