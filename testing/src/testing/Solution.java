package testing;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String[] s  = {"H","a","c","k","e","r"};
        for(int i=0; i<= s.length-1; i++) {
        	if(i%2==0) {
        		System.out.print(s[i]);
        	}
        	
        }
        System.out.print(" ");
        
        for(int j=1; j<s.length; j+=2) {
    		System.out.print(s[j]);
        }
        
    }
}