package MortalCesiV;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 2249793878715155589L;

	private String playerPath, iaPath, WorldPath;
	private Panel pan = new Panel();

	public Window(int classSelected, int iaClass){
		
		switch(classSelected){ 
			case 1:
				this.setPlayerPath("C:/Users/renau/Desktop/CSEX_Java_Game/Sprites/Damager1.png");
				break;
			case 2:
				this.setPlayerPath("C:/Users/renau/Desktop/CSEX_Java_Game/Sprites/Healer1.png");
				break;
			case 3:
				this.setPlayerPath("C:/Users/renau/Desktop/CSEX_Java_Game/Sprites/Tank1.png");
				break;
	}
	
		switch(iaClass){ 
			case 1:
				this.setIaPath("C:/Users/renau/Desktop/CSEX_Java_Game/Sprites/Damager2.png");
				break;
			case 2:
				this.setIaPath("C:/Users/renau/Desktop/CSEX_Java_Game/Sprites/Healer2.png");
				break;
			case 3:
				this.setIaPath("C:/Users/renau/Desktop/CSEX_Java_Game/Sprites/Tank2.png");
				break;
	}
		this.setWorldPath("C:/Users/renau/Desktop/CSEX_Java_Game/Sprites/Map.png");
	}
	public Window(){
	this.setTitle("Mortal Cesi V"); 
	this.setSize(1280, 720); 
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

	pan.setPlayerPath(playerPath);
	pan.setIaPath(iaPath);
	
	this.setContentPane(this.getPan());
	
	this.setVisible(true);
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
	public Panel getPan() {
		return pan;
	}
	public void setPan(Panel pan) {
		this.pan = pan;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private void setWorldPath(String string) {
		// TODO Auto-generated method stub
	}
	public void updatePanelContent() {
		// TODO Auto-generated method stub
		
	}
		
}
