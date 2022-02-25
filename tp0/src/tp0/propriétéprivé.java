package tp0;

public class propriétéprivé extends propriété{
	protected int nbpièces;
	protected boolean avecPiscine;
	public int getNbpièces() {
		return nbpièces;
	}
	public void setNbpièces(int nbpièces) {
		this.nbpièces = nbpièces;
	}
	public boolean isAvecPiscine() {
		return avecPiscine;
	}
	public void setAvecPiscine(boolean avecPiscine) {
		this.avecPiscine = avecPiscine;
	}
	@Override public double calculImpot(){
		int x = 50;
		double s = surface/100;
		if (avecPiscine) {
			return x*s + nbpièces*10 + 200;
		}else
		return x*s + nbpièces*10;
	}
	public propriétéprivé(personne responsable, String address, double surface, int nbpièces, boolean avecPiscine) {
		super(responsable, address, surface);
		this.nbpièces = nbpièces;
		this.avecPiscine = avecPiscine;
	}
	@Override
	public String toString() {
		if (avecPiscine) {
		return "This private property with: " + nbpièces + " with picsine" + "of " + responsable
				+ " in " + address + "with surface " + surface + " will pay this impot " + calculImpot();
	}
		else {
			return "This private property with: " + nbpièces + " without picsine" + " of " + responsable
					+ " in " + address + "with surface " + surface + " will pay this impot " + calculImpot();
		}
	}
		
}
