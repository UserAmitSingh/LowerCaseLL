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
	public boolean isEmpty();
	public Object dequeue();
	public Object enqueue(Object e);
	public Object getBack();
	public Object getFront();
}
