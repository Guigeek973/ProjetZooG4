package animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animaux.Animal.Sexe;

public class Baleine extends AnimalNageant implements IMammifere{

	public Baleine(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " avale des tonnes de planctons !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " chante !");
	}

	@Override
	public void mettreBas() {
		Random rand = new Random();
		List<Animal> list = new ArrayList<Animal>();
		int nbEnfants = 0;
		int nbRandomChild = rand.nextInt(this.getNbEnfantsMax()-1)+1;
		if (this.getSexe() == Sexe.Femelle) {
			while(nbEnfants < nbRandomChild) {
				nbEnfants += 1;
				int nbRandomSexe = rand.nextInt(2 - 1 + 1) + 1;
				if (nbRandomSexe == 2)
					this.getEnclos().addAnimal((Animal) new Baleine(this.getNomEspece(), Sexe.Male, 100, 10, 0));
				else if (nbRandomSexe == 1)
					this.getEnclos().addAnimal((Animal)new Baleine(this.getNomEspece(), Sexe.Femelle, 100, 10, 0));
			}
		}	
	}

	@Override
	public void nager() {
		System.out.println(this.getClass().getSimpleName() + " nage lentement...");
	}

}

