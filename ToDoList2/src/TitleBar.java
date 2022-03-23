import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class TitleBar extends JPanel{
	
	TitleBar(){
		this.setPreferredSize(new Dimension(400,80));
		this.setBackground(new Color(255,236,196));
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200,80));
		titleText.setFont(new Font("±¼¸²Ã¼",Font.BOLD, 30));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	}
}