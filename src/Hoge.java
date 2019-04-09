public class Hoge {
	public static void main(String[] args) {
		Movable teamA[] = new Movable[3];
		teamA[0] = new Robber("ドラえもん", 2800, 600, 400);
		teamA[1] = new Sniper("のび太", 1600, 430, 800);
		teamA[2] = new Robber("しずか", 600, 250, 200);

		Movable teamB[] = new Movable[4];
		teamB[0] = new Currypanman();
		teamB[1] = new Robber("ジャイアン", 4500, 1000, 620);
		teamB[2] = new Sniper("スネ夫", 1200, 400, 300);
		teamB[3] = new Sniper("出木杉", 2600, 580, 700);

		int value1 = (int)(Math.random()*3);
		int value2 = (int)(Math.random()*3);

		for(int i=0; i<=teamA.length-1; i++) {
			teamA[i].introduce();
			teamA[i].move((Character)teamB[value1]);
			System.out.println("--------------------------------------------");
		}

		for(int i=0; i<=teamB.length-1; i++) {
			teamB[i].introduce();
			teamB[i].move((Character)teamA[value2]);
			System.out.println("--------------------------------------------");
		}



	}
}
