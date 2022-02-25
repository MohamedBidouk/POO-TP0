package tp0;

public class propriétéProfessionelle extends propriété{
	
	protected int nbEmployé;
	protected boolean estEtatique;
	public int getNbEmployé() {
		return nbEmployé;
	}
	public void setNbEmployé(int nbE) {
		this.nbEmployé = nbE;
	}
	public boolean isEstEtatique() {
		return estEtatique;
	}
	public void setEstEtatique(boolean estEt) {
		this.estEtatique = estEt;
	}
	@Override public double calculImpot(){
		int x = 100;
		double s = surface/100;
		if (estEtatique) {
			return 0;
		}else
		return x*s + nbEmployé*30 ;
	}
	
	public propriétéProfessionelle(personne responsable, String address, double surface, int nbEmployé,
			boolean estEtatique) {
		super(responsable, address, surface);
		this.nbEmployé = nbEmployé;
		this.estEtatique = estEtatique;
	}
	@Override
	public String toString() {
		if (estEtatique) {
			return "This Professional property "+" Etatique "+"with nb employees: " + nbEmployé +" of this person "
					+ responsable + " in " + address + " with surface= " + surface + " will pay impot: " + calculImpot();
		}
		else
		return "This Professional property isn't Etatique with nb employees: " + nbEmployé + " of this person "
				+ responsable + " in " + address + " with surface= " + surface + " will pay impot: " + calculImpot();
	}
	
}
