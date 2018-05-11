package animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aigle extends AnimalVolant implements IOvipare {

	public Aigle(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " picore avec envie !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " glatit !");
	}
	@Override
	public void voler() {
		System.out.println(this.getClass().getSimpleName() + " vole le plus haut possible !");
	}

	@Override
	public List<Animal> pondre() {
		List<Animal> list = new ArrayList<Animal>();
		int nbEnfants = 0;
		if (this.getSexe() == Sexe.Femelle) {
			while(nbEnfants < this.getNbEnfantsMax()) {
				nbEnfants += 1;
				Random rand = new Random();
				int nbRandom = rand.nextInt(2 - 1 + 1) + 1;
				if (nbRandom == 2)
					list.add(new Aigle(this.getNomEspece(), Sexe.Male, 100, 10, 0));
				else if (nbRandom == 1)
					list.add(new Aigle(this.getNomEspece(), Sexe.Femelle, 100, 10, 0));
			}
		}
		return list;
	}

}
