package NeoJardinDEden.modele;



public class Emplacement{
private Vegetal vegetal;


public Emplacement(Vegetal vegetal) {
	this.vegetal = vegetal;
	
}

public Vegetal getVegetal() {
	return vegetal;
}

public void setVegetal(Vegetal vegetal) {
	this.vegetal = vegetal;
}
	public String toString() {
		Etat etat = vegetal.getEtat();
		String spriteVegetal = "";
		if (etat == Etat.MOTTE) {
			spriteVegetal = spriteVegetal + Character.toString(vegetal.getDessin(3));
		}
		if (etat == Etat.GRAINE) {
			spriteVegetal = spriteVegetal + Character.toString(vegetal.getDessin(0));
		}
		if (etat == Etat.TIGE) {
			spriteVegetal = spriteVegetal + Character.toString(vegetal.getDessin(2));
		}
		if (etat == Etat.GERME) {
			spriteVegetal = spriteVegetal + Character.toString(vegetal.getDessin(1));
		}
		if (etat == Etat.MORT) {
			spriteVegetal = spriteVegetal + Character.toString(vegetal.getDessin(5));
		}
		if (etat == Etat.FLEUR) {
			spriteVegetal = spriteVegetal + Character.toString(vegetal.getDessin(4));
		}
		if (etat == Etat.FEUILLE) {
			spriteVegetal = spriteVegetal + Character.toString(vegetal.getDessin(5));

		}
		return spriteVegetal;
	}
}

