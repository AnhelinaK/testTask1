package GameRoom.Runner;

import java.util.Scanner;

import GameRoom.Toys.GameRoom;

public class Runner {
	Scanner cons;
	Integer amount = 0;

	public void RunProgram() {
		GameRoom gameRoom = new GameRoom();
		
		gameRoom.SetMoney(gameRoom);
		System.out.println("Input How much toys you need");
		cons = new Scanner(System.in);
		amount = cons.nextInt();
		for (int i = 0; i < amount; i++) {
			gameRoom.AddToy(gameRoom);
		}
		
		gameRoom.FindToysbyParameter(gameRoom);
		gameRoom.SortToysByPrice(gameRoom);
	}

	public static void main(String[] args) {
		Runner runner= new Runner();
		runner.RunProgram();
	}
}