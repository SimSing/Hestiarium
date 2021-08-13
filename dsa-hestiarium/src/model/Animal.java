package model;

public class Animal {
	
	
	
	
	public enum Occurrence {NORTH_AVENTURIA, MIDDLE_AVENTURIA, SOUTH_AVENTURIA,NORTH_MIDDLE_AVENTURIA,SOUTH_MIDDLE_AVENTURIA, EVERYWHERE, TBD
		
	}
	
	public enum Category {LAND, WATER, AIR, LAND_WATER, LAND_AIR, AIR_WATER, TBD
		
	}
	
	public enum Size {TINY, SMALL, MIDDLE, BIG, GIANT, TBD}
	
	public enum Species {CAT, DOG, HORSE, REPTILE, FISH, BIRD, CATTLE, GAME, MONKEY, URSAE, INSECT, ARACHNAE, CANINE, RODENT, LIZARD, GASTROPOD, OTHER}
	
	private int id;
	
	private String name;
	
	private Category category;
	
	private Species species;
		
	private Occurrence occurrence;
	
	private String biome;
	
	private int huntingModifier;
	
	private Size size;
	
	private String urlPath;
	
	

	
	public Animal(int id, String name, Category category, Species species, Occurrence occurrence, String biome, int huntingModifier,
			Size size, String urlPath) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.species = species;
		this.occurrence = occurrence;
		this.biome = biome;
		this.huntingModifier = huntingModifier;
		this.size = size;
		this.urlPath = urlPath;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}

	
	
	public Species getSpecies() {
		return species;
	}


	public void setSpecies(Species species) {
		this.species = species;
	}


	public Occurrence getOccurrence() {
		return occurrence;
	}


	public void setOccurrence(Occurrence occurrence) {
		this.occurrence = occurrence;
	}


	public String getBiome() {
		return biome;
	}


	public void setBiome(String biome) {
		this.biome = biome;
	}


	public int getHuntingModifier() {
		return huntingModifier;
	}


	public void setHuntingModifier(int huntingModifier) {
		this.huntingModifier = huntingModifier;
	}


	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	public String getUrlPath() {
		return urlPath;
	}


	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", category=" + category + ", species=" + species
				+ ", occurrence=" + occurrence + ", biome=" + biome + ", huntingModifier=" + huntingModifier + ", size="
				+ size + ", urlPath=" + urlPath + "]";
	}





	
	
}
