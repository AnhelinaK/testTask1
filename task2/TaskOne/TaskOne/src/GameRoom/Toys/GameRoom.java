package GameRoom.Toys;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import GameRoom.Toys.Toys;

public class GameRoom {
	private Integer amount=0;
	private Scanner cons;
	ArrayList<Toys> listoftoys = new ArrayList<Toys>();
	

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void SetMoney(GameRoom gameroom) { // Количество денег на игрушки
		gameroom.getAmount();
		System.out.println("You current amount is " + gameroom.getAmount());
		System.out.println("Input How much money you need");
		cons = new Scanner(System.in);
		gameroom.setAmount(cons.nextInt());
		

	}

	public void AddToy(GameRoom gameroom) { // Добовление игрушки в комнату
		
		 Integer totalcostoftoys =0;
		 ListIterator<Toys> iter =  listoftoys.listIterator();
		 while (iter.hasNext()) {
				Toys t1 = new Toys(iter.next());
				totalcostoftoys = totalcostoftoys + t1.getCost();
				System.out.println(totalcostoftoys);
			}
		if (gameroom.getAmount() > totalcostoftoys) {
			Toys toy = new Toys();
			listoftoys.add(toy.CreateToy());
		} 
		else {
			System.out.println("Need more money!");
		}
	}
	public  void ToysInList(){ //Просмотр игрушек в комнате
		 ListIterator<Toys> iter =  listoftoys.listIterator();
		 while (iter.hasNext()) {
			 Toys t1 = new Toys(iter.next());
			 System.out.println("You have toys in list :" + t1.toString());
		 }
		
	}
	public void SortToysByPrice(GameRoom gameroom){ //Сортировки игрушек в комнате по цене
		
		listoftoys.sort( new Comparator<Toys>() {

			@Override
			public int compare(Toys o1, Toys o2) {
				 if (o1.getCost() == o2.getCost()) return 0;
	                else if (o1.getCost()> o2.getCost()) return 1;
	                else return -1;
			}
		});
		gameroom.ToysInList();
	}
	
	public void FindToysbyParameter(GameRoom gameroom){ //Сортировки игрушек в комнате по цене и типу  (Boll, Car, Cube, Doll)
		System.out.println("Input max price of toy");
		cons = new Scanner(System.in);
		int maxprice= cons.nextInt();
		System.out.println("Input max type of toy(Boll, Car, Cube, Doll)");
		cons = new Scanner(System.in);
		String typeoftoy= cons.nextLine();
		
		 ListIterator<Toys> iter =  listoftoys.listIterator();
		 
		 while (iter.hasNext()) {
			 Toys t1 = new Toys(iter.next());
			 
			 if((t1.getCost()<maxprice)&&(t1.getType().equals(typeoftoy))){
				
				 	System.out.println(" "+t1.toString() );
				 
			 }
			 
		 }
	}

}
