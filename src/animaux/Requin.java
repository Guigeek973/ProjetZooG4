package animaux;

public class Requin extends Animal implements INageant, IMammifere {

	public Requin(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		System.out.println("Le requin d�chire la chair de poisson donn�e.");
	}

	@Override
	protected void crier() {
		System.out.println("Le requin sort de l'eau et pousse un cri !");
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
