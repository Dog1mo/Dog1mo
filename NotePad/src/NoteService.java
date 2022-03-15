
import java.util.Scanner;

public class NoteService {
	
	private final NotePad notepad;
	
	public NoteService() {
		this.notepad = new NotePad();
	}

	public void run() {

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("메모장 \n 1.메모리스트 \n 2.메모보기 \n 3.메모작성 \n 4.메모수정 \n 5.메모삭제 \n 6.종료 \n 번호를 입력해주세요");
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
				System.out.println("번호를 다시 입력해주세요");
				System.out.println("");
			}

		}
	}
}
