package animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animaux.Animal.Sexe;

public class Ours extends AnimalTerrestre implements IMammifere{

	public Ours(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " arrache la viande de vos mains !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " grogne !");
	}
	@Override
	public void vagabonder() {
		System.out.println(this.getClass().getSimpleName() + " se prom�ne.");
	}

	@Override
	public void mettreBas() {
		Random rand = new Random();
		List<Animal> list = new ArrayList<Animal>();
		int nbEnfants = 0;
		if (this.getSexe() == Sexe.Femelle) {
			while(nbEnfants < rand.nextInt(this.getNbEnfantsMax()-1)+1) {
				nbEnfants += 1;
				int nbRandom = rand.nextInt(2 - 1 + 1) + 1;
				if (nbRandom == 2)
					this.getEnclos().addAnimal(new Ours(this.getNomEspece(), Sexe.Male, 100, 10, 0));
				else if (nbRandom == 1)
					this.getEnclos().addAnimal(new Ours(this.getNomEspece(), Sexe.Femelle, 100, 10, 0));
			}
		}
	}

}
