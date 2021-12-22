package main;

import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {
	
	JLabel examenL=new JLabel("Examen");
	JLabel nomL=new JLabel("Nom");
	JTextField nomT=new JTextField();
	JLabel genreL=new JLabel("Genre");
	JRadioButton op1=new JRadioButton("Homme",true);
	JRadioButton op2=new JRadioButton("Femme");
	ButtonGroup bg=new ButtonGroup();
	JButton listBtn=new JButton("List");
	JButton ajouterBtn=new JButton("Ajouter");
	MyEvents evt= new MyEvents(this);
	
    public MyForm(){
		
		super("Examen");
		setSize(600,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel Poption=new JPanel(new GridLayout(1,2));
		Poption.add(op1);
		Poption.add(op2);
		
		JPanel PInfo=new JPanel(new GridLayout(2,2));
		PInfo.add(nomL);
		PInfo.add(nomT);
		PInfo.add(genreL);
		PInfo.add(Poption);
		
		JPanel Pbtn=new JPanel(new GridLayout(1,2));
		Pbtn.add(listBtn);
		Pbtn.add(ajouterBtn);
		
		JPanel Psouth=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		Psouth.add(Pbtn);
	    
	    Container C=getContentPane();
	    C.setLayout(new BorderLayout());
	    C.add("North",examenL);
        C.add("Center",PInfo);
        C.add("South",Psouth);
		
        bg.add(op1);
		bg.add(op2);
		op1.setActionCommand("Homme");
		op2.setActionCommand("Femme");
		
        examenL.setHorizontalAlignment(SwingConstants.CENTER);
        
		PInfo.setBorder(BorderFactory.createTitledBorder("Informations"));
		
		listBtn.addActionListener((e)->MyList());
    	ajouterBtn.addActionListener(e->evt.actionPerformed(e));
		
		setVisible(true);
		
    }
    
    public void MyList() {
    
        new MyList();
    }
    
    public static void main(String[] args) {
		
		new MyForm();


	  }

}
