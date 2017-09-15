package main;

import java.io.Serializable;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Position implements Serializable {
	private JButton field;
	private String name;
	private boolean busy;
	private boolean placed;
	private boolean hit;
	private int column;
	private int row;

	public Position(JButton button) {
		field = button;
		name = button.getName();
		column = Integer.parseInt(name.substring(4,5));
		if(button.getName().substring(3,4).contains("_"))
			{row = Integer.parseInt(button.getName().substring(4,5));
		column = Integer.parseInt(name.substring(5,6));
			}
		else
			row = Integer.parseInt(button.getName().substring(3,4));
		hit = false;
		busy = false;
		placed = false;
	}
	
	public JButton getField() {
		return field;
	}
	public String getName() {
		return name;		
	}
	
	public int getColumn() {
		return column;		
	}
	
	public int getRow() {
		return row;		
	}	
	
	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

}
