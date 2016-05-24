package NeoJardinDEden.modele;

public class Vegetal {
	private  char[] dessin;
	private  Etat etat;
	
	public Vegetal(char feuille, char fleur) {
        dessin = new char[6];
		dessin[0] = '_';
	    dessin[1] = '.';
		dessin[2] = 'i';
		dessin[3] = feuille;
		dessin[4] = fleur;
		dessin[5] = '#';
		this.etat = Etat.GRAINE;

	}
	public Vegetal(char feuille, char fleur,Etat etatRecup) {
		dessin = new char[6];
		dessin[0] = '_';
		dessin[1] = '.';
		dessin[2] = 'i';
		dessin[3] = feuille;
		dessin[4] = fleur;
		dessin[5] = '#';
		this.setEtat(etatRecup);

	}
	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public char getDessin(int i) {
		return dessin[i];
	}

	public void setDessin(char[] dessin) {
		this.dessin = dessin;
}
}
