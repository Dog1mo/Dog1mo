package dnf_cal;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Data D = new Data();

		System.out.println("�۷�����\n" );
		System.out.println("ù��° ����� �۷��� ������� �Է����ּ���");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		System.out.println("�ι�° ����� �۷��� ������� �Է����ּ���");
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		int b4 = sc.nextInt();
		//a,b�� ���� �۷�
		
		int La1 = D.L[a1];
		int La2 = D.L[a2];
		int La3 = D.L[a3];
		int La4 = D.L[a4];
		int Lb1 = D.L[b1];
		int Lb2 = D.L[b2];
		int Lb3 = D.L[b3];
		int Lb4 = D.L[b4];

		// . �� �������� ���� ���� �ڴ� ����ġ(%)�� �����ؼ� �Է¹޾ƾ���
		// 10.50 = 10���� 50%
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

