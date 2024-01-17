package Program12;

public class Driver {
	private static StackList sL;
	private static QueueList qL;
	
	public static void main(String a[]) {
		String[] file = {"Bill" , "Fred", "Joe", "Henrietta", "Mr. M", "Noman"};
		//"add" the following Strings to each list in the following order:
		//"Bill" , "Fred", "Joe", "Henrietta", "Mr. M", "Noman"
		//printout--by using the appropriate method calls to the Lists-- the above names
		
		//Instantiate the StackList and QueueList
		sL = new StackList();
		qL = new QueueList();
		
		for(int i=0; i<file.length; i++) {
			sL.push(file[i]);
			qL.enqueue(file[i]);
		}
		
		System.out.println("sL is empty? " + sL.isEmpty());
		System.out.println("qL is empty? " + qL.isEmpty());
		print();
		System.out.println(sL.pop());
		System.out.println(qL.dequeue());
		print();
		System.out.println(sL.push("Amit"));
		System.out.println(qL.enqueue("Singh"));
		print();
		System.out.println(sL.search("Amit"));
		System.out.println(qL.getBack());
		System.out.println(qL.getFront());
		print();
	}
	
	private static void print() {
		System.out.println(sL.toString());
		System.out.println(qL.toString());
	}
}
