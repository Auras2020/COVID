import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formular implements ActionListener{

	private JPanel panel;
	private JFrame frame;
	
	public Formular(JFrame frame, JPanel panel) {
		this.frame=frame;
		this.panel=panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setContentPane(panel);
	    frame.setVisible(true);
	}
	
}
