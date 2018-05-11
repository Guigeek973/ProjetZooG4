package animaux;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println(this.getClass().getSimpleName() + " se promène.");
	}

	@Override
	public List<Animal> mettreBas() {
		List<Animal> list = new ArrayList<Animal>();
		return list;	
	}

}
