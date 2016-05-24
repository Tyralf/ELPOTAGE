package NeoJardinDEden.ihm;

import java.util.Observable;
import java.util.Observer;

import NeoJardinDEden.modele.Jardin;
import NeoJardinDEden.modele.Jardinier;

public class JardinDEdenConsole  {
	
	
public JardinDEdenConsole() {
	
}


public void AfficherJardin(Jardin jardin){
String tJardin = "Voici notre jardin:\n";
for (int i = 0; i < jardin.getLongeur(); i++) {
	for (int j = 0; j < jardin.getLargeur(); j++) {

		tJardin = tJardin + jardin.getEmplacement()[i][j].toString();

	}
	tJardin = tJardin + '\n';  
}
System.out.println(tJardin);
}
public void AfficherJardinier(Jardinier jardinier){
	String Texte = "Notre Jardinier s'appel " + jardinier.getNom() + "\n";
	Texte += jardinier.getNom() + " à un panier de Graines qui contient:\n";
	Texte += "- " + jardinier.getPanier().get("Tomate") + " Graines de tomate\n";
	Texte += "- " + jardinier.getPanier().get("Carotte") + " Graines de carotte\n";
	System.out.println(Texte);
}



}
