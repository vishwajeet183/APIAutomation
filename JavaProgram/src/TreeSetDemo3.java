import java.util.TreeSet;

public class TreeSetDemo3
{

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet<>(new MyComparator1());
		t.add("vishu");
		//t.add("null");
		t.add("Jyoti");
		t.add("Rohini");
		t.add("vishu");
		System.out.println(t);
		
	}

}
