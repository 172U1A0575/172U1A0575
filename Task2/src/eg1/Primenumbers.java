package eg1;

import java.util.Scanner;

public class Primenumbers {
	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println("Prime Numbers:");
        for(int i=0;i<n;i++)
        {
        	int j=2;
        	int p=1;
        	while(j<a[i])
        	{
        		if(a[i]%j==0)
        		{
        			p=0;
        			break;
        		}
        		j++;
        	}
        	if(p==1)
        	{
        		System.out.println(a[i] + " ");
        	}
        }
	}
}
