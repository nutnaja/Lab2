package rmuti.Lab2_1;
import java.util.Arrays;

public class TestArrayUtil {
	public static void main(String[] args) {

		ArrayUtil b = new ArrayUtil(new int[]{1,2,3,4,5,1});
		int sum = b.sumArray();
		int n = b.countOne();
		int[] r = b.findOne();
		int[] t = b.doubleArray();
		
		System.out.println("sum is " +sum);
		
		System.out.println("countone is "+n);
		
		System.out.println("findone is "+Arrays.toString(r));
		
		System.out.println("doublearray is "+Arrays.toString(t));
			
		}
	}