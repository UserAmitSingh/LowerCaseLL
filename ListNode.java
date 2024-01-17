package Program12;

/**
 * Team : 1
 * Members: Jackson Amick, Alex Ge, Shane Blackenship, Amit Singh
 * Date: 1/17/2024
 * Class: APCSA
 * Teacher: Mr. Meinzen
 * Description: Creates a ListNode class that holds an object and another
 * 		ListNode.
 */
public class ListNode 
{
	
	//Field Variables
	private Object element;
	private ListNode next;
	
	/**
	 * The ListNode() method is a constructor method that
	 * instantiates the field variables element and next.
	 */
	public ListNode(Object e, ListNode n) 
	{
		element = e;
		next = n;
	}
	
	/**
	 * The getElement() method is a method that
	 * gives the field variable element.
	 */
	public Object getElement() {return element;}
	
	/**
	 * The getNext() method is a method that
	 * gives the field variable next.
	 */
	public ListNode getNext() {return next;}
	
	/**
	 * The setElement() method is a method that
	 * sets the value of the field variable element
	 * with the Object parameter e.
	 */
	public void setElement(Object e) {element = e;}
	
	/**
	 * The setNext() method is a method that
	 * sets the value of the field variable next
	 * with the ListNode parameter n.
	 */
	public void setNext(ListNode n) {next = n;}
}
