
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
			System.out.println("�޸� �ִ��Դϴ�");
			System.out.println("");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		String title = sc.nextLine();

		System.out.println("������ �Է����ּ���");
		String content = sc.nextLine();

		noteEntities[this.noteLength++] = NoteEntity.newInstance(title, content);
		System.out.println("����Ǿ����ϴ�");
		System.out.println("");
	}

	public void printAllNotes() {
		System.out.println("");
		if(0 == this.noteLength) {
			System.out.println("�ۼ��� �޸� �����ϴ�");
			System.out.println("");
			return;
		}
		for (int i = 0; i < this.noteLength; i++) {
			NoteEntity noteEntity = noteEntities[i];
			String headLine = String.format(" ��ȣ : %d \n ����: %s \n �ۼ���¥ : %s", i, noteEntity.getTitle(), noteEntity.getLastUpdatedTime());

			System.out.println(headLine);
		}
		System.out.println("");
	}

	public void printNote() {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ȯ���� �޸��ȣ�� �Է����ּ���");
		int selectNum = sc.nextInt();
		NoteEntity noteEntity = noteEntities[selectNum];
		if(null == noteEntity) {
			System.out.println("�޸� ����ֽ��ϴ�");
			System.out.println("");
			return;
		}
		System.out.println("");
		String headLine = String.format(" ��ȣ : %d \n ���� : %s",noteLength,noteEntity.getTitle());
		System.out.println(headLine);
		System.out.println(noteEntity.getLastUpdatedTime());
		System.out.println(noteEntity.getContent());
		System.out.println("");

	}
	public void deleteNote() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �޺���ȣ�� �Է����ּ���");
		int selectedNum = Integer.parseInt(sc.nextLine());
		String title = "";
		String content = "";

		noteEntities[selectedNum] = NoteEntity.newInstance(title, content);

	}

	public void updateNote() {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �޺���ȣ�� �Է����ּ���");
		int selectedNum = Integer.parseInt(sc.nextLine());

		System.out.println("������ �ۼ����ּ���");
		String content = sc.nextLine();

		NoteEntity noteEntity = noteEntities[selectedNum];
		if(null == noteEntity) {
			System.out.println("���������ʽ��ϴ�");
			return;
		}
		noteEntity.update(content);

		System.out.println("�����Ǿ����ϴ�");
		System.out.println("");
	}
}
