package NeoJardinDEden.ihm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MonPanel extends JPanel {
	String	message;
	int		x;
	int		y;
	Color	color;

	public MonPanel(String message, int x, int y) {
		this.message = message;
		this.x = x;
		this.y = y;
	}

	public void paintComponent(Graphics g) {
		System.out.println("Je suis exécutée ! je suis : " + message);

		try {
			Image img = ImageIO.read(new File("Images/motte nulle.jpg"));
			for (int i = 0; i < 800; i = i +100){
				for (int j = 0; j < 800; j = j + 100){
					g.drawImage(img, i, j, this);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}