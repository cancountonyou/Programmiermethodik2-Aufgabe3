package labor13;

public class PointWithName extends Point{

	private String name;
	
	public PointWithName(double x, double y, double z, String name){
		super(x,y,z);
		this.name = name;
		if (name == null || name == " "){
			throw new IllegalArgumentException();
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + ": " + "(" + this.getX() + ","+ this.getY() +","+ this.getZ() + ");";

	}

	
	}

