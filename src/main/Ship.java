package main;

import java.util.ArrayList;

public class Ship {
	private int size;
	private char orientation;// h/v
	private Position initialIndex;
	private Position[] positions;
	private boolean destroyed;

	public Ship(int size, char orientation, Position initial) {
		this.size = size;
		this.orientation = orientation;
		this.initialIndex = initial;

		positions = new Position[size];
		for (int i = 0; i < positions.length; i++) {
			Position position;
			if (orientation == 'h') {
				positions[i] = new Position(initial.getRow(), initial.getColum() + i);
			} else {
				positions[i] = new Position(initial.getRow() + i, initial.getColum());
			}
		}

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
