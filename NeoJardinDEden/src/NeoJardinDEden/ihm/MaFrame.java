package NeoJardinDEden.ihm;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.GridLayout;
public class MaFrame {
	JFrame fenetre;
	
	public MaFrame(String nomDeFrame,int x,int y){
	    fenetre = new JFrame();
	    JPanel pan = new MonPanel("MEUH",x, y);

	    fenetre.getContentPane().setLayout(new GridLayout(0,1));
	    fenetre.getContentPane().add(pan);                    
	    fenetre.setTitle(nomDeFrame);
	    fenetre.setSize(x, y);
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setVisible(true);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	 
	public void AfficherMaFrame(){
		
	            
	    
	  }       
}
