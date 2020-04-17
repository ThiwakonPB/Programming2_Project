package game;

public abstract class Gear {
	
	private String name;
	private String type;
	private int atk;
	private int def;
	private int mp;
	private int spd;
	private int rarity;
	
	public Gear() {
		this.setName("Default");
		this.setType("Default");
		this.setAtk(10);
		this.setDef(10);
		this.setMp(10);
		this.setSpd(10);
		this.setRarity(0);
		
	}


	public Gear(String name, String type, int atk,int def, int mp,int spd,int rarity) {
		this.setName(name);
		this.setType(type);
		this.setAtk(atk);
		this.setDef(def);
		this.setMp(mp);
		this.setSpd(spd);
		this.setRarity(rarity);
		
	}

	
	
	
	


	
	
	
	
	
	
	
	
	
	
	///Getter and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getSpd() {
		return spd;
	}


	public void setSpd(int spd) {
		this.spd = spd;
	}


	public int getRarity() {
		return rarity;
	}


	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	
	
	
	


}
