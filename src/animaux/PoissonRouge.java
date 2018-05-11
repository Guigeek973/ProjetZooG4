package animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	public void pondre() {
		
	}

	@Override
	public void nager() {
		System.out.println(this.getClass().getSimpleName() + " nage très lenetement");
	}

}
