package GameRoom.Toys;

import java.util.Scanner;

import GameRoom.Entity.Entity;

public class Toys extends Entity {

	private Scanner cons;

	public Toys() {

	}

	@Override
	public String toString() {
		return "Toy [Price=" + this.getCost() + ", Type=" + this.getType() + ", Size=" + this.getSize() + "]";
	}

	public Toys(Toys toys) {
		this.setCost(toys.getCost());
		this.setSize(toys.getSize());
		this.setType(toys.getType());
	}

	public Toys(Integer cost, String size, String type) {
		super();
		this.setCost(cost);
		this.setSize(size);
		this.setType(type);

	}

	public Toys CreateToy() {     // Создание простой игрушки
		cons = new Scanner(System.in);
		int numb = 0;
		System.out.println(
				"----Choose the toy----\n1 - Small Boll  Pice=10$\n2 - Small Car   Pice=11$\n3 - Small Cube  Pice=12$\n4 - Small Doll  Pice=13$"
						+ "\n5 - Medium Boll Pice=14$\n6 - Medium Car  Pice=15$\n7 - Medium Cube Pice=16$\n8 - Medium Doll Pice=17$"
						+ "\n9 - Huge Boll   Pice=18$\n10 - Huge Car   Pice=19$\n11 - Huge Cube  Pice=20$\n12 - Huge Doll  Pice=21$\n"
						+ "Input number");

		numb = cons.nextInt();
		Toys toy = new Toys();
		switch (numb) {
		case 1:
			toy.setCost(10);
			toy.setSize("Small");
			toy.setType("Boll");
			break;
		case 2:
			toy.setCost(11);
			toy.setSize("Small");
			toy.setType("Car");
			break;
		case 3:
			toy.setCost(12);
			toy.setSize("Small");
			toy.setType("Cube");
			break;
		case 4:
			toy.setCost(13);
			toy.setSize("Small");
			toy.setType("Doll");
			break;
		case 5:
			toy.setCost(14);
			toy.setSize("Medium");
			toy.setType("Boll");
			break;
		case 6:
			toy.setCost(15);
			toy.setSize("Medium");
			toy.setType("Car");
			break;
		case 7:
			toy.setCost(16);
			toy.setSize("Medium");
			toy.setType("Cube");
			break;
		case 8:
			toy.setCost(17);
			toy.setSize("Medium");
			toy.setType("Doll");
			break;
		case 9:
			toy.setCost(18);
			toy.setSize("Huge");
			toy.setType("Boll");
			break;
		case 10:
			toy.setCost(19);
			toy.setSize("Huge");
			toy.setType("Car");
			break;
		case 11:
			toy.setCost(20);
			toy.setSize("Huge");
			toy.setType("Cube");
			break;
		case 12:
			toy.setCost(21);
			toy.setSize("Huge");
			toy.setType("Boll");
			break;

		}
		System.out.println("You choose " + toy.toString());
		return toy;

	}

}
