package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		Room[] vect = new Room[10];

		System.out.print("How many rooms will be rented? ");
		int quantityRoom = ler.nextInt();

		for (int i = 1; i <= quantityRoom; i++) {
			ler.nextLine();
			System.out.println("Rent #" + i + ": ");
			System.out.print("Name: ");
			String guest = ler.nextLine();
			System.out.print("E-mail: ");
			String emailGuest = ler.nextLine();
			System.out.println("Room: ");
			int numberRoom = ler.nextInt();

			vect[numberRoom] = new Room(guest, emailGuest, numberRoom);
		}
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		ler.close();
	}

}
