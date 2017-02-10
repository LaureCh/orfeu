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


	public Accumulateur getAcc() {
		return acc;
	}


	public void setAcc(Accumulateur acc) {
		this.acc = acc;
	}


	public CompteurOrdinal getCo() {
		return co;
	}


	public void setCo(CompteurOrdinal co) {
		this.co = co;
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
