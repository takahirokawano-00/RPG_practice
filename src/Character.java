public abstract class Character{
	protected String name;
	protected int hp;
	protected int mp;
	protected int sp;

	Character(String name, int hp, int mp, int sp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.sp = sp;
	}

	int getHp() {
		return hp;
	}

	public void introduce() {
		System.out.println("私の名前は"+this.name+"だ！"+" HP："+this.hp+" MP："+this.mp+" SP："+this.sp);
	}

	public void damage(int damage) {
		if(this.hp <= 0) {
			System.out.println(this.name+"は既に倒れている");
		}else{
			System.out.println(this.name+"は"+damage+"ポイントのダメージを受けた。");
			if(this.hp<damage) {
				this.hp -= damage;
				System.out.println(this.name+"のHPが【0】になった。");
				System.out.println(this.name+"は倒れた...");
			}else{
				this.hp -= damage;
				System.out.println(this.name+"のHPが【"+this.hp+"】になった。");
			}
		}
	}

	public abstract void attack(Character character);
}