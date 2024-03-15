
public abstract class ConsumableItem extends Item implements Consumable {
	
	protected int numUses;
	
	protected ConsumableItem(int itemID, String description, double weight, int numUses) {
		super(itemID, description, weight);
		this.numUses = numUses;
	}

	public int getNumUses() {
		return numUses;
	}
}
