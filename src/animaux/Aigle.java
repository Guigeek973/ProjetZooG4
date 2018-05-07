package animaux;

public class Aigle extends Animal implements IVolant, IOvipare {

	public Aigle(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
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
