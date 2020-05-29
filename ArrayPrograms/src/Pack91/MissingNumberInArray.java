package Pack91;
import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		// one missing number
		printMissingNumber(new int[] {1,2,3,4,6},6);
		// two missing number
		printMissingNumber(new int[] {1,2,3,4,6,7,9,8,10},10);
		//three
		printMissingNumber(new int[] {1,2,3,4,6,9,8},10);
		//four
		printMissingNumber(new int[] {1,2,3,4,9,8},10);
		
		printMissingNumber(new int[] {1,2,3,4,9,8},100);
	}

	private static void printMissingNumber(int[] numbers, int count) {
		// TODO Auto-generated method stub
		int missingcount= count-numbers.length;
		BitSet bitSet= new BitSet(count);
		for(int number : numbers) {
			bitSet.set(number-1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),count);
		int lastMissingIndex= 0;
		for(int i=0; i < missingcount; i++) {
			lastMissingIndex=bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
		
		/*private static int getMissingNumber(int[] numbers, int totalcount) {
        int expectedSum = totalcount* ((totalcount+1)/2);
        int actualSum = 0;
        for(int i : numbers) {
        	actualSum+=i;
        }
		
        return expectedSum-actualSum;	
	}*/

}
