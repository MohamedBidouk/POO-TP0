package tp0;

public class propri�t� {

	protected personne responsable;
	protected String address;
	protected double surface;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	public double calculImpot() {
		return 0;
	}
	public propri�t�(personne responsable, String address, double surface) {
		this.responsable = responsable;
		this.address = address;
		this.surface = surface;
	}
	@Override
	public String toString() {
		return "The responsable of this property is: " + responsable + "in " + address + "with suface" + surface;
	}
	
	
	
	
}
