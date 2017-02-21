public class Accumulateur {
    private int valeur;
    private boolean nonSignificatif; // ???
	
    public Accumulateur(){ //constructeur
	valeur=0;
	nonSignificatif=true;
    }

    public int getValeur() {
	return valeur;
    }

    public void setValeur(int valeur) {
    	this.valeur = valeur;
    	if(nonSignificatif==true)
    		nonSignificatif=false;
    }
}
