package laborprüfung1;

public class PointWithName extends Point {
	private String name;

	public PointWithName(int x, int y, int z, String name) {
		super(x,y,z);
		this.name = name;
		
	}

	public String getName() {
		if (name == "" || name == null) {
			throw new IllegalArgumentException();
		} else {
			return name;
		}
	}
	@Override
	public String toString(){
		String ausgabe = name + ": " + (double) (x) + ", " + (double) (y) + ", " + (double) (z);
		return ausgabe;
	}

}
