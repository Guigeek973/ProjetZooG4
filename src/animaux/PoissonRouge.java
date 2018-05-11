package animaux;

import java.util.ArrayList;
import java.util.List;

import animaux.Animal.Sexe;

public class PoissonRouge extends AnimalNageant implements IOvipare{

	public PoissonRouge(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
	}

	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " va à la surface pour manger !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " semble émettre un bruit...");
	}

	@Override
	public List<Animal> pondre() {
		List<Animal> list = new ArrayList<Animal>();
		Animal a1 = new PoissonRouge(this.getNomEspece(), Sexe.Male, 100, 10, 0);
		Animal a2 = new PoissonRouge(this.getNomEspece(), Sexe.Femelle, 100, 10, 0);
		list.add(a1);
		list.add(a2);
		return list;
	}

	@Override
	public void nager() {
		System.out.println(this.getClass().getSimpleName() + " nage très lenetement");
	}

}
