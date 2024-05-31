
public class Wrong_Array_Duplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrong Array Duplication
		int [] sourceArray = {2, 3, 1, 5, 10};
		int [] targetArray = new int[5];
		targetArray = sourceArray;
		// targetArray = sourceArray.clone();
		//System.arraycopy(sourceArray, 3, targetArray, 0, 2);
		
		for(int i=0; i<5; i++) {
			System.out.print(targetArray[i]+" ");
		}
		
		sourceArray[0]=12;
		System.out.println();
		
		for (int i=0;i<5; i++) {
			System.out.print(targetArray[i]+" ");
		}
	}

}
