package newassignment;

import java.util.Scanner;

public class MaxMin {


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter the elements of array ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			
		}
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<size;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Min :"+min);
		System.out.println("Max :"+max);

	}
}

