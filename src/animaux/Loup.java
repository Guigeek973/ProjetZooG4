package animaux;

import java.util.ArrayList;
import java.util.List;

public class Loup extends AnimalTerrestre implements IMammifere{

	public Loup(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " dévore son repas !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " hurle !");
	}
	@Override
	public void vagabonder() {
		System.out.println(this.getClass().getSimpleName() + " vagabonde tranquillement");
	}
	
	@Override
	public List<Animal> mettreBas() {
		List<Animal> list = new ArrayList<Animal>();
		return list;	
	}
}
