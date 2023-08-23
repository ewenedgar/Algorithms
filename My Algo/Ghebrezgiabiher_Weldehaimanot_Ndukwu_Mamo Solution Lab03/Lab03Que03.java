package algorithm.lab03Q3;

public class Lab03Que03{

	private  int[] finalSortedArray;
	public  int[] sort(int[] arr){
		if (arr == null || arr.length == 0)
			return null;
		finalSortedArray = new int[arr.length];
		int zeros = 0, ones = 0, twos = 0, temp = 0;
		for (int i = 0 ; i < arr.length; i ++){
			temp = arr[i];
			if (temp == 0)
				zeros++;
			else if (temp == 1)
				ones ++;
			else
				twos ++;
		}
		print(0, zeros, finalSortedArray, 0);
		print(1, ones, finalSortedArray, zeros);
		print(2, twos, finalSortedArray, zeros+ones);
		return finalSortedArray;
	}
	
	private  void print(int number, int count, int[] arr, int startIndex){
		for (int i = 0; i < count; i++){
			arr[startIndex++] = number;
		}
	}
	public static void main(String[] args) {
		
		Lab03Que03 LQ = new Lab03Que03();
		int[] arr={0,0,1,2,2,2,1,0};
		int[]  finalSortedArray = LQ.sort(arr);
		for(int i =0; i< finalSortedArray.length; i++)
			System.out.print(finalSortedArray[i] + " ");
		
	}
}
