package itec220.labs;

public class SweetPotato extends Plant {
	
	public SweetPotato(String name) {
		super(name);
		this.primary = Fertilizer.Eggshells;
		this.secondary = Fertilizer.DynaGro;
	}
	
	@Override
	public int fertilize() {
		// if primary == 0, subtract 1 from secondary, else subtract 1 from primary
		if (primary.getCurrentStock() != 0) {
			if (this.fertilizerNeed >= 50) {
				this.fertilizerNeed -= 8;
			} else {
				this.fertilizerNeed -= 3;
			}
			primary.setCurrentStock(primary.getCurrentStock() - 1);
			primary.addDose();
			System.out.printf("%s fertilized with %s (primary)\n", this.name, this.primary.getDisplayName());
		} else if (secondary.getCurrentStock() != 0){
			this.fertilizerNeed -= 3;
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
		return String.format("%s the Sweet Potato is listening to %s", this.name, getMusic());
	}

}
