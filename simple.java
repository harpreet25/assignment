package pack1;
import java.io.FileOutputStream;
import java.util.Scanner;

public class simple {
	 public static void main(String args[]){  
		 String path;
		 Scanner sc;
		 int i,rollno;
		 byte b[];
		 byte c[];
		  try{  
	System.out.println("enter the path");
	sc=new Scanner(System.in);
	path=sc.next();
	FileOutputStream fout=new FileOutputStream(path);

	System.out.println("enter the name/n");
	String name = sc.next();
	
	System.out.println("enter the rollno/n");
	rollno=sc.nextInt();
	b=name.getBytes();
	
	fout.write(b);
	fout.write((int)rollno);
	
		   fout.close();
		   System.out.println("success");
		  }catch(Exception e){System.out.println(e);}  
		  System.out.println("success");
	 }

	 
}
