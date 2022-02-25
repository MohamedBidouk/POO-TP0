package tp0;

public class Fiscalité {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double min = 0;	
	int j = 0;
	personne p1 = new personne(12962355,"Bidouk","Modamed");
	personne p2 = new personne(12962353,"Bidouk","Aissa");
	personne p3 = new personne(12962397,"Bidouk","Mohsen");
	
	propriété[] tabP = new propriété[5] ;
	
	tabP[0] = new propriétéprivé(p1,"Corniche",350,4,false);
	tabP[1] = new propriétéprivé(p2,"Ain Mariem", 400,6,false);
	tabP[2] = new propriétéprivé(p2,"Bhira",1200,8, true);
	tabP[3] = new propriétéProfessionelle(p3,"Zarzouna", 1000, 50,true);
	tabP[4] = new propriétéProfessionelle(p1,"Menzel Bourguiba",2500, 400, false);
	
	double[] impot = new double[5];
	for (int i=0; i<5; i++) {
		System.out.println(tabP[i]+"\n L'impot à payer à cette propriété est : "+tabP[i].calculImpot()+"\n");
		impot[i] = tabP[i].calculImpot();
		}
	for (int i = 0; i<5; i++) {
		if(min < impot[i]) {
			min = impot[i];
			j = i;
			}
		}
	System.out.println("The minimum impot is: "+tabP[j].calculImpot()+" dt for "+tabP[j].address+"for "+tabP[j].responsable);
	}
}
	

