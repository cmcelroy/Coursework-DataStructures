/* ***************************************************
 * Chris McElroy
 * 10/25/19
 * Queue
 *
 * The Program builds upon the Generic LinkList program to operate as a Queue
 *************************************************** */
public class Queue<qU>
{
	private List<qU> l;
	
	//constructors
	public Queue()
	{
		l = new List<qU>();
		
	}
	
	public Queue(Queue<qU> s)
	{
		l = new List<qU>(s.l);
		l.First();
	}
	
	//Enqueue
	public void Enqueue(qU data)
	{
		l.Last();
		l.InsertAfter(data);
	}
	
	//Dequeue
	public qU Dequeue()
	{
		l.First();
		l.GetValue();
		l.Remove();
		return l.GetValue();
		
	}
	
	//Peek
	public qU Peek()
	{
		l.First();
		return l.GetValue();
	}
	
	//Size
	public int Size()
	{
		return l.GetSize();
	}
	
	//IsEmpty
	public boolean IsEmpty()
	{
		return l.IsEmpty();
	}
	
	//IsFull
	public boolean IsFull()
	{
		return l.IsFull();
	}
	
	//Equals
	public boolean Equals(Queue<qU> s)
	{
		return l.Equals(s.l);
	}
	
	//Add
	public Queue<qU> Add(Queue<qU> s)
	{
		Queue<qU> t = new Queue<qU>(this);
		t.l = t.l.Add(s.l);
		return t;
	}
	
	//Printing the stack
	public String toString()
	{
		return l.toString();
	}

}