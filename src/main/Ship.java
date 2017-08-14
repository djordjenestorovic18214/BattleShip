package main;

import java.util.LinkedList;

public class Ship {
	private int size;
//	private boolean isVertical;
	private Position[] positions;
	private boolean isDestroyed;

	public Ship(LinkedList<Position> listOfPositions, int shipSize, boolean isVertical) {
		size = shipSize;
//		this.isVertical = isVertical;
 		positions = new Position[size];
 		for (int i = 0; i < size; i++) {
 			positions[i] = listOfPositions.get(i);
		}
 		setDestroyed(false);
	}

	public Position[] getPositions() {
		return positions;
	}
	
	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}
}
