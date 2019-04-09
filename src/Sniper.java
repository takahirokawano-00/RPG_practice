public class Sniper extends Character implements Movable {
	Sniper(String name, int hp, int mp, int sp){
		super(name, hp, mp, sp);
	}

	@Override
	public void introduce() {
		System.out.println("私は狙撃兵の"+this.name+"だ！"+" HP："+this.hp+" MP："+this.mp+" SP："+this.sp);
	}

	public void shot(String name) {
		System.out.println("「"+name+"このやろう-！」");
		System.out.println(this.name+"は"+name+"を撃った！");
	}

	@Override
	public void attack(Character character) {
		shot(character.name);
		character.damage(this.sp);
	}

	@Override
	public void move(Character target) {
		attack(target);
	}

}
