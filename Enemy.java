package game;
//import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class Enemy extends Character {
	
	
	private int gold;
	private int randomNum;
	/// Enemies names and stats
	 String[] names = new String[] {"Killer","Boomer"};
	 String[] types = new String[] {"Ice","Water"};
	 String[] states = new String[] {"Normal","Berzerk"};
	 int[] maxvit = new int[] {70,12};
	 int[] maxmp = new int[] {23,100};
	 int[] maxstr = new int[] {100,12};
	 int[] maxintl = new int[] {23,100};
	 int[] maxspd = new int[] {23,12};

	 
	 
	public Enemy () {
		this.setName("Default Enemy");
		this.setType("Default");
		this.setState("Normal");
		this.setStr(10);
		this.setIntl(10);
		this.setVit(100); 
		this.setSpd(10);
		this.setMp(100);
	}
	
	public Enemy (String name, String type, String state, int vit,int mp, int str, int intl, int spd) {
		this.setName(name);
		this.setType(type);
		this.setState(state);
		this.setStr(str);
		this.setIntl(intl);
		this.setVit(vit); 
		this.setSpd(spd);
		this.setMp(mp);
	
	}
	/// Randomized the enemy
	public void Spawn () {
		

		randomNum = ThreadLocalRandom.current().nextInt(0,2);
		
		this.setName(names[randomNum]);
		this.setType(types[randomNum]);
		this.setState(states[randomNum]);
		
		int vit = ThreadLocalRandom.current().nextInt(maxvit[randomNum] - 5,maxvit[randomNum]);
		int mp = ThreadLocalRandom.current().nextInt(maxmp[randomNum] - 5,maxmp[randomNum]);
		int str = ThreadLocalRandom.current().nextInt(maxstr[randomNum] - 5 ,maxstr[randomNum]);
		int intl = ThreadLocalRandom.current().nextInt(maxintl[randomNum] - 5,maxintl[randomNum]);
		int spd = ThreadLocalRandom.current().nextInt(maxspd[randomNum]  - 5,maxspd[randomNum]);
		
		this.setStr(str);
		this.setIntl(intl);
		this.setVit(vit); 
		this.setSpd(spd);
		this.setMp(mp);
		
	}

}


