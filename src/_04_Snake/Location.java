package _04_Snake;

public class Location {

	int x;
	int y;
	
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
