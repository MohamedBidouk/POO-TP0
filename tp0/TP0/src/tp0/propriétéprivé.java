package tp0;

public class propri�t�priv� extends propri�t�{
	protected int nbpi�ces;
	protected boolean avecPiscine;
	public int getNbpi�ces() {
		return nbpi�ces;
	}
	public void setNbpi�ces(int nbpi�ces) {
		this.nbpi�ces = nbpi�ces;
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
			return x*s + nbpi�ces*10 + 200;
		}else
		return x*s + nbpi�ces*10;
	}
	public propri�t�priv�(personne responsable, String address, double surface, int nbpi�ces, boolean avecPiscine) {
		super(responsable, address, surface);
		this.nbpi�ces = nbpi�ces;
		this.avecPiscine = avecPiscine;
	}
	@Override
	public String toString() {
		if (avecPiscine) {
		return "This private property with: " + nbpi�ces + " with picsine" + "of " + responsable
				+ " in " + address + "with surface " + surface + " will pay this impot " + calculImpot();
	}
		else {
			return "This private property with: " + nbpi�ces + " without picsine" + " of " + responsable
					+ " in " + address + "with surface " + surface + " will pay this impot " + calculImpot();
		}
	}
		
}
