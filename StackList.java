package Program12;

import java.util.ArrayList;

/**
 * Team : 1
 * Members: Jackson Amick, Alex Ge, Shane Blackenship, Amit Singh
 * Date: 1/17/2024
 * Class: APCSA
 * Teacher: Mr. Meinzen
 * Description: Creates a StackList class that implements the interface
 * 		Stack and uses the LinkedList class. The StackList class holds the
 * 		list of nodes in the LinkedList which are only affected by the 
 * 		implemented methods of the Stack interface.
 */
public class StackList implements Stack{
	private LinkedList list;
	
	/**
	 * The StackList() method is a constructor method that 
	 * instantiates the field variable list.
	 */
	public StackList() {
		list = new LinkedList();
	}
	
	@Override
	/**
	 * The isEmpty() method uses the isEmpty() method from the list
	 * to check if the list is empty.
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	/**
	 * The push() method adds the Object parameter e to the front of
	 * the field variable list.
	 */
	public Object push(Object e) {
		list.addFront(e);
		return e;
	}
	
	@Override
	/**
	 * The pop() method takes out the node from the front of the list
	 * and gives the Object from the node that was taken out.
	 */
	public Object pop() {
		if(list.isEmpty()) return null;
		return list.getFront();
		
	}
	
	@Override
	/**
	 * The peek() method takes a look at the object in the front of the list
	 * without taking away the node.
	 */
	public Object peek() {
		Object tempE = list.getFront();
		list.addFront(tempE);
		return tempE;
	}

	@Override
	/**
	 * The search method look through the list until it finds the Object e. It
	 * gives the position, which is from the start (1) to the end (n). If the
	 * object e is not found, then the method gives -1.
	 */
	public int search(Object e) {
		//Temporary LinkedList to hold values taken from list
		LinkedList tempList = new LinkedList();
		//Tracks position in the list
		int counter = 0;
		//Temporary Object that holds value of the object taken from the list
		Object tempE= new Object();
	
		boolean isFound = false;
		//A while look that loops until the Object e is found 
		//and there are objects in the list
		while(!isFound) {		
			//Update counter and grab Object from list
			counter++;
			tempE = list.getFront();
			if(tempE!=null) {isFound = true; counter = -1;}
			else {
				if(tempE.equals(e)) { isFound = true;}
				//Adds the Object taken from list into the temporary list
				tempList.addFront(tempE);
			}
		}
		
		//Add the objects taken from list back
		Object tempReturn = tempList.getFront();
		while(tempReturn!=null) {
			list.addFront(tempReturn);
			tempReturn = tempList.getFront();
		}
		
		return counter;
	}
	
	/**
	 * The toString() method calls the toString() method
	 * in the list and gives the string given from the 
	 * toString() method in the list.
	 */
	public String toString() {
		return list.toString();
	}
}
