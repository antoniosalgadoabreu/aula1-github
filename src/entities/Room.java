package entities;

public class Room {

	private String guest;
	private String emailGuest;
	private int numberRoom;

	public Room(String guest, String emailGuest, int numberRoom) {
		this.guest = guest;
		this.emailGuest = emailGuest;
		this.numberRoom = numberRoom;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public String getEmailGuest() {
		return emailGuest;
	}

	public void setEmailGuest(String emailGuest) {
		this.emailGuest = emailGuest;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}
	
	public String toString() {
		return numberRoom
			   +": "
			   +guest
			   +", "
			   +emailGuest;
	}
}
