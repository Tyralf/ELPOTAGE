package NeoJardinDEden.ihm;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class MonPanel extends JPanel { 
	String message;
	int x;
	int y;
	Color color;
	public MonPanel(String message,int x, int y, Color color){
		this.message = message;
		this.x = x;
		this.y = y;
		this.color = color;
		
	}
  public void paintComponent(Graphics g){
    System.out.println("Je suis exécutée ! je suis : " + message);
    
    
    try {
        Image img = ImageIO.read(new File("Images/motte nulle.jpg"));
        g.drawImage(img, 0, 0, this);
        //Pour une image de fond
        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
      } catch (IOException e) {
        e.printStackTrace();
      }
    /*try {
        Image img = ImageIO.read(new File("Images/motte nulle.jpg"));
        g.drawImage(img, 94, 0, this);
        //Pour une image de fond
        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
      } catch (IOException e) {
        e.printStackTrace();
      }  */             
  }  
}