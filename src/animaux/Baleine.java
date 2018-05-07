package animaux;

public class Baleine extends Animal implements INageant, IMammifere{

	public Baleine(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
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

