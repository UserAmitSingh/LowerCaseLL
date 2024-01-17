package Program12;

/**
 * Team : 1
 * Main Contributor: Amit Singh
 * Members: Jackson Amick, Shane Blackenship, Alex Ge, Amit Singh
 * Date: 1/17/2024
 * Class: APCSA
 * Teacher: Mr. Meinzen
 * Description: Creates a QueueList class that implements the interface
 * 		Queue and uses the LinkedList class. The QueueList class holds the
 * 		list of nodes in the LinkedList which is only affected by the 
 * 		implemented methods of the Queue interface.
 */
public class QueueList implements Queue{
	private LinkedList list;
	
	/**
	 * The QueueList() method is a constructor method that
	 * instantiates the LinkedList field variable list.
	 */
	public QueueList() {
		list = new LinkedList();
	}
	
	@Override
	/**
	 * The isEmpty() method calls the isEmpty() method from the list
	 * which checks if the list is empty.
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	/**
	 * The dequeue() method takes the node out in the front and 
	 * gives the object from the node that was taken out.
	 */
	public Object dequeue() {
		if(list.isEmpty()) return null;
		return list.getFront();
	}
	
	@Override
	/**
	 * The enqueue() method adds a new node to the back of 
	 * the list with the Object e.
	 */
	public Object enqueue(Object e) {
		list.addBack(e);
		return e;
	}
	
	@Override
	/**
	 * The getBack() method gets the object from the back of 
	 * the list without deleting the node.
	 */
	public Object getBack() {
		if(list.isEmpty()) return null;
		Object tempE = list.getBack();
		list.addBack(tempE);
		return tempE;
	}
	
	@Override
	/**
	 * The getFront() method gets the object from the front
	 * without deleting the node.
	 */
	public Object getFront() {
		if(list.isEmpty()) return null;
		Object tempE = list.getFront();
		list.addFront(tempE);
		return tempE;
	}
	
	/**
	 * The toString() method return the String from the
	 * toString() method in the list.
	 */
	public String toString() {
		return list.toString();
	}
}
