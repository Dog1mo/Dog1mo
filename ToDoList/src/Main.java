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
			System.out.println("원하는 기능의 번호를 입력하세요");
			System.out.println(" 1 : 추가\n 2 : 삭제\n 3 : 위치 변경\n 4 : 전부 삭제\n 5 : 입력 개수\n 6 : 종료");

			select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("내용을 입력하세요");
				doing = sc.next();
				myList.add(doing);
				myList.display();
				break;

			case 2:
				System.out.println("삭제할 번호를 입력하세요");
				System.out.println();
				myList.display();
				num1 = sc.nextInt();
				myList.remove(num1);
				myList.display();
				break;

			case 3:
				System.out.println();
				myList.display();
				System.out.println("위치를 변경할 번호를 입력하세요");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				myList.replace(num1, num2);
				myList.display();
				break;

			case 4:
				System.out.println();
				myList.clear();
				System.out.println("전부 삭제 완료");
				break;

			case 5:
				System.out.println();
				System.out.println("크기는 " + myList.getCurrentSize() + "입니다");
				break;

			case 6:
				System.out.println();
				System.out.println("종료되었습니다");
				break;

			default:

				System.out.println("번호를 다시 입력해주세요");

				break;



			}// end switch





		}// end while



	}// end main



}// end class