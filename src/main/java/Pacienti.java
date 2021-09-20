import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pacienti implements ActionListener{

	private JTextField text;
	private List<Utilizator> util=new ArrayList<>();
	private List<Utilizator> util1=new ArrayList<>();
	private List<Utilizator> util2=new ArrayList<>();
	private JFrame frame;
	
	public Pacienti(List<Utilizator> util, List<Utilizator> util1, 
			List<Utilizator> util2, JTextField text, JFrame frame) {
		this.util=util;
		this.util1=util1;
		this.util2=util2;
		this.text=text;
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String x="";
		if(text.getText().equals("1")) {
			for(int i=0; i<util.size(); i++) {
			if(util.get(i)!=null) {
				x+=util.get(i).getNume()+", ";
			}
		}
		}
		if(text.getText().equals("2")) {
			for(int i=0; i<util1.size(); i++) {
			if(util1.get(i)!=null) {
				x+=util1.get(i).getNume()+", ";
			}
		}
		}
		if(text.getText().equals("3")) {
			for(int i=0; i<util2.size(); i++) {
			if(util2.get(i)!=null) {
				x+=util2.get(i).getNume()+", ";
			}
		}
		}
		
		int count=0, i=0;
		try {
			i=Integer.parseInt(text.getText());
		}
		catch(NumberFormatException excep) {
			JOptionPane.showMessageDialog(frame, "Introduceti un numar", "Alert", 
					JOptionPane.WARNING_MESSAGE);
			count++;
		}
		if(count==0) {
			if(x=="") {
				JOptionPane.showMessageDialog(frame, "nu exista utilizatori inscrisi in etapa "
						+ i + " deocamdata");
			}
			else {
				JOptionPane.showMessageDialog(frame, x);
			}
		}
	
	}
	
	
}
