package co.grandcircus;

public abstract class Player {
	private String name;
	
	public abstract Roshambo generateRoshambo();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
