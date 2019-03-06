public class Character {
	String name;
	int hp;
	int mp;

	Character(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public void introduce() {
		System.out.println("私の名前は"+this.name+",HPは"+this.hp+",MPは"+this.mp+"だ！");
	}

	public void damage() {

	}
}
