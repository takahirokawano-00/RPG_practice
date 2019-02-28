
public class Hoge {
	public static void main(String[] args) {
		Character c = new Character();

		c.hp = 800;
		c.mp = 10000;
		c.name = "ドラえもん";

		Character c2 = new Character();

		c2.hp = 560;
		c2.mp = 650;
		c2.name = "のび太";

		Character c3 = new Character();

		c3.hp = 14000;
		c3.mp = 530;
		c3.name = "ジャイアン";

		Character c4 = new Character();

		c4.hp = 400;
		c4.mp = 400;
		c4.name = "スネ夫";

		Character c5 = new Character();

		c5.hp = 260;
		c5.mp = 380;
		c5.name = "しずか";

		c.introduce();
		c2.introduce();
		c3.introduce();
		c4.introduce();
		c5.introduce();
	}
}
