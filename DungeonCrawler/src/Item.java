
public abstract class Item {
	
	protected int itemID;
	protected String description;
	protected double weight;
	
	protected Item(int itemID, String description, double weight) {

		this.itemID = itemID;
		this.description = description;
		this.weight = weight;
	}

	public int getItemID() {
		return itemID;
	}

	public String getDescription() {
		return description;
	}

	public double getWeight() {
		return weight;
	}
	
}
