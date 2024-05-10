class Vegan extends Student {
	public Vegan(String name) {
		super(name);
	}
	public String getFood() {
		return "No " + super.getFood() + " but Olives";
	}
}