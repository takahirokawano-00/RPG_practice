public class Currypanman implements Movable{
	public void introduce() {
		System.out.println("僕が噂のカレーパンマンだ！");
	}
	@Override
	public void move(Character target) {
		System.out.println("カレーパンマンはストレッチをしている。");
	}
}
