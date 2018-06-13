package inheritance;

public class Overloading {
	
	
	public void Print()
	{
		System.out.println("in null argument print");
	}
	
	public void Print(int integer)
	{
		System.out.println("in integer argument print");
	}
	
	public void Print(float Float)
	{
		System.out.println("in float argument print");
	}

	public static void main(String[] args) {
		
		Overloading obj =new Overloading();
		obj.Print();
		obj.Print(45);
		obj.Print(7.45f);
		
	}

}