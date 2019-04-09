interface Movable {
	default void introduce() {
		System.out.println("ごきげんよう、私だ。");
	}
	void move(Character target);
}
