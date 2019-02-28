
public class Hoge {
	public void main(String[] args) {
		Character c = new Character();

		c.hp = 1200;
		c.mp = 800;
		c.name = "ロバート";

		Character c2 = new Character();

		c2.hp = 1000;
		c2.mp = 700;
		c2.name = "ジャック";

		c.introduce();
		c2.introduce();
	}
}
