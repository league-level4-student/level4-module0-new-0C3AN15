package _04_Snake;

public class Location  {

	int x;
	int y;
	
	public Location (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	boolean equals(int x2, int y2) {
		if(x2 == x && y2 == y) {
			return true;
		}
		return false;
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
}
