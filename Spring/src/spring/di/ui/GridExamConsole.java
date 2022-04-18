package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;

	public GridExamConsole() {
		// TODO 磊悼 积己等 积己磊 胶庞
	}

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {

		System.out.println("total | avg");
		System.out.printf("%3d | %3.2f \n", exam.total(), exam.avg());

	}


	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
