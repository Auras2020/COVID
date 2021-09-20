import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elev e1=new Elev("Andrei", 20, "Elev");
		Elev e2=new Elev("Ana", 19, "Elev");
		
		Doctor d1=new Doctor("Dodo", 45, "Doctor");
		Doctor d2=new Doctor("Dridu", 75, "Doctor");
		Doctor d3=new Doctor("Marian", 35, "Doctor");
		
		Profesor p1=new Profesor("Bogdan", 73, "Profesor");
		Profesor p2=new Profesor("Bob", 43, "Profesor");
		Profesor p3=new Profesor("Matei", 83, "Profesor");
		
		Campanie campanie=new Campanie("COVID19");
		campanie.inscriere(e1);
		campanie.inscriere(e2);
		campanie.inscriere(d1);
		campanie.inscriere(d2);
		campanie.inscriere(d3);
		campanie.inscriere(p1);
		campanie.inscriere(p2);
		campanie.inscriere(p3);
		
		e1.viewUtilizatori(campanie.getEtapa1());
		d1.viewUtilizatori(campanie.getEtapa2());
		p1.viewUtilizatori(campanie.getEtapa3());
		
		JFrame frame  = new JFrame ("Campanie");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(700, 700);
	    frame.setBackground(Color.GRAY);
	    
	    JPanel panel1 = new JPanel(); 
	    JLabel l1=new JLabel("VACCINARE COVID");
	    panel1.add( Box.createRigidArea(new Dimension(0,20)) );
	    panel1.add(l1);
	    panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
	    
	    JPanel panel2 = new JPanel();
	    JButton but1=new JButton("INSCRIERE");
	    panel2.add( Box.createRigidArea(new Dimension(0,200)) );
	    panel2.add(but1);
	    panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
	    panel2.add( Box.createRigidArea(new Dimension(0,200)) );
	    
	    JPanel panel3 = new JPanel();
	    JLabel l2=new JLabel("ETAPA");
	    JTextField text=new JTextField();
	    JButton but2=new JButton("VEZI PACIENTI");
	    panel3.add( Box.createRigidArea(new Dimension(100,0)) );
	    panel3.add(l2);
	    panel3.add( Box.createRigidArea(new Dimension(100,0)) );
	    panel3.add(text);
	    panel3.add( Box.createRigidArea(new Dimension(100,0)) );
	    panel3.add(but2);
	    panel3.add( Box.createRigidArea(new Dimension(100,0)) );
	    panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
	    
	    JFrame frame1  = new JFrame ("Inscriere campanie");
	    //frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame1.setSize(700, 700);
	    frame1.setBackground(Color.GRAY);
	    JPanel pan = new JPanel();
	    
	    JPanel pan1 = new JPanel();
	    JLabel lab1=new JLabel("Inscriere proces de vaccinare COVID");
	    pan1.add( Box.createRigidArea(new Dimension(0,30)) );
	    pan1.add(lab1);
	    pan1.add( Box.createRigidArea(new Dimension(0,100)) );
	    pan1.setLayout(new BoxLayout(pan1, BoxLayout.Y_AXIS));
	    
	    JPanel pan2 = new JPanel();
	    JLabel lab2=new JLabel("Nume");
	    JTextField t1=new JTextField();
	    pan2.add( Box.createRigidArea(new Dimension(50,0)) );
	    pan2.add(lab2);
	    pan2.add( Box.createRigidArea(new Dimension(50,0)) );
	    pan2.add(t1);
	    pan2.add( Box.createRigidArea(new Dimension(370,0)) );
	    pan2.setLayout(new BoxLayout(pan2, BoxLayout.X_AXIS));
	    pan2.add( Box.createRigidArea(new Dimension(0,0)) );
	    
	    JPanel pan3 = new JPanel();
	    JLabel lab3=new JLabel("Varsta");
	    JTextField t2=new JTextField();
	    pan3.add( Box.createRigidArea(new Dimension(50,0)) );
	    pan3.add(lab3);
	    pan3.add( Box.createRigidArea(new Dimension(50,0)) );
	    pan3.add(t2);
	    pan3.add( Box.createRigidArea(new Dimension(150,0)) );
	    JButton b1=new JButton("Verifica Etapa");
	    pan3.add( Box.createRigidArea(new Dimension(70,0)) );
	    pan3.add(b1);
	    pan3.add( Box.createRigidArea(new Dimension(50,0)) );
	    pan3.setLayout(new BoxLayout(pan3, BoxLayout.X_AXIS));
	    
	    JPanel pan4=new JPanel();
	    JLabel lab5=new JLabel("Etapa");
	    JLabel t3=new JLabel();
	    pan4.add( Box.createRigidArea(new Dimension(500,0)) );
	    pan4.add(lab5);
	    pan4.add( Box.createRigidArea(new Dimension(20,0)) );
	    pan4.add(t3);
	    pan4.add( Box.createRigidArea(new Dimension(80,0)) );
	    pan4.setLayout(new BoxLayout(pan4, BoxLayout.X_AXIS));
	    pan4.add( Box.createRigidArea(new Dimension(0,10)) );
	    
	    JPanel pan5 = new JPanel();
	    JLabel lab4=new JLabel("Ocupatie");
	    JComboBox jcombo=new JComboBox(new String[] {"Doctor", "Profesor", "Elev"});
	    pan5.add( Box.createRigidArea(new Dimension(50,0)) );
	    pan5.add(lab4);
	    pan5.add( Box.createRigidArea(new Dimension(50,0)) );
	    pan5.add(jcombo);
	    pan5.add( Box.createRigidArea(new Dimension(300,0)) );
	    pan5.setLayout(new BoxLayout(pan5, BoxLayout.X_AXIS));
	    pan5.add( Box.createRigidArea(new Dimension(0,100)) );
	    
	    pan.add(pan1);
	    pan.add(pan2);
	    pan.add(pan3);
	    pan.add(pan4);
	    pan.add(pan5);
	    pan.add( Box.createRigidArea(new Dimension(0,100)) );
	    JButton b2=new JButton("INSCRIERE");
	    pan.add(b2);
	    pan.add( Box.createRigidArea(new Dimension(0,50)) );
	    pan.setLayout(new BoxLayout(pan, BoxLayout.Y_AXIS));
	    
	    but1.addActionListener(new Formular(frame1, pan));
	    List<Utilizator> list=new ArrayList<>();
	    list.add(e1);
	    list.add(e2);
	    list.add(d1);
	    list.add(d2);
	    list.add(d3);
	    list.add(p1);
	    list.add(p2);
	    list.add(p3);
	    List<Utilizator> list1=new ArrayList<>();
	    List<Utilizator> list2=new ArrayList<>();
	    List<Utilizator> list3=new ArrayList<>();
	    
	    b2.addActionListener(new Inscriere(t1, t2, jcombo, list, list1, list2, list3));
	    but2.addActionListener(new Pacienti(list1, list2, list3, text, frame));
	    b1.addActionListener(new Check(t1, t2, t3, jcombo, list));
	    
	    JPanel panel = new JPanel();
	    panel.add(panel1);
	    panel.add(panel2);
	    panel.add(panel3);
	    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	    panel.add( Box.createRigidArea(new Dimension(0,170)) );
	    
	    frame.setContentPane(panel);
	    frame.setVisible(true);
	    
	}

}
