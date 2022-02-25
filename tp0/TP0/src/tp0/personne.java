package tp0;

public class personne {
	protected int cin;
	protected String nom;
	protected String prenom;
	
	public personne(int c, String n, String p) {
		this.cin = c;
		this.nom = n;
		this.prenom = p;
	}
	
	public int getCin() {
		return cin;
	}
	public void setCin(int newCin) {
		this.cin=newCin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String newNom) {
		this.nom=newNom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String newPrenom) {
		this.prenom=newPrenom;
	}
	public String toString() {
		return this.prenom+" "+this.nom+"\n His CIN is : "+this.cin;
	}
}
