package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test {
public static class test2{
	
	public static void show(){
		
		System.out.println("hello");
	}
}

	   public static void main(String args[]) throws IOException
	   {
		  InputStreamReader r=new  InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(r);
		  System.out.println(" eneter your name");
String name=br.readLine();
System.out.println(" welcome\t"+name);
test2.show();
}

}