
public class Return_Array {
	//Return Array
	public static int[] oddNumbers(int n) {
		int[] result = new int[n];
		
		for (int i=0; i<n; i++) {
			result[i]=(i*2) + 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] oddNum;
				
		oddNum = oddNumbers(10);
		System.out.println("The First 10 odd Number");
		
		for(int num: oddNum) {
			System.out.print(num+" ");
		}
	}
}