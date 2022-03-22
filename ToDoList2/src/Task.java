import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

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
		this.setBackground(Color.red);

		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
	}

}