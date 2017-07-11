package MortalCesiV;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = -4803942687992195961L;
	
	private String playerPath, iaPath; 
	
	public void paintComponent(Graphics g){ 
		try{
			BufferedImage player = ImageIO.read(new File(this.getPlayerPath()));
	        g.drawImage(player, 250, 300, this);
	        
	        BufferedImage ia = ImageIO.read(new File(this.getIaPath()));
	        g.drawImage(ia, 800, 300, this);
		} catch (IOException e) {
	        e.printStackTrace();
		
	}
	
}

	public String getPlayerPath() {
		return playerPath;
	}

	public void setPlayerPath(String playerPath) {
		this.playerPath = playerPath;
	}

	public String getIaPath() {
		return iaPath;
	}

	public void setIaPath(String iaPath) {
		this.iaPath = iaPath;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

