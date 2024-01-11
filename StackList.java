package Program12;

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
		LinkedList t2 = new LinkedList();
		int counter = 0;
		
		boolean isFound = false;
		while(!isFound) {
			counter++;
			Object tempE = list.getFront();
			t2.addFront(tempE);
			if(tempE.equals(e)) isFound = true;
		}
		
		for(int i = counter; i > 0; i--) {
			list.addFront(t2.getBack());
		}
		
		if(counter == 0) return -1;
		return counter;
	}
	
}
