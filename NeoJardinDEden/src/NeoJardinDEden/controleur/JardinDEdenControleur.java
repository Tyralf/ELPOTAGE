package NeoJardinDEden.controleur;

import NeoJardinDEden.ihm.JardinDEdenConsole;
import NeoJardinDEden.ihm.MaFrame;
//import NeoJardinDEden.ihm.MaFrame;
import NeoJardinDEden.modele.Emplacement;
import NeoJardinDEden.modele.Jardin;
import NeoJardinDEden.modele.Jardinier;

public class JardinDEdenControleur {
    Jardin monJardin; 
    JardinDEdenConsole maConsole;
    Jardinier monJardinier1;
    MaFrame petiteFrame;
    
    public JardinDEdenControleur(){
    	monJardin = new Jardin(7,7);
    	monJardinier1 = new Jardinier("Pedro");
		maConsole = new JardinDEdenConsole();
		petiteFrame = new MaFrame("Neo Jardin SWAG du TERTER !!!!",800,800);
		
    }
	public void Start(){
		
		maConsole.AfficherJardin(monJardin);
		maConsole.AfficherJardinier(monJardinier1);
		monJardinier1.SemerDansLeJardin(monJardin, "Tomate", 0, 0);
		monJardinier1.SemerDansLeJardin(monJardin, "Carotte", 0, 1);
		maConsole.AfficherJardin(monJardin);
		maConsole.AfficherJardinier(monJardinier1);
		//petiteFrame.AfficherMaFrame();
		
	}
	
	
}
