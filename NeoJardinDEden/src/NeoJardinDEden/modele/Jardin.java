package NeoJardinDEden.modele;

import java.util.Observable;

public class Jardin extends Observable {
private int longeur;
private int largeur;
private Emplacement emplacement[][];

public Jardin(int longeur, int largeur) {
	this.longeur = longeur;
	this.largeur = largeur;
	this.emplacement = new Emplacement[longeur][largeur];
	for (int i = 0; i < longeur; i++) {
		for (int j = 0; j < largeur; j++) {
			this.emplacement[i][j] = new Emplacement(new MotteDeTerre());
		}
}
	
}

public Emplacement[][] getEmplacement() {
	return emplacement;
}

public int getLongeur() {
	return longeur;
}

public void setLongeur(int longeur) {
	this.longeur = longeur;
}

public int getLargeur() {
	return largeur;
}

public void setLargeur(int largeur) {
	this.largeur = largeur;
}

public void setEmplacement(Emplacement[][] emplacement) {
	this.emplacement = emplacement;
}

}
