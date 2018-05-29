package zoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import animaux.Animal;
import employe.Employe;
import enclos.Aquarium;
import enclos.Aquarium.EtatA;
import enclos.Enclos;
import enclos.Enclos.EtatProprete;
import enclos.EnclosStock;
import enclos.Voliere;
import enclos.Voliere.EtatV;

public class Zoo {
	private String nom ;
	private Employe employé ;
	private int nbEnclosMax ;
	private int nbEnclos;
	private List<Enclos<?>> listEnclos;

	public Zoo(String nom, Employe employé, int nbEnclosMax, int nbEnclos, List<Enclos<?>> list) {
		super();
		this.nom = nom;
		this.employé = employé;
		this.nbEnclosMax = nbEnclosMax;
		this.nbEnclos = nbEnclos;
		this.listEnclos = list;
	}
	public List<Enclos<?>> getListEnclos() {
		return listEnclos;
	}
	public void setListEnclos(List<Enclos<?>> listEnclos) {
		this.listEnclos = listEnclos;
		
	}
	public String getNom() {
		return nom;
	}
	public Employe getEmployé() {
		return employé;
	}
	public int getNbEnclosMax() {
		return nbEnclosMax;
	}
	public int getNbEnclos() {
		return nbEnclos;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setEmployé(Employe employé) {
		this.employé = employé;
	}
	public void setNbEnclosMax(int nbEnclosMax) {
		this.nbEnclosMax = nbEnclosMax;
	}
	public void setNbEnclos(int nbEnclos) {
		this.nbEnclos = nbEnclos;
	}
	
	public int getNbAnimauxDansZoo() {
		int total = 0;
		for(Enclos<?> enclos : this.getListEnclos()) {
			total += enclos.getNbAnimauxPresents();
		}
		return total;
	}
	public List<Animal> getAnimauxAllEnclos() {
		List<Animal> list = new ArrayList<Animal>();
		for(Enclos<?> enclos : this.getListEnclos()) {
			list.addAll((Collection<? extends Animal>) enclos.getLesAnimaux());
		}
		return list;
	}
	
	public void modifierEtatAnimaux() {
		for(Enclos<?> enclos : this.getListEnclos()) {
			for(Object animal : enclos.getLesAnimaux()) {
				Animal anim = (Animal) animal;
				Random rand = new Random();
				int nbAleatoire = rand.nextInt(3 - 1 + 1) + 1;
				if (nbAleatoire == 3) {
					anim.baisserFaim();
				}
				else if (nbAleatoire == 2) {
					anim.setIndicateurSante(false);
				}
				else if (nbAleatoire == 1) {
					anim.changerEtatSommeil();
				}
			}
		}
	}
	public void modifierEtatEnclos() {
		for(Enclos<?> enclos : this.getListEnclos()) {
			Random rand = new Random();
			int nbAleatoire = rand.nextInt(3 - 1 + 1) + 1;
			if (nbAleatoire == 3) {
				if (enclos.getProprete() == EtatProprete.Correct)
					enclos.setProprete(EtatProprete.Mauvais);
				if (enclos.getProprete() == EtatProprete.Bon)
					enclos.setProprete(EtatProprete.Correct);
			}
			else if (nbAleatoire == 2) {
				if (enclos.getClass().getSimpleName() == "Aquarium") {
					Aquarium aqua = (Aquarium) enclos;
					
					if (aqua.getEtatProfondeur() == EtatA.Correct)
						aqua.setEtatProfondeur(EtatA.Mauvais);
					if (aqua.getEtatProfondeur() == EtatA.Bon)
						aqua.setEtatProfondeur(EtatA.Correct);
					
					if (aqua.getEtatSalinite() == EtatA.Correct)
						aqua.setEtatSalinite(EtatA.Mauvais);
					if (aqua.getEtatSalinite() == EtatA.Bon)
						aqua.setEtatSalinite(EtatA.Correct);
				}
			}
			else if (nbAleatoire == 1) {
				if (enclos.getClass().getSimpleName() == "Voliere") {
					Voliere vol = (Voliere) enclos;
					if (vol.getEtatToit() == EtatV.Correct)
						vol.setEtatToit(EtatV.Mauvais);
					if (vol.getEtatToit() == EtatV.Bon)
						vol.setEtatToit(EtatV.Correct);
				}
			}
		}
	}
	
	public void donnerLaMain() {
		System.out.println("------------ Menu principal ----------------");
		System.out.println("Il y a " + this.getNbEnclos() + " enclos :");
		int it = 0;
		for (Enclos<?> enclos : this.getListEnclos()) {
			it += 1;
			System.out.println(it + "." + enclos.toString());
		}
		System.out.println("Choisir l'enclos à visiter :"); 
		Scanner sc = new Scanner(System.in);
		int numEnclos = sc.nextInt();
		
		outerloop:
		while (true) {
			System.out.println("Choisir l'action à effectuer : ");
		    System.out.println("1.Examiner l'enclos et son contenu");
		    System.out.println("2.Transferer un animal");
		    System.out.println("3.Nourrir les animaux");
		    System.out.println("4.Soigner les animaux");
		    System.out.println("5.Nettoyer l'enclos");
		    System.out.println("6.Transferer tous les animaux d'un enclos de stockage");
		    System.out.println("7.Quitter l'enclos");
		    int action = sc.nextInt();
		    switch (action) {
		    	case 1 : 
		    		this.getEmployé().examinerEnclos(this.getListEnclos().get(numEnclos-1));
		    		break;
		    	case 2 : 
		    		 System.out.println("Selectionnez l'animal que vous souhaitez transférer :");
		    		 System.out.println(this.getListEnclos().get(numEnclos-1).toString());
		    		 int it1 = 0;
		    		 for (Animal a : this.getListEnclos().get(numEnclos-1).getLesAnimaux()) {
		    			 it1 += 1;
		    			 Animal animal = (Animal) a;
		    			 System.out.println(it1 + "." + animal.toString());
		    		 }
		    		 int numAnimal = sc.nextInt();
		    		 System.out.println("Selectionnez l'enclos vers lequel le transferer :");
		    		 int ite = 0;
		    		 for (Enclos<? extends Animal> enclos : this.getListEnclos()) {
		    			 	ite += 1;
		    			 	if(this.getListEnclos().get(numEnclos-1).getClass() == enclos.getClass()) {
		    			 		System.out.println(ite + "." + enclos.toString());
		    			 	}
		    			}
		    		 int numEnclosTransfert = sc.nextInt();
		    		 if (this.getListEnclos().get(numEnclos-1).getClass() == this.getListEnclos().get(numEnclosTransfert-1).getClass()) {
		    			 this.getEmployé().transférerAnimalToEnclos(this.getListEnclos().get(numEnclos-1).getLesAnimaux().get(numAnimal-1), this.getListEnclos().get(numEnclos-1), this.getListEnclos().get(numEnclosTransfert-1));
		    		 }
		    		 else {
		    			 System.out.println("Impossible l'enclos ne correspond pas pour cet animal " + "\n");
		    		 }
		    		break;
		    	case 3 : 
		    		 this.getEmployé().nourrirAnimauxEnclos(this.getListEnclos().get(numEnclos-1));
		    		break;
		    	case 4 :
		    		this.getEmployé().soignerAnimauxEnclos(this.getListEnclos().get(numEnclos-1));
		    		break;
		    	case 5 : 
		    		if (this.getListEnclos().get(numEnclos-1).getProprete() == EtatProprete.Mauvais || this.getListEnclos().get(numEnclos-1).getProprete() == EtatProprete.Correct) {
			    		 System.out.println("Selectionnez l'enclos vers lequel le transferer :");
			    		 int ita = 0;
			    		 for (Enclos<? extends Animal> enclos : this.getListEnclos()) {
			    			 ita += 1;
			    			 	if(this.getListEnclos().get(numEnclos-1).getClass() == enclos.getClass() && this.getListEnclos().get(numEnclos-1) != enclos) {
				    				System.out.println(ita + "." + enclos.toString());
			    			 	}
			    			}
			    		 int numEnclosNettoyage = sc.nextInt();
			    		 this.getEmployé().nettoyerEnclos(this.getListEnclos().get(numEnclos-1),this.getListEnclos().get(numEnclosNettoyage-1) );
		    		}
		    		else {
	    				System.out.println("Enclos deja en bon état." + "\n");
	    			}
		    		break;
		    	case 6 :
		    		System.out.println("Selectionnez l'enclos vers lequel le transferer :");
		    		 int itr = 0;
		    		 for (Enclos<? extends Animal> enclos : this.getListEnclos()) {
		    			 	itr += 1;
		    			 	if(this.getListEnclos().get(numEnclos-1).getClass() == enclos.getClass()  && this.getListEnclos().get(numEnclos-1) != enclos) {
		    			 		System.out.println(itr + "." + enclos.toString());
		    			 	}
		    			}
		    		 int numEnclosTransfertAll = sc.nextInt();
		    		 if (this.getListEnclos().get(numEnclos-1).getClass() == this.getListEnclos().get(numEnclosTransfertAll-1).getClass()  && this.getListEnclos().get(numEnclos-1) != this.getListEnclos().get(numEnclosTransfertAll-1)) {
		    			 for(Animal animal : this.getListEnclos().get(numEnclos-1).getLesAnimaux()) {
			    			 this.getEmployé().transférerAnimalToEnclos(animal, this.getListEnclos().get(numEnclos-1), this.getListEnclos().get(numEnclosTransfertAll-1));
		    			 }
		    		 }
		    		 else {
		    			 System.out.println("Impossible l'enclos ne correspond pas pour cet animal " + "\n");
		    		 }
		    		break;
		    	case 7 : 
		    		break outerloop;
		    	default : 
		    		break;
		    }
		}
	    
	}

}
	
