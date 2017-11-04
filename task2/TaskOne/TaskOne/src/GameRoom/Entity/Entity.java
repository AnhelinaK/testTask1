package GameRoom.Entity;

import GameRoom.Toys.SizeOfToys;
import GameRoom.Toys.TypeOfToys;

public class Entity {
	private int cost;
	private TypeOfToys type;
	private SizeOfToys size;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		
		return type.toString();
	}

	public void setType(String choose) {
		
		TypeOfToys tot = TypeOfToys.valueOf(choose);
		this.type = tot;
	}

	public void setSize(String choose) {
		SizeOfToys sot = SizeOfToys.valueOf(choose);
		this.size = sot;
	}

	public String getSize() {
		
		return size.toString();
	}

	@Override
	public String toString() {
		return "Entity [cost=" + cost + ", type=" + type + ", size=" + size + "]";
	}

	public Entity() {

	}

	public Entity(int cost, String size, String type) {
		this.cost = cost;
		TypeOfToys tot = TypeOfToys.valueOf(type);
		this.type = tot;
		SizeOfToys sot = SizeOfToys.valueOf(size);
		this.size = sot;
	}

}
