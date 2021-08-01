package eg1;

import java.util.Scanner;

public class removedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,first,last;
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
        System.out.println("After Removing the Digits which has first and last value is same:");
        for (int i = 0; i < n; i++) 
        {
        	while(a[i]>=10)
        	{
        		a[i]/=10;
        	}
        	first=a[i];
        	a[i]=temp[i];
        	last=a[i]%10;
        	if(first==last)
        	{
        		continue;
        	}
        	else
        	{
        		System.out.print(temp[i] + " ");
        	}
        	
        }

	}

}
