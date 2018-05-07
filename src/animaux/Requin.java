package animaux;

public class Requin extends Animal implements INageant, IMammifere {

	public Requin(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		System.out.println("Le requin déchire la chair de poisson donnée.");
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
