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
import enclos.EnclosStock;
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
		
		Aquarium aquarium = new Aquarium("Grand Aquarium", 250, 10, 15, 4);
		Voliere voliere=  new Voliere("Voliere à Aigles", 50, 10, 15);
		EnclosStandard enclos = new EnclosStandard("Enclos des prédateurs", 100, 10);
		Aquarium aquarium1 = new Aquarium("Petit Aquarium", 250, 10, 15, 4);
		Voliere voliere1=  new Voliere("Voliere à perruche", 50, 10, 15);
		EnclosStandard enclos1 = new EnclosStandard("Enclos des petits prédateurs", 100, 10);
		Aquarium aquarium2 = new Aquarium("Aquarium de stockage", 250, 10, 15, 4);
		Voliere voliere2=  new Voliere("Voliere de stockage", 50, 10, 15);
		EnclosStandard enclos2 = new EnclosStandard("Enclos terrestre de stockage", 100, 10);
		
		enclos.addAnimal(l1);
		enclos.addAnimal(l2);
		enclos.addAnimal(l2);
		enclos.addAnimal(o1);
		enclos.addAnimal(o1);
		enclos.addAnimal(o2);
		enclos.addAnimal(o2);
		enclos.addAnimal(t1);
		enclos.addAnimal(t2);
		enclos.addAnimal(t2);

		
		enclos1.addAnimal(l1);
		enclos1.addAnimal(l2);
		enclos1.addAnimal(o1);
		enclos1.addAnimal(o2);
		enclos1.addAnimal(t1);
		enclos1.addAnimal(t2);
		
		aquarium.addAnimal(p1);
		aquarium.addAnimal(p2);
		aquarium.addAnimal(p1);
		aquarium.addAnimal(p2);
		aquarium.addAnimal(po1);
		aquarium.addAnimal(po2);
		aquarium.addAnimal(b1);
		aquarium.addAnimal(b2);
		aquarium.addAnimal(r1);
		aquarium.addAnimal(r2);
		
		aquarium1.addAnimal(p1);
		aquarium1.addAnimal(p2);
		aquarium1.addAnimal(po1);
		aquarium1.addAnimal(po2);
		
		voliere.addAnimal(a1);
		voliere.addAnimal(a2);
		voliere.addAnimal(a1);
		voliere.addAnimal(a2);
		
		voliere1.addAnimal(a1);
		voliere1.addAnimal(a2);
		
		List<Enclos<? extends Animal>> listE= new ArrayList<Enclos<? extends Animal>>();
		listE.add(aquarium);
		listE.add(voliere);
		listE.add(enclos);
		listE.add(aquarium1);
		listE.add(voliere1);
		listE.add(enclos1);
		listE.add(enclos2);
		listE.add(aquarium2);
		listE.add(voliere2);
		Employe employe = new Employe("Bob", SexeEmp.Male, 32);
		Zoo zoo = new Zoo("Zootopia", employe, 5, 3, listE);
		
		while (true) {
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
			
			while (nbAction < 3) {
				nbAction += 1;
				zoo.donnerLaMain();
			}
		}	
	}
	
	
}
