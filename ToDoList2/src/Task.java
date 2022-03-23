import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Task extends JPanel{

	private JLabel index;
	private JTextField taskName;
	private JButton done;

	private boolean checked;

	Task(){
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.pink);

		this.setLayout(new BorderLayout());

		checked = false;

		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);

		taskName = new JTextField("입력하세요");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		this.setBackground(Color.red);

		this.add(taskName,BorderLayout.CENTER);

		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(new Color(235,216,196));

		this.add(done,BorderLayout.EAST);
	}

	public void changeIndex(int num) {
		this.index.setText(num+"");
		this.revalidate();
	}

	public JButton getDone() {
		return done;
	}

	public boolean getState() {
		return checked;
	}

	public void changeState() {
		if(!checked) {
			this.setBackground(Color.GREEN);
			checked = true;
		}
		else {
			this.setBackground(Color.red);
			checked = false;
		}
	}
}