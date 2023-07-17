package itec220.labs;

public class Tomato extends Plant {
	
	public Tomato(String name) {
		super(name);
		this.primary = Fertilizer.Jacks;
		this.secondary = Fertilizer.Manure;
	}
	
	@Override
	public int fertilize() {
		// if primary == 0, subtract 1 from secondary, else subtract 1 from primary
		if (primary.getCurrentStock() != 0) {
			this.fertilizerNeed -= 7;
			primary.setCurrentStock(primary.getCurrentStock() - 1);
			primary.addDose();
			System.out.printf("%s fertilized with %s (primary)\n", this.name, this.primary.getDisplayName());
		} else if (secondary.getCurrentStock() != 0){
			this.fertilizerNeed -= 4;
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
		
		return this.fertilizerNeed;
	}
	
	@Override
	public String toString() {
		return String.format("%s the Tomato is listening to %s", this.name, getMusic());
	}

}
