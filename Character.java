package game;



	interface CanAttack {
		void attack();
	}
	
	interface CanCast {
		void cast();
	}

	public class Character {
		
		
		private String name;
		private String type;
		private String State;
		private int str;
		private int intl;
		private int vit;
		private int spd;
		private int mp;
		
		
		
	public Character () {
		this.setName("Default");
		this.setState("Normal");
		this.setStr(10);
		this.setIntl(10);
		this.setVit(100); 
		this.setSpd(10);
		this.setMp(100);
		this.setType("Defult");
		
	}
	
	public Character (String name, String type, String state, int vit,int mp, int str, int intl, int spd) {
		this.setName(name);
		this.setType(type);
		this.setState(state);
		this.setStr(str);
		this.setIntl(intl);
		this.setVit(vit); 
		this.setSpd(spd);
		this.setMp(mp);
	
	}
	
	public String toString() {
//		System.out.println("Name: " + this.name + " Hp: " + this.hp + " Mp: " + this.mp + " Atk: " + this.atk );
		return "Name: " + this.name + " Vit: " + this.vit + " Mp: " + this.mp + " Str: " + this.str + " Type: " + this.type;
	}
	
	
	///Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getIntl() {
		return intl;
	}

	public void setIntl(int intl) {
		this.intl = intl;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}
