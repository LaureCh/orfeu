public class Processeur {
	private Accumulateur acc;
	private CompteurOrdinal co;
	private RegistreInstruction ri;
	private Memoire mem;
	
	public Processeur(){  //constructeur
		acc = new Accumulateur();
		co = new CompteurOrdinal();
		ri = new RegistreInstruction();
		mem = new Memoire();
	}


	public int getACC() {
		int valeur=acc.getValeur();		
		return valeur;
	}

	public void setACC(int i) {
		 acc.setValeur(i);;
	}


	public int getCo() {
		int indice = co.getIndice();
		return indice;
	}

	public void setCo(int i) {
		co.setIndice(i);
	}

	public RegistreInstruction getRi() {
		return ri;
	}

	public void setRi(RegistreInstruction ri) {
		this.ri = ri;
	}

	public Memoire getMem() {
		return mem;
	}

	public void setMem(Memoire mem) {
		this.mem = mem;
	}
	
	
}
