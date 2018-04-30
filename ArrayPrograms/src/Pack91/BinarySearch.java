package Pack91;

import java.util.Scanner;

public class BinarySearch {
	static int bsrc(int a[], int search){
		int first=0;
		int last=a.length;
		while (first<last){
			int mid=(first+last)/2;
			if(search<a[mid]){
			last=mid;
			}
		else if (search>a[mid]){
			first+=1;
		}
		else
		{
		return mid;	
		}
	}
		return -1;
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Size of array");
		int size= scan.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the element");
		for (int i = 0; i <size; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Display array element");
		for (int i : a) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("Enter search Element");
		int search= scan.nextInt();
		int pos= bsrc(a, search);
		if(pos == -1){
			System.out.println("Not found");
		}
		else{
			System.out.println("Element is found at " + pos);
		}
	}

}
