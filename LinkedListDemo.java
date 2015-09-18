/**
* Code from Crunchify
*
* @author	Richard Dang
*
*/

public class LinkedListDemo
{
	public static void main ( String[] args )
	{
		LinkedListTest lList = new LinkedListTest();

		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("lList -print: " + lList);
		System.out.println("llist.size() -size: " + lList.size());
		System.out.println("lList.get(3) -get: " + lList.get(3));
		System.out.println("lList.remove(2) -remove: " + lList.remove(2));
		System.out.println("lList.get(3) -get: " + lList.get(3));
		System.out.println("lList.size() -size: " + lList.size());
		System.out.println("lList -print: " + lList);

	}
}
