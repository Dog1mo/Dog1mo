
import java.util.Scanner;

public class NoteService {
	
	private final NotePad notepad;
	
	public NoteService() {
		this.notepad = new NotePad();
	}

	public void run() {

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�޸��� \n 1.�޸𸮽�Ʈ \n 2.�޸𺸱� \n 3.�޸��ۼ� \n 4.�޸���� \n 5.�޸���� \n 6.���� \n ��ȣ�� �Է����ּ���");
			int select = sc.nextInt();

			if(select == 1) {
                notepad.printAllNotes();
			}
			else if(select == 2) {
                notepad.printNote();
			}
			else if(select == 3) {
                notepad.addNote();
			}
			else if(select == 4) {
                notepad.updateNote();
			}
			else if(select == 5) {
				notepad.deleteNote();
			}
			else if(select == 6) {
				break;
			}
			else {
				System.out.println("");
				System.out.println("��ȣ�� �ٽ� �Է����ּ���");
				System.out.println("");
			}

		}
	}
}
