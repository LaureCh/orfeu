public class RegistreInstruction {
	private MotMemoire mmRI;
	private boolean nonSignificatif;
	
	
	public RegistreInstruction(){
		mmRI = new MotMemoire();
		nonSignificatif = true;
	}


	public MotMemoire getMmRI() {
		return mmRI;
	}

	public void setMmRI(MotMemoire mmRI) {
		this.mmRI = mmRI;
	}
}
