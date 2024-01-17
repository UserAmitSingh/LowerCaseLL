package Program12;


/**
 * Team : 1
 * Members: Jackson Amick, Alex Ge, Shane Blackenship, Amit Singh
 * Date: 1/17/2024
 * Class: APCSA
 * Teacher: Mr. Meinzen
 * Description: Creates a LinkedList that uses the ListNode class
 * 		to create a connection of many connected nodes.
 */
public class LinkedList {
	//Field Variable
	private ListNode start;
	
	/**
	 * The isEmpty() method checks is the field variable start
	 * has no value, giving true if it has none and false otherwise.
	 */
	public boolean isEmpty() {
		return start == null;
	}
	
	/**
	 * The getFront() method gives nothing if the list is empty, and
	 * otherwise takes a ListNode out of the connection of nodes by
	 * making the field variable move up to next. It then gives the
	 * Object stored in the ListNode that was taken from the ListNode
	 * that was taken out of the connection.
	 */
	public Object getFront() {
		if(isEmpty()) return null;
		Object tempE = start.getElement();
		start = start.getNext();
		return tempE;
	}
	
	/**
	 * The getFront() method gives nothing if the list is empty, and
	 * otherwise takes a ListNode out of the connection of nodes by
	 * setting the next variable in the 2nd to last node in the connection 
	 * to nothing. It then gives the Object stored in the ListNode that 
	 * was taken from the ListNode that was taken out of the connection.
	 */
	public Object getBack() {
		if(isEmpty()) return null;
		//2 temporary nodes that will point at the last and 2nd last nodes
		ListNode tNode = start, tNode2 = start;
		//Continue until tNode reaches that last node
		while(tNode.getNext() != null) {
			tNode = tNode.getNext();
			//tNode will reach the last node, so this will stop before the last node
			//because the node after the last node is null.
			if(tNode.getNext()!=null) {
				tNode2 = tNode2.getNext();
			}
		}
		Object tempE = tNode.getElement();
		//Set next of 2nd to last node to null
		tNode2.setNext(null);
		
		return tempE;
	}
	
	/**
	 * The addFront() method adds a new connection to the front of the nodes by
	 * creating a new ListNode with the Object parameter e and a next that points 
	 * at the first node. It then makes the field variable start equal that new ListNode.
	 */
	public void addFront(Object e) {
		ListNode t = new ListNode(e,start);
		start = t;
	}

	/**
	 * The addBack() method adds a new node to the back of the connection
	 * of nodes.
	 */
	public void addBack(Object e) {
		if(isEmpty()) {start = new ListNode(e,null); return;}
		ListNode t = start;
		//Continue until the last element
		while(t.getNext() != null) {
			t=t.getNext();
		}
		//Make the last node point at a new node
		t.setNext(new ListNode(e,null));
	}
	
	/**
	 * The toString() method gives a String with all the Objects from the
	 * connection of nodes.
	 */
	public String toString() {		
		if(isEmpty()) return "";
		String message = "LinkList: " + (String)start.getElement();
		ListNode t = start.getNext();
		while(t != null) {
			message += " --> " + (String)t.getElement();
			t = t.getNext();
		}
		return message;
	}
}
