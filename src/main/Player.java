package main;

import java.io.Serializable;
import java.util.LinkedList;

public class Player implements Serializable{
	private String name;
	public LinkedList<Ship> startingPosition = new LinkedList<Ship>();
//	private int winCounter;
	
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<Ship> getStartingPosition() {
		return startingPosition;
	}
	public void setStartingPosition(LinkedList<Ship> startingPosition) {
		this.startingPosition = startingPosition;
	}
}
