package laborsose13;

public class PointName extends Point {
private String name;

	public PointName(double x, double y, double z, String name) throws IllegalArgumentException {
		super(x, y, z);
		this.name = name;
		if( this.name == null || this.name =="" ){
			throw new IllegalArgumentException("Dieser Name ist unzulässig");
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + ": (" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
	}

}
