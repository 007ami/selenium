package Pack91;

import java.util.Scanner;

public class BubbleShot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array");
		int size =sc.nextInt();
		int a[]= new int[size];
		System.out.println("Give the Element");
		for (int i = 0; i<size; i++) {
			a[i]=sc.nextInt();
		}
         for(int k:a){
        	 System.out.println(k);
         }
         for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]< a[j]) {
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
         for (int i : a) {
			System.out.println(i);
		}	
         
	}
	

}
