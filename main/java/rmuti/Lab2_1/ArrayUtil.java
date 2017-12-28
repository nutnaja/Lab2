package rmuti.Lab2_1;

public class ArrayUtil {
	private int[] arr;
	
	public ArrayUtil(int[] a) {
		arr = a;
	}
	public int sumArray() {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum + arr[i];
			}
		return sum;
	}
	public int countOne() {
		int n = 0;
		for(int i = 0;i<arr.length;i++) {
			int count =arr[i]; 
			if(count==1){
				n++;
				}
			}
		return n ;
	}
	public int[] findOne() {
		int n = countOne();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = 1;
		}
		return arr;
	}
	public int[] doubleArray() {
		int n = arr.length *2;
		int a[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			a[i] = arr[i];
		}
		return a;
	}
 }