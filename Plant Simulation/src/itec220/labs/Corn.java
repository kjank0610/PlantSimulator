package itec220.labs;

public class Corn extends Plant {
	
	public Corn(String name) {
		super(name);
		this.primary = Fertilizer.Manure;
		this.secondary = Fertilizer.Eggshells;
	}
	
	@Override
	public int fertilize() {
		
		if (primary.getCurrentStock() != 0) {
			this.fertilizerNeed -= 8;
			primary.setCurrentStock(primary.getCurrentStock() - 1);
			primary.addDose();
			System.out.printf("%s fertilized with %s (primary)\n", this.name, this.primary.getDisplayName());
		} else if (secondary.getCurrentStock() != 0){
			this.fertilizerNeed -= 1;
			secondary.setCurrentStock(secondary.getCurrentStock() - 1);
			secondary.addDose();
			System.out.printf("%s fertilized with %s (secondary)\n", this.name, this.secondary.getDisplayName());
		} else {
			System.out.println(this.name + " not fertilized!");
		}
		
		if (this.fertilizerNeed > 99) {
			this.fertilizerNeed = 99;
		} else if(this.fertilizerNeed < 0) {
			this.fertilizerNeed = 0;
		}
		
		//Fertilizer.addDose();
		
		return this.fertilizerNeed;
	}
	
	@Override
	public String toString() {
		return String.format("%s the Corn is listening to %s", this.name, getMusic());
	}

}
