/**
 * Prof. Philipp Jenke
 * Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 */
package labor13;

/**
 * Implementierung des Interfaces Node mit einem Array als Container f�r die
 * Kinder. Jeder GenericNode hat als Bezeichner ein Zeichen, das im Konstruktor
 * gesetzt wird.
 * 
 * @author Philipp Jenke
 * 
 */
public class GenericNode implements Node {

	/**
	 * Konstante f�r die maximale Anzahl von Kindknoten.
	 */
	protected final int MAX_NUMBER_OF_CHILDREN = 5;

	/**
	 * Container f�r die Referenzen auf die Kindkonten.
	 */
	private final Node[] children;

	/**
	 * Anzahl der Kinder im children Array.
	 */
	private int numberOfChildren;

	/**
	 * Bezeichner f�r den Knoten.
	 */
	private final char character;

	public GenericNode(char character) {
		children = new Node[MAX_NUMBER_OF_CHILDREN];
		numberOfChildren = 0;
		this.character = character;
	}

	public char getCharacter() {
		return character;
	}

	@Override
	public Node getChild(int index) {
		if (index < 0 || index >= MAX_NUMBER_OF_CHILDREN) {
			return null;
		} else {
			return children[index];
		}
	}

	@Override
	public void addChild(Node child) {
		if (getNumberOfChildren() < MAX_NUMBER_OF_CHILDREN) {
			children[numberOfChildren] = child;
			numberOfChildren++;
		}
	}

	@Override
	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	@Override
	public String toString() {
		return "GenericNode " + getCharacter() + ", " + getNumberOfChildren() + " children.";
	}

	/**
	 * Main-Methode zum Testen der Funktionalit�t.
	 */
	public static void main(String[] args) {
		GenericNode nodeA = new GenericNode('A');
		GenericNode nodeB = new GenericNode('B');
		GenericNode nodeC = new GenericNode('C');
		GenericNode nodeD = new GenericNode('D');
		GenericNode nodeE = new GenericNode('E');
		nodeA.addChild(nodeB);
		nodeA.addChild(nodeC);
		nodeB.addChild(nodeD);
		nodeD.addChild(nodeE);
		System.out.println(nodeA);
		System.out.println(nodeB);
		System.out.println(nodeC);
		System.out.println(nodeD);
		System.out.println(nodeE);
	}
@Override
	public Node getParent() {
		return null;
	}

	@Override
	public Node SetParent(Node parent) {
		return null;
	}
}
