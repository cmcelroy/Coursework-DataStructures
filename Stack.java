/* ***************************************************
 * Chris McElroy
 * 10/25/19
 * Stack
 *
 * The Program builds upon the Generic LinkList program to operate as a Stack
 *************************************************** */

public class Stack<sT>
{
	private List<sT> l;
	
	//constructors
	public Stack()
	{
		l = new List<sT>();
	}
	
	public Stack(Stack<sT> s)
	{
		l = new List<sT>(s.l);
		//Left most is the top
		l.First();
	}
	
	//Push
	public void Push(sT data)
	{
		l.First();
		l.InsertBefore(data);
	}
	
	//Pop
	public sT Pop()
	{
		l.First();
		l.GetValue();
		l.Remove();
		
		return l.GetValue();
	}	

	//Add
	public Stack<sT> Add(Stack<sT> s)
	{
		Stack<sT> t = new Stack<sT>(this);
		t.l = l.Add(s.l);
		return t;
	}  

	//Equals
	public boolean Equals(Stack<sT> s)
	{
		return l.Equals(s.l);
	}
	
	//Size
	public int Size()
	{
		return l.GetSize();
	}
	
	//Peek
	public sT Peek()
	{
		l.First();
		return l.GetValue();
	}
	
	//isempty
	public boolean IsEmpty()
	{
		return l.IsEmpty();
	}
	
	//IsFull
	public boolean IsFull()
	{
		return l.IsFull();
	}
	
	//Printing the stack
	public String toString()
	{
		return l.toString();
	}

}