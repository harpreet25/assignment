package pack1;

import java.util.Scanner;

public class tables {
	int num,i,n;
	public void display()
	{
		System.out.println("enter n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			num=n*i;
			System.out.println(n+"*"+i+"="+num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tables oo=new tables();
		oo.display();
	}

}
