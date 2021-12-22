package main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class MyList extends JFrame {
	
	MyThread mt;
	MyDataBase mdb;
	String entete[]= {"ID","Nom","Genre"};
	DefaultTableModel model= new DefaultTableModel(entete,0);
	JTable tab = new JTable(model);
	JScrollPane sp = new JScrollPane(tab);
	Canvas cv=new Canvas();
	
	public MyList() {
		super("Examen");
		setSize(600,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mdb=new MyDataBase("jdbc:mysql://localhost/examen","root","");
		mt=new MyThread(this);
	      mt.start();
		Container C=getContentPane();
		C.setLayout(new BorderLayout());
        C.add("Center",sp);
        C.add("South",cv);
        mdb.remplirTab(model);
        sp.setBorder(BorderFactory.createTitledBorder("Liste des utilisateurs"));
        
        
    	setVisible(true);
	}

	private MyThread MyThread(MyList myList) {
		// TODO Auto-generated method stub
		return null;
	}

}
