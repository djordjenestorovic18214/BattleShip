package main;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Ship> StartingPosition=new ArrayList<Ship>();
	private int winCounter;
	
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
