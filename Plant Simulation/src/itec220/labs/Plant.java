package itec220.labs;

import java.util.Random;

public class Plant implements Comparable<Plant>{
	
	protected String name;
	protected int fertilizerNeed; 
	protected Fertilizer primary;
	protected Fertilizer secondary;
	protected Music music;
	
	public Plant(String name) {
		this.name = name;
		Random rand = new Random();
		this.fertilizerNeed = 50 + rand.nextInt(50);
	}
	
	public int fertilize() {
		
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fertilizer getPrimary() {
		return primary;
	}

	public void setPrimary(Fertilizer primary) {
		this.primary = primary;
	}

	public Fertilizer getSecondary() {
		return secondary;
	}

	public void setSecondary(Fertilizer secondary) {
		this.secondary = secondary;
	}

	public int getFertilizerNeed() {
		return fertilizerNeed;
	}
	public void addFertilizerNeed() {
		Random rand = new Random();
		this.fertilizerNeed += rand.nextInt(3) + 1;
		
	}
	
	public String getMusic() {
		return Music.values()[this.fertilizerNeed / 20].getDisplayName();
		
//		if (this.fertilizerNeed >= 0 && this.fertilizerNeed <= 19) {
//			this.music = Music.Pop;
//		} else if (this.fertilizerNeed >= 20 && this.fertilizerNeed <= 39) {
//			this.music = Music.HipHop;
//		} else if (this.fertilizerNeed >= 40 && this.fertilizerNeed <= 59) {
//			this.music = Music.Alternative;
//		} else if (this.fertilizerNeed >= 60 && this.fertilizerNeed <= 79) {
//			this.music = Music.Metal;
//		} else if (this.fertilizerNeed >= 80 && this.fertilizerNeed <= 99) {
//			this.music = Music.Classical;
//		}
//		
//		return this.music.getDisplayName();
	}

	@Override
	public int compareTo(Plant o) {
		if (this.fertilizerNeed > o.fertilizerNeed) {
			return -1;
		} else if (this.fertilizerNeed < o.fertilizerNeed) {
			return 1;
		}
		return 0;
	}

}
