
public class Weapon extends Item {

	private double atkValue;
	
	protected Weapon(int itemID, String description, double weight, double atkValue) {
		super(itemID, description, weight);
		this.atkValue = atkValue;
	}
	
	public void attack(Entity target) {
		target.decreaseHealth(atkValue);
	}

	public double getAtkValue() {
		return atkValue;
	}

	public void setAtkValue(double atkValue) {
		this.atkValue = atkValue;
	}
	
}
