
public class DamagingItem extends ConsumableItem {
	
	private double damageAmount;
	
	protected DamagingItem(int itemID, String description, double weight, int numUses, double damageAmount) {
		super(itemID, description, weight, numUses);
		
		this.damageAmount = damageAmount;
	}
	@Override
	public void use(Entity target) {
		target.decreaseHealth(damageAmount);
		numUses--;
	}
	
	public double getDamageAmount() {
		return damageAmount;
	}

}
