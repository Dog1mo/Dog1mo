package dnf_cal;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Data D = new Data();

		System.out.println("템렙계산기\n" );
		System.out.println("첫번째 장비의 템렙을 순서대로 입력해주세요");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		System.out.println("두번째 장비의 템렙을 순서대로 입력해주세요");
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		int b4 = sc.nextInt();
		//a,b는 각각 템렙
		
		int La1 = D.L[a1];
		int La2 = D.L[a2];
		int La3 = D.L[a3];
		int La4 = D.L[a4];
		int Lb1 = D.L[b1];
		int Lb2 = D.L[b2];
		int Lb3 = D.L[b3];
		int Lb4 = D.L[b4];

		// . 을 기준으로 앞은 레벨 뒤는 경험치(%)를 구분해서 입력받아야함
		// 10.50 = 10렙에 50%
		//
		int sum1 = La1 + Lb1;
		for(int i = 1; i < 60; i++) {
			int x = sum1 - D.L[i];
			if(x < 0) {
			System.out.print(i-1 + " ");
			break;
			}
		}
			
			
		int sum2 = La2 + Lb2;
		for(int i = 1; i < 60; i++) {
			int x = sum2 - D.L[i];
			if(x < 0) {
			System.out.print(i-1 + " ");
			break;
			}
		}
		
		
		int sum3 = La3 + Lb3;
		for(int i = 1; i < 60; i++) {
			int x = sum3 - D.L[i];
			if(x < 0) {
			System.out.print(i-1 + " ");
			break;
			}
		}
		
		
		int sum4 = La4 + Lb4;
		for(int i = 1; i < 60; i++) {
			int x = sum4 - D.L[i];
			if(x < 0) {
			System.out.print(i-1 + " ");
			break;
			}
		}



	}
}

