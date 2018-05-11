package animaux;

public abstract class AnimalVolant extends Animal{

	public AnimalVolant(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	public void voler() {
		System.out.println(this.getClass().getSimpleName() + " vole dans la volière...");
	}
}
