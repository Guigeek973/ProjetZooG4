package animaux;

public class Pingouin extends Animal implements INageant, IOvipare{

	public Pingouin(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		System.out.println("Le pingouin se jette sur les poissons données.");
		
	}

	@Override
	protected void crier() {
		System.out.println("Le pingouin pousse un cri !");
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
