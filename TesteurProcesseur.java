class TesteurProcesseur extends Testeur{
    
    public static void main(){
    	Processeur p=new Processeur();
    	p.setACC(0);
    	tester(p.getACC()==0);
    }
}
