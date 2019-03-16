public class Hoge {
	public static void main(String[] args) {

		Character dora = new Character("ドラえもん", 2800, 600, 400);
		Character nobi = new Sniper("のび太", 1600, 430, 800);
		Character jai = new Robber("ジャイアン", 4500, 1000, 620);
		Character sune = new Character("スネ夫", 1200, 400, 300);
		Character shiz = new Character("しずか", 600, 250, 200);
		Character deki = new Character("出木杉", 2600, 580, 700);

		dora.introduce();
		nobi.introduce();
		jai.introduce();
		sune.introduce();
		shiz.introduce();
		deki.introduce();

		System.out.println("-----------------------------------");
		shiz.attack(nobi);
		System.out.println("-----------------------------------");
		nobi.attack(deki);
		System.out.println("-----------------------------------");
		jai.attack(sune);
	}
}
