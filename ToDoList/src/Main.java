import java.util.Scanner;


public class Main {



	public static void main (String args[])

	{
		Scanner sc = new Scanner(System.in);

		int select = 0;
		String doing;
		int num1, num2;

		ToDoList myList = new ToDoList();

		System.out.println("----To Do List-----");

		while(select !=6)
		{
			System.out.println("���ϴ� ����� ��ȣ�� �Է��ϼ���");
			System.out.println(" 1 : �߰�\n 2 : ����\n 3 : ��ġ ����\n 4 : ���� ����\n 5 : �Է� ����\n 6 : ����");

			select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("������ �Է��ϼ���");
				doing = sc.next();
				myList.add(doing);
				myList.display();
				break;

			case 2:
				System.out.println("������ ��ȣ�� �Է��ϼ���");
				System.out.println();
				myList.display();
				num1 = sc.nextInt();
				myList.remove(num1);
				myList.display();
				break;

			case 3:
				System.out.println();
				myList.display();
				System.out.println("��ġ�� ������ ��ȣ�� �Է��ϼ���");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				myList.replace(num1, num2);
				myList.display();
				break;

			case 4:
				System.out.println();
				myList.clear();
				System.out.println("���� ���� �Ϸ�");
				break;

			case 5:
				System.out.println();
				System.out.println("ũ��� " + myList.getCurrentSize() + "�Դϴ�");
				break;

			case 6:
				System.out.println();
				System.out.println("����Ǿ����ϴ�");
				break;

			default:

				System.out.println("��ȣ�� �ٽ� �Է����ּ���");

				break;



			}// end switch





		}// end while



	}// end main



}// end class