public class Dokinchan implements Movable {
	public void introduce() {
		System.out.println("ドキンちゃんとは、私のことよ!");
	}
	@Override
	public void move(Character target) {
		System.out.println("ドキンちゃんはしょくぱんまんを探している。");
	}
}
