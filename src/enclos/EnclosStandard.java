package enclos;

import java.util.List;

import animaux.AnimalTerrestre;

public class EnclosStandard extends Enclos<AnimalTerrestre>{

	public EnclosStandard(String nom, float superficie, int nbAnimauxMax, List<AnimalTerrestre> list) {
		super(nom, superficie, nbAnimauxMax, list);
	}

}
