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
import enclos.Voliere;
import enclos.Voliere.EtatV;

public class Zoo {
	private String nom ;
	private Employe employé ;
	private int nbEnclosMax ;
	private int nbEnclos;
	private List<Enclos<?>> listEnclos;

	public Zoo(String nom, Employe employé, int nbEnclosMax, int nbEnclos) {
		super();
		this.nom = nom;
		this.employé = employé;
		this.nbEnclosMax = nbEnclosMax;
		this.nbEnclos = nbEnclos;
		this.listEnclos = new ArrayList<>();
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
					anim.setIndicateurFaim(30);
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
		int i = sc.nextInt();
		
	    System.out.println("Choisir l'action à effectuer : ");
	    System.out.println("1.Examiner l'enclos et son contenu");
	    System.out.println("2.Transferer un animal");
	    System.out.println("3.Nourrir les animaux");
	    System.out.println("4.Nettoyer l'enclos");
	    int y = sc.nextInt();
	    switch (y) {
	    	case 1 : 
	    		 this.getEmployé().examinerEnclos((Enclos<Animal>) this.getListEnclos().get(i-1));
	    		break;
	    	case 2 : 
	    		 System.out.println("Selectionnez l'animal que vous souhaitez transférer :");
	    		 System.out.println(this.getListEnclos().get(i-1).toString());
	    		 int it1 = 0;
	    		 for (Animal a : (List<Animal>) this.getListEnclos().get(i-1).getLesAnimaux()) {
	    			 it1 += 1;
	    			 Animal animal = (Animal) a;
	    			 System.out.println(it1 + "." + animal.toString());
	    		 }
	    		 int z = sc.nextInt();
	    		 System.out.println("Selectionnez l'enclos vers lequel transferer :");
	    		 for (Enclos<?> enclos : this.getListEnclos()) {
	    				it += 1;
	    				System.out.println(it + "." + enclos.toString());
	    			}
	    		 int a = sc.nextInt();
	    		 this.getEmployé().transférerAnimalToEnclos((Animal)this.getListEnclos().get(i-1).getLesAnimaux().get(z-1), (Enclos<Animal>)this.getListEnclos().get(i-1), (Enclos<Animal>)this.getListEnclos().get(a-1));
	    		break;
	    	case 3 : 
	    		this.getEmployé().nourrirAnimauxEnclos((Enclos<Animal>)this.getListEnclos().get(i-1));
	    		break;
	    	case 4 : 
	    		this.getEmployé().nettoyerEnclos((Enclos<Animal>)this.getListEnclos().get(i-1));
	    		break;
	    	default : 
	    		break;
	    }
	}

}
	
