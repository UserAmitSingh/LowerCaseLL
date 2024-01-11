package Program12;

public class LinkedList {
	private ListNode start;
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public Object getFront() {
		if(isEmpty()) return null;
		Object tempE = start.getElement();
		start= start.getNext();
		return tempE;
	}
	
	public Object getBack() {
		if(isEmpty()) return null;
		ListNode tNode = start, tNode2 = tNode;
		while(tNode.getNext() != null) {
			tNode = tNode.getNext();
			if(tNode.getNext()!=null) {
				tNode2 = tNode2.getNext();
			}
		}
		Object tempE = tNode.getElement();
		tNode2.setNext(null);
		
		return tempE;
	}
	
	public void addFront(Object e) {
		ListNode t = new ListNode(e,start);
		start = t;
	}

	public void addBack(Object e) {
		ListNode t = start;
		while(t.getNext() != null) {
			t=t.getNext();
		}
		t.setNext(new ListNode(e,null));
	}
	
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
