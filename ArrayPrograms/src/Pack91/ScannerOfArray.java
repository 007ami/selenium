package Pack91;

import java.util.Scanner;

public class ScannerOfArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Size of the Array");
		int size= scn.nextInt();
		int a[]= new int[size];
		System.out.println("Give Array Element");
		for(int i=0;i<size;i++){
			a[i]=scn.nextInt();
		}
        System.out.println("Give find Element");
        int No=scn.nextInt();
        for(int i:a){
        	if(i==No){
        		System.out.println("your No. is "+i);
        	}
        	//else
        	//{
        		//System.out.println("Element is not Available");
        //	}
        }
        //System.out.println("Displaying Array Element");
	    //for(int i:a){
	    	//System.out.println(i);
	    //}
	}
	

}
