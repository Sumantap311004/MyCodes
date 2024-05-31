
public class Swap_Array {
	//Swap Array
	public static void swap(int[] n, int idx1, int idx2) {
		int value = n[idx1];
		n[idx1] = n[idx2];
		n[idx2] = value;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Passing Arrays
		int []num = {7, 8};
		System.out.println("Value num[0]="+num[0]+" and Value num[1]="+num[1]+", Before Swap");
		swap(num, 0, 1);
		System.out.println("Value num[0]="+num[0]+" and Value num[1]="+num[1]+", After Swap");
	}

}
