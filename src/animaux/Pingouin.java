package animaux;

import java.util.ArrayList;
import java.util.List;

import animaux.Animal.Sexe;

public class Pingouin extends AnimalNageant implements IOvipare{

	public Pingouin(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " engloutit le poisson !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " jabote !");
	}

	@Override
	public List<Animal> pondre() {
		List<Animal> list = new ArrayList<Animal>();
		Animal a1 = new Pingouin(this.getNomEspece(), Sexe.Male, 100, 10, 0);
		Animal a2 = new Pingouin(this.getNomEspece(), Sexe.Femelle, 100, 10, 0);
		list.add(a1);
		list.add(a2);
		return list;	
	}

	@Override
	public void nager() {
		System.out.println(this.getClass().getSimpleName() + " nage très vite !");
	}


}
