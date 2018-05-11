package enclos;

import java.util.Iterator;
import java.util.List;

import animaux.AnimalNageant;
import animaux.AnimalVolant;

public class Aquarium extends Enclos <AnimalNageant> {

	private float profondeur;
	private float saliniteEau;
	public enum EtatA {
		Mauvais,
		Correct,
		Bon
	}
	private EtatA etatProfondeur;
	private EtatA etatSalinite;
	

	public Aquarium(String nom, float superficie, int nbAnimauxMax, float profondeur, float saliniteEau, List<AnimalNageant> list) {
		super(nom, superficie, nbAnimauxMax, list);
		this.profondeur = profondeur;
		this.saliniteEau = saliniteEau;
		this.etatProfondeur = EtatA.Bon;
		this.etatSalinite = EtatA.Bon;
	}
	
	public float getProfondeur() {
		return profondeur;
	}
	public float getSaliniteEau() {
		return saliniteEau;
	}
	public void setProfondeur(float profondeur) {
		this.profondeur = profondeur;
	}
	public void setSaliniteEau(float saliniteEau) {
		this.saliniteEau = saliniteEau;
	}
	public EtatA getEtatProfondeur() {
		return etatProfondeur;
	}
	public EtatA getEtatSalinite() {
		return etatSalinite;
	}
	public void setEtatProfondeur(EtatA etatProfondeur) {
		this.etatProfondeur = etatProfondeur;
	}
	public void setEtatSalinite(EtatA etatSalinite) {
		this.etatSalinite = etatSalinite;
	}
	
	@Override
	public void nettoyerEnclos() {
		super.nettoyerEnclos();
		if (this.getEtatProfondeur() == EtatA.Mauvais) {
			this.setEtatProfondeur(EtatA.Correct);
		}
		else if (this.getEtatProfondeur() == EtatA.Correct) {
			this.setEtatProfondeur(EtatA.Bon);
		}
		if (this.getEtatSalinite() == EtatA.Mauvais) {
			this.setEtatSalinite(EtatA.Correct);
		}
		else if (this.getEtatSalinite() == EtatA.Correct) {
			this.setEtatSalinite(EtatA.Bon);
		}
	}
}