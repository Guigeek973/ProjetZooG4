package animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animaux.Animal.Sexe;

public class Tigre extends AnimalTerrestre implements IMammifere{

	public Tigre(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		this.setNbEnfantsMax(5);
	}
	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " arrache des morceaux de viande de son repas !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " rugit !");
	}
	
	@Override
	public void mettreBas() {
		List<Animal> list = new ArrayList<Animal>();
		Random rand = new Random();
		int nbEnfants = 0;
		// Si c'est une femelle
		if (this.getSexe() == Sexe.Femelle) {
			// On fait des enfants jusqu'au max al�atoire
			while(nbEnfants < rand.nextInt(this.getNbEnfantsMax()-1)+1) {
				nbEnfants += 1; // Un enfant est ajout�
				
				// Randomization du sexe du nouveau n�
				int nbRandom = rand.nextInt(2 - 1 + 1) + 1;
				if (nbRandom == 2)
					this.getEnclos().addAnimal(new Aigle(this.getNomEspece(), Sexe.Male, 100, 10, 0));
				else if (nbRandom == 1)
					this.getEnclos().addAnimal(new Aigle(this.getNomEspece(), Sexe.Femelle, 100, 10, 0));
			}
		}
	}

	@Override
	public void vagabonder() {
		System.out.println(this.getClass().getSimpleName() + " se prom�ne des les arbres...");
	}
}