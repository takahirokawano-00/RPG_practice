public class Robber extends Character implements Movable{
	Robber(String name, int hp, int mp, int sp){
		super(name, hp, mp, sp);
	}

	@Override
	public void introduce() {
		System.out.println("私は強盗の"+this.name+"だ！"+" HP："+this.hp+" MP："+this.mp+" SP："+this.sp);
	}

	public void rob(String name) {
		System.out.println("「"+name+"のものは私のもの、私のものは私のものだ！」");
		System.out.println(this.name+"は"+name+"を馬乗りで攻撃し、現金を奪った！");
	}

	@Override
	public void attack(Character character) {
		rob(character.name);
		character.damage(this.sp);
	}
}
