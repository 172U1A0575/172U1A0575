package eg1;

import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        int j=0;
        for(int i=0;i<n-1;i++)
        {
        	if (a[i]!=a[i+1]) {
        		a[j++]=a[i];
        	}
        }
        a[j++]=a[n-1];
        n=j;
        System.out.println("After Removing Duplicates:");
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+ " ");
        }

	}

}
