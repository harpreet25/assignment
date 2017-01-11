package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class append {
	
	public static void main(String args[]){  
		
		String name;
		Scanner sc;
		
		try{
			sc=new Scanner(System.in);
			name=sc.next();
			 File f1 = new File("append.txt");
			    f1.createNewFile();
			    
		         FileWriter fileWritter = new FileWriter(f1.getName(),true);
		         BufferedWriter bw = new BufferedWriter(fileWritter);
		         bw.write(data);
		         bw.close();
		         System.out.println("success");
			
		}
			
		
	
		
	}
	
}