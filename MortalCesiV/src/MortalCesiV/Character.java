package MortalCesiV;

public abstract class Character {
	private int HP, HPmax, lastHP, MP, MPmax, AS, speed;
	private int alive=1, blocking=0;
	private String characterPath;

public void attack(Character character){
	this.getAS(); 
	if (character.getBlocking()==1){
		character.getdamage(1);
	}
	else if (character.getBlocking()==0){
		character.getdamage(this.getAS());
	}
}
	

public void block(){
	this.setBlocking(1);
}

public void usespell(Character target){
		switch(characterPath){
			case "damager":
				System.out.println("Oups...Error :/");
				break;
			case "healer":
				if(this.getMP()>0){
					this.heal(2);
					this.setMP(this.getMP()-1);
				}
				else if(this.getMP()<=0){
					System.out.println(this.getCharacterName() +" tries to cast his spell but it fails");
				}
				break;
					
			case "tank": 
				if(this.getMP()>0){
					if(this.getHP()>1){ 
						System.out.println(this.getCharacterName() +" sacrifices 1 HP");
						this.getdamage(1);
						if(target.getBlocking()==0){
							this.attack(target);
							this.attack(target);
						}
						else if(target.getBlocking()==1){
							this.attack(target);
						}
						this.setMP(this.getMP()-1);
					}
					else if(this.getHP()==1){
						System.out.println(this.getCharacterName() +"can't do this");
					}
				}
				else if(this.getMP()<=0){
					System.out.println(this.getCharacterName() +" tries to cast his spell but it fails");
				}
				break;
		}
	}
	
private String getCharacterName() {
	// TODO Auto-generated method stub
	return null;
}

public void getdamage(int damageAmount){
	this.setHP(this.getHP()-damageAmount);
	if (this.getHP()<=0){
		this.setAlive(0);
	}
}

public void heal(int heal){
	this.setHP(this.getHP()+heal);
	if (this.getHP()>this.getHPmax())
		this.setHP(this.getHPmax());
}

public int getHP() {
	return HP;
}


public void setHP(int hP) {
	HP = hP;
}


public int getHPmax() {
	return HPmax;
}


public void setHPmax(int hPmax) {
	HPmax = hPmax;
}


public int getLastHP() {
	return lastHP;
}


public void setLastHP(int lastHP) {
	this.lastHP = lastHP;
}


public int getMP() {
	return MP;
}


public void setMP(int mP) {
	MP = mP;
}


public int getMPmax() {
	return MPmax;
}


public void setMPmax(int mPmax) {
	MPmax = mPmax;
}


public int getAS() {
	return AS;
}


public void setAS(int aS) {
	AS = aS;
}


public int getSpeed() {
	return speed;
}


public void setSpeed(int speed) {
	this.speed = speed;
}


public int getAlive() {
	return alive;
}


public void setAlive(int alive) {
	this.alive = alive;
}


public int getBlocking() {
	return blocking;
}


public void setBlocking(int blocking) {
	this.blocking = blocking;
}


public String getCharacterPath() {
	return characterPath;
}


public void setCharacterPath(String characterPath) {
	this.characterPath = characterPath;
}


public void setBlocking(boolean b) {
	// TODO Auto-generated method stub
	
}


public void setNextMove(int moveSelected) {
	// TODO Auto-generated method stub
	
}


public void block(Character enemy) {
	// TODO Auto-generated method stub
	
}

public void usespell(Character enemy) {
	// TODO Auto-generated method stub
	
}


}