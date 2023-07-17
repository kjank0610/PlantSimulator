package itec220.labs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Plant> plants = new ArrayList<>();
		plants.add(new SugarCane("Dolly"));
		plants.add(new SugarCane("Alan"));
		plants.add(new SweetPotato("Popeye"));
		plants.add(new SweetPotato("Erica"));
		plants.add(new Tomato("Fred"));
		plants.add(new Tomato("George"));
		plants.add(new Wheat("Polly"));
		plants.add(new Wheat("Bill"));
		plants.add(new Corn("Angelina"));
		plants.add(new Corn("Charlie"));
		
		ArrayList<Fertilizer> delivery = new ArrayList<Fertilizer>();
		delivery.add(Fertilizer.Grass);
		delivery.add(Fertilizer.Jacks);
		delivery.add(Fertilizer.Manure);
		delivery.add(Fertilizer.Eggshells);
		delivery.add(Fertilizer.DynaGro);
		delivery.add(Fertilizer.HappyFrog);
		
		int popCount = 0;
		int day = 1;
		Collections.sort(plants);
		while (popCount < 10) {
			
			
			
			System.out.println("---------------------------------------------");			
			System.out.println("Day " + day);
			
			for(Fertilizer f : delivery) {
				f.newDelivery(); //new delivery
				f.setCurrentStock(f.getCurrentStock() + f.getDelivery()); //add delivery to to current stock
			}
			
			System.out.printf("Delivery:      Grass%8d Jack's%8d Manure%8d Eggshells%8d Dyna-Gro%8d Happy Frog%8d\n",
					Fertilizer.Grass.getDelivery(), Fertilizer.Jacks.getDelivery(), Fertilizer.Manure.getDelivery(),
					Fertilizer.Eggshells.getDelivery(), Fertilizer.DynaGro.getDelivery(), Fertilizer.HappyFrog.getDelivery());
					
			System.out.printf("Current Stock: Grass%8d Jack's%8d Manure%8d Eggshells%8d Dyna-Gro%8d Happy Frog%8d\n",
					Fertilizer.Grass.getCurrentStock(), Fertilizer.Jacks.getCurrentStock(), Fertilizer.Manure.getCurrentStock(),
					Fertilizer.Eggshells.getCurrentStock(), Fertilizer.DynaGro.getCurrentStock(), Fertilizer.HappyFrog.getCurrentStock());
			
			System.out.println("---------------------------------------------");
			
			popCount = 0;
			for (Plant plant : plants) { 
				
				if (!plant.getMusic().equals("Pop")) { //if plant is not listening to pop, then fertilize
					plant.fertilize();
					
				} 
				System.out.println(plant);
				//System.out.println("fertilizer need: " + plant.getFertilizerNeed());
				//plant.addFertilizerNeed();
				//System.out.println("After added fertilizer-- " + plant.getName() + " " + plant.getFertilizerNeed());
				//System.out.println(plant);
				
				if (plant.getMusic().equals("Pop")){ //count how many plants in the array list are listening to pop
					popCount++;
				}
			
				
			}
			
			
			System.out.println(popCount);
			
			
			day++;
			
			Collections.sort(plants);

		}
		
		System.out.println("---------------------------------------------");
		System.out.printf("Total Days: %d\n", day - 1);
		System.out.printf("Current Stock: Grass%8d Jack's%8d Manure%8d Eggshells%8d Dyna-Gro%8d Happy Frog%8d\n",
				Fertilizer.Grass.getCurrentStock(), Fertilizer.Jacks.getCurrentStock(), Fertilizer.Manure.getCurrentStock(),
				Fertilizer.Eggshells.getCurrentStock(), Fertilizer.DynaGro.getCurrentStock(), Fertilizer.HappyFrog.getCurrentStock());
		System.out.printf("Doses:         Grass%8d Jack's%8d Manure%8d Eggshells%8d Dyna-Gro%8d Happy Frog%8d\n",
				Fertilizer.Grass.getDoses(), Fertilizer.Jacks.getDoses(), Fertilizer.Manure.getDoses(),
				Fertilizer.Eggshells.getDoses(), Fertilizer.DynaGro.getDoses(), Fertilizer.HappyFrog.getDoses());
		System.out.println("---------------------------------------------");
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		

	}

}
