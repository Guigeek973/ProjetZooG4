package animaux;

public class Aigle extends Animal implements IVolant, IOvipare {

	public Aigle(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		System.out.println("L'aigle déchiquète la viande.");
		
	}

	@Override
	public void crier() {
		System.out.println("L'aigle pousse un cri strident !");
		
	}
	
	@Override
	public void voler() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pondre() {
		// TODO Auto-generated method stub
		
	}

}
