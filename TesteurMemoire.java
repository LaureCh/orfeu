class TesteurMemoire extends Testeur{
    
    public static void main(String args[]){
	int taille=512;
	Memoire mem=new Memoire(taille);
	

	int adresse=5;
	int valeur=23;
	mem.setOctet(adresse,valeur);
	tester(mem.getOctet(5)==23); // La machine écrit la valeur 5 à l'adresse 23. Donc ça doit retourner 23.
	
	adresse=1;// "en octet"
	valeur=1005;
	mem.setMot(adresse,valeur);
	if (mem.getMot(1)==1005)
	    System.out.println("OK");
	else
	    System.out.println("ECHEC");
	
    }
	
	
}
