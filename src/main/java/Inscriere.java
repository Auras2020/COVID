import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Inscriere implements ActionListener{

	private JTextField text1;
	private JTextField text2;
	private JComboBox combo;
	private List<Utilizator> list=new ArrayList<>();
	private List<Utilizator> list1=new ArrayList<>();
	private List<Utilizator> list2=new ArrayList<>();
	private List<Utilizator> list3=new ArrayList<>();
	
	public Inscriere(JTextField text1, JTextField text2, JComboBox combo, List<Utilizator> list, 
			List<Utilizator> list1, List<Utilizator> list2, List<Utilizator> list3) {
		this.text1=text1;
		this.text2=text2;
		this.combo=combo;
		this.list=list;
		this.list1=list1;
		this.list2=list2;
		this.list3=list3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int check=0;
		Utilizator util=null;
		for(Utilizator u: list) {
			if(u.getNume().equals(text1.getText()) && (u.getVarsta()+"").equals(text2.getText())
					&& u.getOcupatie().equals(combo.getSelectedItem().toString())){
				if(u instanceof Doctor) {
					check=1;
				    util=u;
				    break;
				}
				if(u instanceof Profesor) {
					check=2;
				    util=u;
				    break;
				}
				if(u instanceof Elev) {
					check=3;
				    util=u;
				    break;
				}
			}
		}
		if(check==1) {
			list1.add(util);
		}
		else if(check==2) {
			list2.add(util);
		}
		else if(check==3) {
			list3.add(util);
		}
		
	}
	
	
}
