public class Hoge {
	public static void main(String[] args) {
		Character c = new Character("ドラえもん", 800, 10000);
		Character c2 = new Character("のび太", 560, 650);
		Character c3 = new Character("ジャイアン", 14000, 530);
		Character c4 = new Character("スネ夫", 400, 400);
		Character c5 = new Character("しずか", 260, 380);

		c.introduce();
		c2.introduce();
		c3.introduce();
		c4.introduce();
		c5.introduce();

		c3.attack(c2);
	}
}
