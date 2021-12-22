package main;

import java.awt.event.*;

import javax.swing.JOptionPane;

public class MyEvents implements ActionListener {
	
	MyList ml;
	MyForm mf;
	MyDataBase mdb;
	
	public MyEvents(MyForm mf) {
		
		this.mf=mf;
		mdb=new MyDataBase("jdbc:mysql://localhost/examen","root","");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object btn=e.getSource();
		
		if(btn==mf.ajouterBtn) {
		    mdb.ajouter(new Personne(mf.nomT.getText(), mf.bg.getSelection().getActionCommand()));
		   JOptionPane.showMessageDialog(null, "utulisateur ajoutée avec succes!");
		}
		

     }

}
