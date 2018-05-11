package main;
import java.util.ArrayList;
import java.util.List;

import animaux.*;
import animaux.Animal.Sexe;
import employe.Employe;
import employe.Employe.SexeEmp;
import enclos.Aquarium;
import enclos.Enclos;
import enclos.EnclosStandard;
import enclos.Voliere;
import zoo.Zoo;

public class main {

	public static void main(String[] args) {
		Tigre t1 = new Tigre("Tigre blanc", Sexe.Male, 400, 3, 0);
		Tigre t2 = new Tigre("Tigre blanc", Sexe.Femelle, 400, 3, 0);
		Loup l1 = new Loup("Loup gris", Sexe.Male, 100, 100, 0);
		Loup l2 = new Loup("Loup gris", Sexe.Femelle, 100, 100, 0);
		Ours o1 = new Ours("Ours gris", Sexe.Male, 100, 100, 0);
		Ours o2 = new Ours("Ours gris", Sexe.Femelle, 100, 100, 0);
		Pingouin p1 = new Pingouin("Pingouin arctique", Sexe.Male, 100, 100, 0);
		Pingouin p2 = new Pingouin("Pingouin arctique", Sexe.Femelle, 100, 100, 0);
		PoissonRouge po1 = new PoissonRouge("Poisson rouge rare", Sexe.Male, 100, 100, 0);
		PoissonRouge po2 = new PoissonRouge("Poisson rouge rare", Sexe.Femelle, 100, 100, 0);
		Baleine b1 = new Baleine("Baleine bleue", Sexe.Male, 30000, 350, 0);
		Baleine b2 = new Baleine("Baleine bleue", Sexe.Femelle, 3000, 350, 0);
		Requin r1 = new Requin("Requin blanc", Sexe.Male, 400, 3, 0);
		Requin r2 = new Requin("Requin blanc", Sexe.Femelle, 400, 3, 0);
		Aigle a1 = new Aigle("Aigle royal", Sexe.Male, 100, 10, 0);
		Aigle a2 = new Aigle("Aigle royal", Sexe.Femelle, 100, 10, 0);
		
		List<AnimalTerrestre> listT = new ArrayList<AnimalTerrestre>();
		List<AnimalNageant> listN = new ArrayList<AnimalNageant>();
		List<AnimalVolant> listV= new ArrayList<AnimalVolant>();
		listT.add(l1);
		listT.add(l2);
		listT.add(o1);
		listT.add(o2);
		listT.add(t1);
		listT.add(t2);
		listN.add(p1);
		listN.add(p2);
		listN.add(po1);
		listN.add(po2);
		listN.add(b1);
		listN.add(b2);
		listN.add(r1);
		listN.add(r2);
		listV.add(a1);
		listV.add(a2);
		Aquarium aquarium = new Aquarium("Grand Aquarium", 250, 10, 15, 4, listN);
		Voliere voliere=  new Voliere("Voliere à Aigles", 50, 10, 15, listV);
		EnclosStandard enclos = new EnclosStandard("Enclos des prédateurs", 100, 10, listT);
		List<Enclos<?>> listE= new ArrayList<Enclos<?>>();
		listE.add(aquarium);
		listE.add(voliere);
		listE.add(enclos);
		Employe employe = new Employe("Bob", SexeEmp.Male, 32);
		Zoo zoo = new Zoo("Zootopia", employe, 5, 3, listE);
		
		int nbAction = 0;
		int nbActionZoo = 0;
			while (nbActionZoo < 1) {
				nbActionZoo += 1;
				System.out.println("Modification aléatoire des animaux et enclos par le Zoo...");
				System.out.println("Modification animaux...");
				zoo.modifierEtatAnimaux();
				//Les animaux perdent 30 de faim tous les jours
				for (Animal animal : zoo.getAnimauxAllEnclos()) {
					animal.baisserFaim();
				}
				System.out.println("Modification enclos...");
				zoo.modifierEtatEnclos();
			}
			while (nbAction < 4) {
				nbAction += 1;
				zoo.donnerLaMain();
			}
	}
	
	
}
