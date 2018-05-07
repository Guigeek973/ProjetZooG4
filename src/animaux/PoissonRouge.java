package animaux;

public class PoissonRouge extends Animal implements INageant, IOvipare{

	public PoissonRouge(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		System.out.println("Le poisson rouge mange.");
		
	}

	@Override
	protected void crier() {
		System.out.println("Le poisson rouge pousse un petit cri...");
	}

	@Override
	public void pondre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nager() {
		// TODO Auto-generated method stub
		
	}

}
