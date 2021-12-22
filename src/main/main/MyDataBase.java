package main;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class MyDataBase {
	
	private String url;
	private String mp;
	private String session;

	public MyDataBase(String url,String session,String mp)
	{
	this.mp=mp;
	this.session=session;
	this.url=url;

	}
	
	public Connection Connexion() { 
	  
		try {
	        
		    Class.forName("com.mysql.jdbc.Driver");
	        return DriverManager.getConnection(url, session, mp);
	        
	       }catch(Exception e) {e.printStackTrace();}


	     return null;
	}

	

	ResultSet select(String reqSql) {
		
	    try {
	           Statement stm =Connexion().createStatement();
	           return stm.executeQuery(reqSql);
	     }catch(Exception e) {e.printStackTrace();}

	     return null; 

	}
	
	int ajouter(Personne P) {
		String reqSql="INSERT INTO `utilisateurs`( `NOM`, `GENRE`) VALUES ('"+P.getNom()+"','"+P.getGenre()+"');";
		try {
			Statement stm =Connexion().createStatement();
			return stm.executeUpdate(reqSql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return -1 ;
		}
		
		
		
	}
	
	void remplirTab (DefaultTableModel model){
		model.setRowCount(0);
	    try {
	           ResultSet res =select("SELECT `ID`, `NOM`, `GENRE` FROM `utilisateurs` ;");
	            while (res.next()) {
	            	model.addRow(new Object[] {res.getInt(1),res.getString(2),res.getString(3)});
	            }
	    }catch(Exception e) {e.printStackTrace();}
	}

}
