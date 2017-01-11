package pack1;


import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner; 
public class filehan  {
	 	public static void main(String args[]) 
   	{    
	       Date date = new Date();
	       Scanner sc=new Scanner(System.in);
	      	int n,i;
	       System.out.println("Enter the value of n");
	     	n=sc.nextInt();
	     	int rol[]=new int[n];
	       
	     	String str[]=new String[n];
	       FileWriter fw;
   	BufferedWriter bw; 
   	PrintWriter pw; 
   	try { 

    
   	fw = new FileWriter("D:/record.txt",true); 
   	bw = new BufferedWriter(fw); 
   	pw = new PrintWriter(bw);
   	pw.println("\n");
  	for(i=1;i<n;i++)
	  	{
	  		 
		System.out.println("Enter the Roll Number: ");
	  	
	rol[i]=sc.nextInt();
	
	}
   	for(i=1;i<n;i++)
   	{
   		System.out.println("Enter the Name: ");
   		str[i]=sc.nextLine();
   	}
   	 

   	
   	for(i=1;i<n;i++)
   	{
   		
   		pw.println(str[i]+" "+ rol[i]);
   		}
   
   	System.out.println(date.toString());
pw.println(date.toString());
   	System.out.println("success"); 
   	pw.flush();
   
   	}
   	catch (Exception io){
   		System.out.println("error");
   	}
   	

   	}
   	}