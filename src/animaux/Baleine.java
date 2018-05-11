package animaux;

import java.util.ArrayList;
import java.util.List;

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
	public List<Animal> mettreBas() {
		List<Animal> list = new ArrayList<Animal>();
		return list;	
	}

	@Override
	public void nager() {
		System.out.println(this.getClass().getSimpleName() + " nage lentement...");
	}

}

