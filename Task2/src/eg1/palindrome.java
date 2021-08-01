package eg1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        int temp[]=new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            temp[i]=a[i];
        }
        
        for(int i=0; i<n;i++) 
        {
        	int d=0,p=0;
        	while(a[i]>0)
        	{
        		d=a[i]%10;
        		p=p*10+d;
        		a[i]=a[i]/10;
        		
        	}
        	if(temp[i]==p)
        	{
        		System.out.println("palindrome" +temp[i]);
        	}
        }
        

	}

}
