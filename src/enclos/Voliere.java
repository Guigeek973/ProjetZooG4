package enclos;

import java.util.List;

import animaux.AnimalVolant;

public class Voliere extends Enclos <AnimalVolant> {

	private float hauteur;
	public enum EtatV {
		Mauvais,
		Correct,
		Bon
	}
	private EtatV etatToit;
	
	public Voliere(String nom, float superficie, int nbAnimauxMax, float hauteur) {
		super(nom, superficie, nbAnimauxMax);
		this.hauteur = hauteur;
		this.etatToit = EtatV.Bon;;
	}
	public float getHauteur() {
		return hauteur;
	}
	public EtatV getEtatToit() {
		return etatToit;
	}
	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}
	public void setEtatToit(EtatV etatToit) {
		this.etatToit = etatToit;
	}
	
	@Override
	public void nettoyerEnclos() {
		super.nettoyerEnclos();
		if (this.getEtatToit() == EtatV.Mauvais) {
			this.setEtatToit(EtatV.Correct);
		}
		else if (this.getEtatToit() == EtatV.Correct) {
			this.setEtatToit(EtatV.Bon);
		}
	}
}