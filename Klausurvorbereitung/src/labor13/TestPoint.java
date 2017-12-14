package labor13;

public class TestPoint {
public static void main (String[] args){
	
	Point point1 = new Point(1,2,3);
	Point point2 = new Point(1,2,3);
	Point point3 = new Point(3,4,5);
	System.out.println(point1.equals(point2));
	System.out.println(point1.equals(point3));
	PointWithName point4 = new PointWithName(5,6,7, "Hannah");
	System.out.println(point4);
}
}