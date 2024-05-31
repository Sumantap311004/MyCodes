
public class Single_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Single Array
		final int numStd=4;
		double [] gpa = new double [numStd];
		String[] name = {"Andre", "Bunga", "Christine", "Deny"};
		
		for (int i=0; i<numStd;i++) {
			gpa[i]=3+((double)i/10);
		}
		
		System.out.printf("%-10s %4s\n", "Name", "GPA");
		for(int j=0; j<numStd; j++) {
			System.out.printf("%-10s %4.2f\n", name[j], gpa[j]);
		}

		


		//Biggest Number Searching
		double  myList[] = {4.00, 3.120, 3.78};
		double max = myList[0];
		for(int i=1; i<myList.length; i++) {
			if(myList[i]>max) {
				max = myList[i];
			}
		}
		System.out.println("Biggest Number is "+max);
		
		//Summarization
		double total =0;
		for(int i=0; i<myList.length;i++) {
			total += myList[i];
		}
		System.out.println("Total Number is "+total);

	}

}
