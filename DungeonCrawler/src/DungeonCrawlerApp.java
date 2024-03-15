import java.util.ArrayList;

public class DungeonCrawlerApp {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		
		HealingItem h = new HealingItem(0, "A", 3, 3, 5);
		DamagingItem d = new DamagingItem(1, "B", 3, 3, 5);
		Weapon w = new Weapon(2, "C", 3, 7);
		
		items.add(h); 
		items.add(d);
		items.add(w);
		
		for (Item t : items) {
			System.out.println("Desc: " + t.getDescription() + "\tID：" + t.getItemID());
		}
		
		Dummy dummy = new Dummy (100, 0, 0);
		
		System.out.println("Health: " + dummy.getCurrentHealth());
		d.use(dummy);
		System.out.println("Health: " + dummy.getCurrentHealth());
		w.attack(dummy);
		System.out.println("Health: " + dummy.getCurrentHealth());
		h.use(dummy);
		System.out.println("Health: " + dummy.getCurrentHealth());
	}

}
