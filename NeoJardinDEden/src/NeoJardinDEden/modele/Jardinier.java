package NeoJardinDEden.modele;

import java.util.HashMap;

public class Jardinier {
	String nom;
	private HashMap<String, Integer> panier;
	
	public Jardinier(String nom){
		this.nom = nom;
		this.panier = new HashMap<String, Integer>();
		ajouterAuPanier("Tomate",10);
		ajouterAuPanier("Carotte",10);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public HashMap<String, Integer> getPanier() {
		return panier;
	}
	public void setPanier(HashMap<String, Integer> panier) {
		this.panier = panier;
	}
	public void ajouterAuPanier(String nomDuVegetal, int nombreDeGraine) {

		panier.put(nomDuVegetal, nombreDeGraine);

	}
	public void SemerDansLeJardin(Jardin jardin,String nomVegetal,int x,int y){
		
		if (nomVegetal == "Tomate"){
			jardin.getEmplacement()[x][y].setVegetal(new Tomate());
			ajouterAuPanier("Tomate",this.panier.get("Tomate") - 1);
		}else if (nomVegetal == "Carotte"){
			jardin.getEmplacement()[x][y].setVegetal(new Carotte());
			ajouterAuPanier("Carotte",this.panier.get("Carotte") - 1);
		}
			
	}

}
