package animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animaux.Animal.Sexe;

public class Requin extends AnimalNageant implements IMammifere {

	public Requin(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " arrache le morceau de poisson donn� !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " sort de l'eau et pousse un cri !");
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
					this.getEnclos().addAnimal(new Requin(this.getNomEspece(), Sexe.Male, 100, 10, 0));
				else if (nbRandom == 1)
					this.getEnclos().addAnimal(new Requin(this.getNomEspece(), Sexe.Femelle, 100, 10, 0));
			}
		}	
	}

	@Override
	public void nager() {
		System.out.println(this.getClass().getSimpleName() + "  nage � la recherche de quelque chose � manger...");
	}

}
