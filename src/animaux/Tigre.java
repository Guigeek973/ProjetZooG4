package animaux;

import java.util.ArrayList;
import java.util.List;

public class Tigre extends AnimalTerrestre implements IMammifere{

	public Tigre(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
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
	public List<Animal> mettreBas() {
		List<Animal> list = new ArrayList<Animal>();
		return list;	
	}

	@Override
	public void vagabonder() {
		System.out.println(this.getClass().getSimpleName() + " se promène des les arbres...");
	}



}
