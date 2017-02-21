/*
Définition des méthodes setOctet, getOctet, getMot et setMot 
 */

//import java.util.Iterator;
//import java.util.Vector;

public class Memoire {

   // private Vector<MotMemoire> mots;
    private int [] tabmemoire;

// construction d'un objet de type Memoire : tableau représentant la mémoire et contenant des octets:	
    public Memoire (int taille){
    	this.tabmemoire = new int [taille];
    }

  /*  public Memoire() {
    	this.mots = new Vector<MotMemoire>();
    	//ajouter iterator
    }*/

    // méthode permettant de mettre une valeur (val) dans une case (adr) de la mémoire (tableau).
    public void setOctet(int adr, int val){
    
    	if (adr > tabmemoire.length && adr<0){
    		System.out.println("Adresse " +adr+" non valide.");
    	}

    	else {
    		tabmemoire[adr]=val;
    		System.out.println("La valeur " + val + " a été enregistrée à l'adresse de l'octet "+ adr+".\n");
    	}
    }
    // méthode permettant d'obtenir une valeur à partir de l'adresse passée en paramètre.
    public int getOctet(int i){
    	
    	if (i > tabmemoire.length && i<0){
    		System.out.println("Adresse " + i +" non valide.");
    		return -1; //à vérifier
    	}

    	else {
    		return tabmemoire[i];
    	}

    }

    /* 
       Je ne suis pas trop sur des méthodes créées ci-dessous car rien ne définit la longueur d'un mot. Donc elles fonctionnent sur la base de 1 mot = 1 octet. (Tupac)
    */


    public void setMot(int adrmot, int valmot){
   
    	if (adrmot > tabmemoire.length && adrmot<0){
    		System.out.println("Adresse " +adrmot+" non valide.");
    	}

    	else {
    		tabmemoire[adrmot]=valmot;
    		System.out.println("La valeur " + valmot + " a été enregistrée à l'adresse de l'octet "+ adrmot+".\n");
    	}
    }

    public int getMot(int casemot){
    	
    	if (casemot > tabmemoire.length && casemot<0){
    		System.out.println("Adresse " + casemot +" non valide.");
    		return -1; //à vérifier
    	}

    	else {
    		return tabmemoire[casemot];
    	}

    }

}
