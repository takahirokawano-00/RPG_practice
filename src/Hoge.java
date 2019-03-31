public class Hoge {
	public static void main(String[] args) {
		Character teamA[] = new Character[3];
		teamA[0] = new Robber("ドラえもん", 2800, 600, 400);
		teamA[1] = new Sniper("のび太", 1600, 430, 800);
		teamA[2] = new Robber("しずか", 600, 250, 200);

		Character teamB[] = new Character[3];
		teamB[0] = new Robber("ジャイアン", 4500, 1000, 620);
		teamB[1] = new Sniper("スネ夫", 1200, 400, 300);
		teamB[2] = new Sniper("出木杉", 2600, 580, 700);

		int value1 = (int)(Math.random()*3);
		int value2 = (int)(Math.random()*3);

		for(int i=0; i<=teamA.length-1; i++) {
			teamA[i].introduce();
			teamA[i].attack(teamB[value1]);
			System.out.println("--------------------------------------------");
		}

		for(int i=0; i<=teamB.length-1; i++) {
			teamB[i].introduce();
			teamB[i].attack(teamA[value2]);
			System.out.println("--------------------------------------------");
		}
	}
}
