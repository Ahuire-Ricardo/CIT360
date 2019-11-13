package main.model;

public enum Classification {
	
	FRESHMAN("Freshman"),
	SOPHOMORE("Sophomore"),
	JUNIOR("Junior"),
	SENIOR("Senior");
	
	private String name;
	
	private Classification(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
