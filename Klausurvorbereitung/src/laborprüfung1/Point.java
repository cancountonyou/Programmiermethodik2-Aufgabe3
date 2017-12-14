package laborprüfung1;

public class Point {
	public int x;
	public int y;
	public int z;

	public Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	// 1.1
	@Override
	public boolean equals(Object punkt) {
		if (x == this.x && y == this.y && z == this.z) {
			return true;
		} else {
			return false;
		}
	}
	public static void main (String[] args) {
		
		
	}
	
}