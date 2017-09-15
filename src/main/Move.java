package main;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Move implements Serializable {
	private Player player;
	private int indexRed;
	public int getIndexRed() {
		return indexRed;
	}
	public void setIndexRed(int indexRed) {
		this.indexRed = indexRed;
	}
	public int getIndexKolona() {
		return indexKolona;
	}
	public void setIndexKolona(int indexKolona) {
		this.indexKolona = indexKolona;
	}
	private int indexKolona;
	public Move(Position p){ 
		indexRed=p.getRow();
		indexKolona=p.getColumn();
		
	}
}
