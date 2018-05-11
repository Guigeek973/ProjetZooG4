package animaux;

public abstract class AnimalTerrestre extends Animal{
	public AnimalTerrestre(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	public void vagabonder() {
		System.out.println(this.getClass().getSimpleName() + " vagabonde dans l'enclos...");
	}
}
