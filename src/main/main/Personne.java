package main;

public class Personne {
	
	private String nom;
	private String genre;
	private int id;
	
	public Personne() {}
	
	public Personne(int id,String nom,String genre) {
		 this.id=id;
		 this.nom=nom;
		 this.genre=genre;
	}
	
	public Personne(String nom,String genre) {
		 this.nom=nom;
		 this.genre=genre;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	public String getGenre() {
		return this.genre;
	}

}
