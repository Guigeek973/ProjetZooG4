package animaux;

import java.util.ArrayList;
import java.util.List;

public class Requin extends AnimalNageant implements IMammifere {

	public Requin(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super(nomEspece, sex, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		super.manger();
		System.out.println(this.getClass().getSimpleName() + " arrache le morceau de poisson donné !");
	}
	@Override
	public void crier() {
		System.out.println(this.getClass().getSimpleName() + " sort de l'eau et pousse un cri !");
	}

	@Override
	public List<Animal> mettreBas() {
		List<Animal> list = new ArrayList<Animal>();
		return list;	
	}

	@Override
	public void nager() {
		System.out.println(this.getClass().getSimpleName() + "  nage à la recherche de quelque chose à manger...");
	}

}
