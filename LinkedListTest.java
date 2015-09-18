/**
*
* Code from Crunchify
*
* @author	Richard Dang
*
*
*/

public class LinkedListTest
{
	private Node head;
	private int listCount;

	public LinkedListTest()
	{
		head = new Node(null);
		listCount = 0;
	}

	public void add(Object data)
	{
		Node tempNode = new Node(data);
		Node currentNode = head;

		while (currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}

		currentNode.setNext(tempNode);
		listCount++;
	}

	public void add(Object data, int index)
	{
		Node tempNode = new Node(data);
		Node currentNode = head;

		for (int i = 0; i < index && currentNode.getNext() != null; i++)
		{
			currentNode = currentNode.getNext();
		}
		tempNode.setNext(currentNode.getNext());
		currentNode.setNext(tempNode);
		listCount++;
	}

	public Object get(int index)
	{
		if (index <= 0)
		{
			return null;
		}

		Node currentNode = head.getNext();
		for (int i = 1; i < index; i++)
		{
			if (currentNode.getNext() == null)
			{
				return null;
			}
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	public boolean remove(int index)
	{
		if (index < 1 || index > size())
		{
			return false;
		}

		Node currentNode = head;
		for (int i = 1; i < index; i++)
		{
			if (currentNode.getNext() == null)
			{
				return false;
			}
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(currentNode.getNext().getNext());
		listCount--;
		return true;
	}

	public int size()
	{
		return listCount;
	}

	public String toString()
	{
		Node currentNode = head.getNext();
		String output = "";
		while (currentNode != null)
		{
			output+= "[" + currentNode.getData().toString() + "]";
			currentNode = currentNode.getNext();
		}
		return output;
	}

}
