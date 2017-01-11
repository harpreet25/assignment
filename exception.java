package pack1;

public class exception {
	int num1=10, num2=0,res;
	public void acceptdet()
	{
		try {
		res=num1/num2;
		System.out.println("result is:"+ res);
		}
		catch (Exception e) {
			
			System.out.println("no can not be divided by 0");
		}
	}

	public static void main(String[] args)
	{
		exception oo = new exception();
		oo.acceptdet();
	}
}
 