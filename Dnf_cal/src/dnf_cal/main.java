package dnf_cal;
import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		Data D = new Data();

		System.out.println("�۷�����");
		System.out.println("\n �� ù��° ����� ������ ����ġ�� ������� �Է����ּ���");
		System.out.println("    ex) 31���� 21% = 31 21");
		int a1 = sc.nextInt(); // a,b�� ���� �۷�
		float aExp1 = sc.nextFloat(); // ��� ����ġ �ۼ�Ʈ
		int a2 = sc.nextInt();
		float aExp2 = sc.nextFloat();
		int a3 = sc.nextInt();
		float aExp3 = sc.nextFloat();
		int a4 = sc.nextInt();
		float aExp4 = sc.nextFloat();
		
		System.out.printf("\n �� ù��° ��� ������ ����ġ�� Ȯ�����ּ��� \n");
		System.out.printf("   1�ɼ� - " + a1 + "Lv (%.2f%%)\n", aExp1);
		System.out.printf("   2�ɼ� - " + a2 + "Lv (%.2f%%)\n", aExp2);
		System.out.printf("   3�ɼ� - " + a3 + "Lv (%.2f%%)\n", aExp3);
		System.out.printf("   4�ɼ� - " + a4 + "Lv (%.2f%%)\n", aExp4);
		
		
		System.out.print("\n �� �ι�° ����� ������ ����ġ�� ������� �Է����ּ��� \n");
		int b1 = sc.nextInt();
		float bExp1 = sc.nextFloat();
		int b2 = sc.nextInt();
		float bExp2 = sc.nextFloat();
		int b3 = sc.nextInt();
		float bExp3 = sc.nextFloat();
		int b4 = sc.nextInt();
		float bExp4 = sc.nextFloat();
		
		System.out.print("\n �� �ι�° ��� ������ ����ġ�� Ȯ�����ּ��� \n");
		System.out.printf("   1�ɼ� - " + b1 + "Lv (%.2f%%)\n", bExp1);
		System.out.printf("   2�ɼ� - " + b2 + "Lv (%.2f%%)\n", bExp2);
		System.out.printf("   3�ɼ� - " + b3 + "Lv (%.2f%%)\n", bExp3);
		System.out.printf("   4�ɼ� - " + b4 + "Lv (%.2f%%)\n", bExp4);

		// La1�� ��� �� ����ġ
		// 
		float La1 = (float) (D.L[a1] + ((D.L[a1+1] - D.L[a1]) * (aExp1 * 0.01))); 
		float La2 = (float) (D.L[a2] + ((D.L[a2+1] - D.L[a2]) * (aExp2 * 0.01)));
		float La3 = (float) (D.L[a3] + ((D.L[a3+1] - D.L[a3]) * (aExp3 * 0.01)));
		float La4 = (float) (D.L[a4] + ((D.L[a4+1] - D.L[a4]) * (aExp4 * 0.01)));
		float Lb1 = (float) (D.L[b1] + ((D.L[b1+1] - D.L[b1]) * (bExp1 * 0.01)));
		float Lb2 = (float) (D.L[b2] + ((D.L[b2+1] - D.L[b2]) * (bExp2 * 0.01)));
		float Lb3 = (float) (D.L[b3] + ((D.L[b3+1] - D.L[b3]) * (bExp3 * 0.01)));
		float Lb4 = (float) (D.L[b4] + ((D.L[b4+1] - D.L[b4]) * (bExp4 * 0.01)));

		

		
		float sum1 = La1 + Lb1;
		for(int i = 1; i < 60; i++) {
			float x = sum1 - D.L[i];
			if(x < 0) {
				float y = (Math.round(((sum1 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1])) * 100) / 100);
				System.out.printf("\n1�ɼ� - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}

		
		float sum2 = La2 + Lb2;
		for(int i = 1; i < 60; i++) {
			float x = sum2 - D.L[i];
			if(x < 0) {
				float y = (Math.round(((sum2 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1])) * 100) / 100);
				System.out.printf("\n2�ɼ� - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}


		float sum3 = La3 + Lb3;
		for(int i = 1; i < 60; i++) {
			float x = sum3 - D.L[i];
			if(x < 0) {
				float y = (Math.round(((sum3 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1])) * 100) / 100);
				System.out.printf("\n3�ɼ� - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}


		float sum4 = La4 + Lb4;
		for(int i = 1; i < 60; i++) {
			float x = sum4 - D.L[i];
			if(x < 0) {
				float y = (Math.round(((sum4 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1])) * 100) / 100);
				System.out.printf("\n4�ɼ� - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}

		System.out.printf("\n\n�߰��� �����Ͻðڽ��ϱ�?(Y/N)\n");


	}
}

