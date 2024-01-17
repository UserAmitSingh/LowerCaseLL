package Program12;

/**
 * Team : 1
 * Members: Jackson Amick, Alex Ge, Shane Blackenship, Amit Singh
 * Date: 1/17/2024
 * Class: APCSA
 * Teacher: Mr. Meinzen
 * Description: A intercface that has that includes the methods isEmpty(),
 * 		dequeue(), enqueue(), getBack(), getFront().
 */
public interface Queue {
	/**
	 * Method that will check if the method is empty.
	 */
	public boolean isEmpty();
	/**
	 * Method that will take the node from the front of list.
	 */
	public Object dequeue();
	/**
	 * Method that will add to back of the list.
	 */
	public Object enqueue(Object e);
	/**
	 * Method that will get the Object from the back of the list
	 * without deleting a node.
	 */
	public Object getBack();
	/**
	 * Method that will get the Object from the front of the list
	 * without deleting a node.
	 */
	public Object getFront();
}
