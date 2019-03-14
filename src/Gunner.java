public class Gunner extends Character{
	Gunner(String name, int hp, int mp){
		super(name, hp, mp);
	}

	public void introduce() {
		System.out.println("狙撃手が現れた！");
		super.introduce();
	}
}