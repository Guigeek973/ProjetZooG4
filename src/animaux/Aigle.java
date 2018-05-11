package animaux;

import java.util.ArrayList;
import java.util.List;

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
		Animal a1 = new Aigle(this.getNomEspece(), Sexe.Male, 100, 10, 0);
		Animal a2 = new Aigle(this.getNomEspece(), Sexe.Femelle, 100, 10, 0);
		list.add(a1);
		list.add(a2);
		return list;
	}

}
