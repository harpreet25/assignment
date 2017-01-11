package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFileExample {
   public static void main( String[] args ) { 
	 
      try { 
    	  
   String data= "himanshu";
   String data2= "boom";
   String data3= "harpreet";
   String data4= "harpreet";
  

    		
         File f1 = new File("append.txt");
         
            f1.createNewFile();
         
         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
  
		bw.write(data);
		bw.write(data2);
		bw.write(data3);
		bw.write(data4);
	
         bw.close();
         System.out.println("ok");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}