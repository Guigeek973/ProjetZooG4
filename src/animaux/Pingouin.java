package animaux;

public class Pingouin extends Animal implements INageant, IOvipare{

	public Pingouin(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
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
