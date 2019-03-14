public class Character {
	protected String name;
	protected int hp;
	protected int mp;

	Character(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public void introduce() {
		System.out.println("私の名前は"+this.name+",HPは"+this.hp+",MPは"+this.mp+"だ！");
	}

	public void damage(int damage) {
		System.out.println(this.name+"は"+damage+"ポイントのダメージを受けた");
		this.hp -= damage;
		System.out.println(this.name+"のHPが"+this.hp+"になった");
	}

	public void attack(Character character) {
		System.out.println(this.name+"の攻撃!");
		character.damage(this.mp);
	}
}
