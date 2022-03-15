
import java.time.LocalDateTime;
import java.util.Scanner;

public class NotePad {

	private int noteLength = 0; 
	private final NoteEntity[] noteEntities;
	private final int NOTE_SIZE = 20;
	private LocalDateTime lastUpdatedTime;

	public NotePad() {
		this.noteEntities = new NoteEntity[NOTE_SIZE];
	}

	public void addNote() {
		System.out.println("");
		if(NOTE_SIZE == this.noteLength) {
			System.out.println("메모가 최대입니다");
			System.out.println("");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("제목을 입력해주세요");
		String title = sc.nextLine();

		System.out.println("내용을 입력해주세요");
		String content = sc.nextLine();

		noteEntities[this.noteLength++] = NoteEntity.newInstance(title, content);
		System.out.println("저장되었습니다");
		System.out.println("");
	}

	public void printAllNotes() {
		System.out.println("");
		if(0 == this.noteLength) {
			System.out.println("작성된 메모가 없습니다");
			System.out.println("");
			return;
		}
		for (int i = 0; i < this.noteLength; i++) {
			NoteEntity noteEntity = noteEntities[i];
			String headLine = String.format(" 번호 : %d \n 제목: %s \n 작성날짜 : %s", i, noteEntity.getTitle(), noteEntity.getLastUpdatedTime());

			System.out.println(headLine);
		}
		System.out.println("");
	}

	public void printNote() {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 메모번호를 입력해주세요");
		int selectNum = sc.nextInt();
		NoteEntity noteEntity = noteEntities[selectNum];
		if(null == noteEntity) {
			System.out.println("메모가 비어있습니다");
			System.out.println("");
			return;
		}
		System.out.println("");
		String headLine = String.format(" 번호 : %d \n 제목 : %s",noteLength,noteEntity.getTitle());
		System.out.println(headLine);
		System.out.println(noteEntity.getLastUpdatedTime());
		System.out.println(noteEntity.getContent());
		System.out.println("");

	}
	public void deleteNote() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 메보번호를 입력해주세요");
		int selectedNum = Integer.parseInt(sc.nextLine());
		String title = "";
		String content = "";

		noteEntities[selectedNum] = NoteEntity.newInstance(title, content);

	}

	public void updateNote() {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 메보번호를 입력해주세요");
		int selectedNum = Integer.parseInt(sc.nextLine());

		System.out.println("내용을 작성해주세요");
		String content = sc.nextLine();

		NoteEntity noteEntity = noteEntities[selectedNum];
		if(null == noteEntity) {
			System.out.println("존재하지않습니다");
			return;
		}
		noteEntity.update(content);

		System.out.println("수정되었습니다");
		System.out.println("");
	}
}
