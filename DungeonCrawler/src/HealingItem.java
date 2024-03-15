
public class HealingItem extends ConsumableItem {
	
	private double healAmount;
	
	protected HealingItem(int itemID, String description, double weight, int numUses, double healAmount) {
		super(itemID, description, weight, numUses);
		
		this.healAmount = healAmount;
	}
	
	@Override
	public void use(Entity target) {
		target.increaseHealth(healAmount);
		numUses--;
	}
	
	public double getHealAmount() {
		return healAmount;
	}

}
