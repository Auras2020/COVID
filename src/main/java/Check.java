import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Check implements ActionListener{

	private JTextField text1;
	private JTextField text2;
	private JLabel text3;
	private JComboBox combo;
	private List<Utilizator> list1=new ArrayList<>();
	
	public Check(JTextField text1, JTextField text2, JLabel text3, JComboBox combo,  List<Utilizator> list1) {
		this.text1=text1;
		this.text2=text2;
		this.text3=text3;
		this.combo=combo;
		this.list1=list1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int check=0;
		Utilizator util=null;
		for(Utilizator u: list1) {
			if(u.getNume().equals(text1.getText()) && (u.getVarsta()+"").equals(text2.getText())
					&& u.getOcupatie().equals(combo.getSelectedItem().toString())){
				check=1;
				util=u;
				break;
			}
		}
		if(check==1) {
			if(util instanceof Doctor) {
				text3.setText("1");
			}
			else if(util instanceof Profesor) {
				text3.setText("2");
			}
			else if(util instanceof Elev) {
				text3.setText("3");
			}
			else {
				text3.setText("");
			}
		}
		
	}
	
	
}
