package itec220.labs;

public enum Music {
	
	Pop("Pop"), HipHop("Hip Hop"), Alternative("Alternative"), Metal("Metal"), Classical("Classical");
	
	private String displayName;
	
	Music(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

}
