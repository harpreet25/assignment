package pack1;

import java.io.*;  
class reader_file{  
 public static void main(String args[])throws Exception{  
  FileReader fr=new FileReader("name.txt");  
  int i;  
  while((i=fr.read())!=-1)  
  System.out.println((char)i);  
  
  fr.close();  
 }  
}  