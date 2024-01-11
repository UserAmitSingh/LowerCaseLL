package Program12;

public class QueueList implements Queue{
	private LinkedList list;
	
	public QueueList() {
		list = new LinkedList();
	}
	
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public Object dequeue() {
		if(list.isEmpty()) return null;
		return list.getFront();
	}
	
	@Override
	public Object enqueue(Object e) {
		list.addBack(e);
		return e;
	}
	
	@Override
	public Object getBack() {
		if(list.isEmpty()) return null;
		Object tempE = list.getBack();
		list.addBack(tempE);
		return tempE;
	}
	
	@Override
	public Object getFront() {
		if(list.isEmpty()) return null;
		Object tempE = list.getFront();
		list.addFront(tempE);
		return tempE;
	}
	
	public String toString() {
		return list.toString();
	}
}
