public class Character {
	private String name;
	private int hp;
	private int mp;

	Character(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public void introduce() {
		System.out.println("私の名前は"+this.name+",HPは"+this.hp+",MPは"+this.mp+"だ！");
	}

	public void damage(int mp) {
		System.out.println(this.name+"は"+mp+"ポイントのダメージを受けた");
		this.hp -= mp;
		System.out.println(this.name+"のHPが"+this.hp+"になった");
	}

	public void attack(Character character) {
		System.out.println(this.name+"の攻撃!");
		character.damage(this.mp);
	}
}
