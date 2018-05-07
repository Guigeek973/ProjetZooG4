package animaux;

public class Baleine extends Animal implements INageant, IMammifere{

	public Baleine(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crier() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mettreBas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nager() {
		// TODO Auto-generated method stub
		
	}

}

