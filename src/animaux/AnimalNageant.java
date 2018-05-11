package animaux;

public abstract class AnimalNageant extends Animal {
	public AnimalNageant(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	public void nager() {
		System.out.println(this.getClass().getSimpleName() + " nage...");
	}
}
