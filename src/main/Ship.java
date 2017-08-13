package main;

import java.util.ArrayList;

public class Ship {
	private int size;
	private boolean isVertical;
	private Position initialIndex;
	private Position[] positions;
	private boolean destroyed;

	public Ship(int size, boolean isVertical, Position initial) {
		this.size = size;
		this.isVertical = isVertical;
		this.initialIndex = initial;

		positions = new Position[size];
//		for (int i = 0; i < positions.length; i++) {
//			Position position;
//			if (!isVertical) {
//				positions[i] = new Position(initial.getRow(), initial.getColum() + i);
//			} else {
//				positions[i] = new Position(initial.getRow() + i, initial.getColum());
//			}
//		}

	}

	public boolean isDestroyed() {
		for (int i = 0; i < positions.length; i++) {
			if (positions[i].isHit() == false) {
				return false;
			}
		}
		return true;
	}
}
