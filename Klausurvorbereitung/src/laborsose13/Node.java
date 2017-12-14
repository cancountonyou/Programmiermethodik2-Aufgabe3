package laborsose13;

public interface Node {

		/**
		 * Hinzuf�gen eines zus�tzlichen Kindes.
		 * 
		 * @param child
		 *            Knoten, der als Kind zugef�gt wird.
		 */
		public void addChild(Node child);

		/**
		 * Liefert die aktuelle Anzahl der Kinder (nicht die maximal m�gliche
		 * Anzahl) zur�ck.
		 * 
		 * @return Anzahl der Kinder.
		 */
		public int getNumberOfChildren();

		/**
		 * Liefert den Knoten an dem gegebenen Index zur�ck.
		 * 
		 * @param index
		 *            Index des Kindes, das zur�ckgeliefert wird.
		 * 
		 * @return Knoten an dem gegebenen Index. null, falls der Index ung�ltig
		 *         ist.
		 */
		public Node getChild(int index);

	}


