package MortalCesiV;

import java.util.Random;
import java.util.Scanner;


public class Game {
	private int classSelected=0, enemySelected=0, worldSelected, round=0, moveSelected=0;
	private Character player, enemy;
	Scanner sc = new Scanner(System.in); 
	Random r = new Random(); 
	
	public void play(){
		while(classSelected <= 0 || classSelected > 3){ 
			System.out.println("Choose your class :\n\n1. Damager : 2 AS | 1 MP | 3 HP\n2. Healer : 1 AS | 1 MP | 4 HP\n3. Tank : 1 AS | 2 MP | 5 HP\n");
			this.setClassSelected(sc.nextInt());}
		
		switch(classSelected){
		case 1 : 
			player= new Damager(); 
			break;
		case 2 :
			player=new Healer();
			break;
		case 3 : 
			player=new Tank();
			break;
		}
		
		while(enemySelected <= 0 || enemySelected > 3){ 
			System.out.println("Choose your type of enemy :\n\n1. Damager : 2 AS | 1 MP | 3 HP\n2. Healer : 1 AS | 1 MP | 4 HP\n3. Tank : 1 AS | 2 MP | 5 HP\n");
			this.setEnnemySelected(sc.nextInt());}
		
		switch(enemySelected){
		case 1 : 
			enemy= new Damager(); 
			break;
		case 2 :
			enemy=new Healer();
			break;
		case 3 : 
			enemy=new Tank();
			break;
		}
		this.gameRound(player, enemy);
	}
		
public void gameRound(Character player, Character enemy){
	Window win1 = new Window(this.getClassSelected(), this.getEnemySelected());

	while(player.getAlive()==1 && enemy.getAlive()==1){ 
		
		this.setRound(this.getRound()+1); 
		System.out.println("\nRound " +this.getRound() +" :"); 
		
		player.setBlocking(0); 
		enemy.setBlocking(0);
		
		System.out.println("\nYour stats : HP:" +player.getHP() +"/" +player.getHPmax() +" ; MP:" +player.getMP() +"/" +player.getMPmax());
		System.out.println("Enemy stats : HP:" +enemy.getHP() +"/" +enemy.getHPmax() +" ; MP:" +enemy.getMP() +"/" +enemy.getMPmax()); 
	
		this.setMoveSelected(0);
		
		while(moveSelected <= 0 || moveSelected > 3){ 
			System.out.println("\nSelect next move :\n1. Attack\n2. Block\n3. Spell (cost 1 MP)");
			System.out.println("\n");
			this.setMoveSelected(sc.nextInt());
			player.setNextMove(this.getMoveSelected());
		}
		
		this.setEnemyMove(r.nextInt(3 - 1)); 
		enemy.setNextMove(this.getEnemyMove());
		
		switch(moveSelected){
		case 1 : 
			player.attack(enemy);
			System.out.println("You are attacking !");
			break;
		case 2 :
			player.block(enemy);
			System.out.println("You are blocking !");
			break;
		case 3 : 
			player.usespell(enemy);
			System.out.println("You are using Magic !");
			break;
		}
		switch(moveSelected){
		case 1 :
			enemy.attack(player);
			System.out.println("Your enemy is attacking you !");
			break;
		case 2 :
			enemy.block(player);
			System.out.println("Your enemy is blocking you !");
			break;
		case 3 :
			enemy.usespell(player);
			System.out.println("Your enemy is using Magic !");
			break;
		}
	
	if (player.getAlive()==0){ 
		System.out.println("YOU ARE DEAD, at round "+this.getRound() +" ahah...");
	}
	else if(enemy.getAlive()==0){
		System.out.println("YOUR ENEMY IS DEAD, at round " +this.getRound() +" !");
	}
	}

}


public void setClassSelected(int classSelected){
	this.classSelected=classSelected;}
	
public void setEnnemySelected(int enemySelected){
		this.enemySelected=enemySelected;}

public int getEnemySelected() {
	return enemySelected;
}

public void setEnemySelected(int enemySelected) {
	this.enemySelected = enemySelected;
}

public int getClassSelected() {
	return classSelected;
}

public int getWorldSelected() {
	return worldSelected;
}

public void setWorldSelected(int worldSelected) {
	this.worldSelected = worldSelected;
}

public int getRound() {
	return round;
}

public void setRound(int round) {
	this.round = round;
}

public int getMoveSelected() {
	return moveSelected;
}

public void setMoveSelected(int moveSelected) {
	this.moveSelected = moveSelected;
}

public Character getPlayer() {
	return player;
}

public void setPlayer(Character player) {
	this.player = player;
}

public Character getEnemy() {
	return enemy;
}

public void setEnemy(Character enemy) {
	this.enemy = enemy;
}

public Scanner getSc() {
	return sc;
}

public void setSc(Scanner sc) {
	this.sc = sc;
}

public Random getR() {
	return r;
}

public void setR(Random r) {
	this.r = r;
}
private void setEnemyMove(int i) {
	// TODO Auto-generated method stub
}
private int getEnemyMove() {
	// TODO Auto-generated method stub
	return 0;
}

public void startGame() {
	// TODO Auto-generated method stub
	
}
	
	}

