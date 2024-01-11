package Program12;

import java.util.ArrayList;

public class StackList implements Stack{
	private LinkedList list;
	
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public Object push(Object e) {
		list.addFront(e);
		return null;
	}
	
	@Override
	public Object pop() {
		if(list.isEmpty()) return null;
		return list.getFront();
		
	}
	
	@Override
	public Object peek() {
		Object tempE = list.getFront();
		list.addFront(tempE);
		return tempE;
	}

	@Override
	public int search(Object e) {
		ArrayList<Object> tempO = new ArrayList();
		int counter = 0;
		
		boolean isFound = false;
		while(!isFound) {
			
			counter++;
			Object tempE = list.getFront();
			if(tempE==null) {isFound=true; counter=-1;}
			else {
				tempO.add(tempE);
				if(tempE.equals(e)) isFound = true;
			}
		}
		
		for(int i = 0; i < counter; i--) {
			list.addFront(tempO.get(i));
		}
		
		return counter;
	}
	
}
