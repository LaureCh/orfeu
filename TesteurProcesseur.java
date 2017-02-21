class TesteurProcesseur extends Testeur{
    
    public static void main(){
    	Processeur p=new Processeur(512);
    	p.setACC(0);
    	tester(p.getACC()==0);
    }
}
