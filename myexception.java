package pack1;

public class myexception extends Exception{
	myexception(){}
	
	myexception(String s){
		
		super(s);
	}
	

} class ExceptionDemo{
	
	public void mymethod() throws myexception{
		
		if(<some condition>)
		{
			
			throw new myexception();
		}
		
	}

	public static void main(String args[]){
		
		try {
			
			ExceptionDemo e = new ExceptionDemo();
			e mymethod();
		}
		}
	catch (myexception e){
		
		
	}
}


