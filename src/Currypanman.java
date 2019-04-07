public class Currypanman implements Movable{
	protected String name;
	protected int hp;
	protected int mp;
	protected int sp;

	Currypanman(String name, int hp, int mp, int sp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.sp = sp;
	}

	public void introduce() {
		System.out.println(this.name+"参上！"+" HP："+this.hp+" MP："+this.mp+" SP："+this.sp);
	}

	public void move(Character terget) {
		System.out.println("カレービーム発射！");
	}
}
