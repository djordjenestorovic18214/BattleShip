package main;

public class Position {
	private int column;
	private int row;
	private boolean hit=false;

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public int getColum() {
		return column;
	}

	public void setColum(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public Position(int row,int column) {
		this.column = column;
		this.row = row;
	}
}
