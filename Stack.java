package Program12;

/**
 * Team : 1
 * Members: Jackson Amick, Alex Ge, Shane Blackenship, Amit Singh
 * Date: 1/17/2024
 * Class: APCSA
 * Teacher: Mr. Meinzen
 * Description: A intercface that has that includes the methods isEmpty(),
 * 		push(), pop(), peek(), and search().
 */
public interface Stack {
	public boolean isEmpty();
	public Object push(Object e);
	public Object pop();
	public Object peek();
	public int search(Object e);
}
