package itec220.labs;

import java.util.Random;

public enum Fertilizer {
	
	Grass("Grass"), Jacks("Jack's"), Manure("Manure"), Eggshells("Eggshells"), DynaGro("Dyna-Gro"), HappyFrog("Happy Frog"); 
	
	private String displayName;
	private int currentStock = 0;
	private int delivery;
	private int doses = 0;
	
	Fertilizer(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
		if (this.currentStock < 0) {
			this.currentStock = 0;
		}
	}

	public int getDelivery() {
		return delivery;
	}

	public void newDelivery() {
		Random rand = new Random();
		this.delivery = 1 + rand.nextInt(3);
	}

	public int getDoses() {
		return doses;
	}

	public void addDose() {
		doses += 1;
	}

	

	
	
	
}
