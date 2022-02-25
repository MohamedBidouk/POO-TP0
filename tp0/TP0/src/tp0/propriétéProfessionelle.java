package tp0;

public class propri�t�Professionelle extends propri�t�{
	
	protected int nbEmploy�;
	protected boolean estEtatique;
	public int getNbEmploy�() {
		return nbEmploy�;
	}
	public void setNbEmploy�(int nbE) {
		this.nbEmploy� = nbE;
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
		return x*s + nbEmploy�*30 ;
	}
	
	public propri�t�Professionelle(personne responsable, String address, double surface, int nbEmploy�,
			boolean estEtatique) {
		super(responsable, address, surface);
		this.nbEmploy� = nbEmploy�;
		this.estEtatique = estEtatique;
	}
	@Override
	public String toString() {
		if (estEtatique) {
			return "This Professional property "+" Etatique "+"with nb employees: " + nbEmploy� +" of this person "
					+ responsable + " in " + address + " with surface= " + surface + " will pay impot: " + calculImpot();
		}
		else
		return "This Professional property isn't Etatique with nb employees: " + nbEmploy� + " of this person "
				+ responsable + " in " + address + " with surface= " + surface + " will pay impot: " + calculImpot();
	}
	
}
