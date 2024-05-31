package session3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		//array
		int[] numbers = new int[10];
		numbers[5] = 10;
		
		System.out.println("array numbers index ke-5: " +numbers[5]);
		
		//buat lgsg inisialisasiin array kek gni
		int[] numbers2 = new int[] {2, 4, 6, 8};
		
		System.out.println("array numbers2 index ke-2: " +numbers2[2]);
		System.out.println("panjang array numbers2: " +numbers2.length);
		
		//kalo string brarti lgsg string[] aja
		
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] += 7; 
		}
		
		//foreach -> to loop through collections
		//kalo mau ubah isi array gabisa pake foreach
		for (int i : numbers2) {
			System.out.println(i);
		}
		
		//.clone -> membuat deep copy dari suatu array/object
		int[] numbers3 = numbers2.clone();
		numbers2[2] = 99;
		//jd meski diubah si numbers2 array 2 nya di numbers3 ga keubah
		
		System.out.println("numbers3: ");
		for (int i : numbers3) {
			System.out.println(i);
		}
		
		int[][] distanceMap = new int[5][5];
		for (int i = 0; i < distanceMap.length; i++) {
			for (int j = 0; j < distanceMap.length;j++) {
				if (i == 0 || j == 0 || i == distanceMap.length -1 || j == distanceMap[i].length -1) {
					distanceMap[i][j] = 1;
				}else {
					distanceMap[i][j] = 0;
				}	
			}
		}
		
		for (int[] is : distanceMap) {
			for (int i : is) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		ArrayList<String> names = new ArrayList<>();
		names.add("duridam");
		names.add("hoammm");
		
		System.out.println("total nama ada: " +names.size());
		
		for (int i = 0; i < names.size(); i++) {
			//cara 1 print nama
//			System.out.println(names);
			
			//buat nambahin gelar gt
			names.set(i, names.get(i) + " S.Kom.");
			//cara 2 print nama
			System.out.println(names.get(i));
		}
		
		//cara 3 print nama
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		//vektor
		//dia mau isi di <> nya tu classny gt (String, Integer) gabisa kek int
		Vector<Integer> numberVector = new Vector<>();
		numberVector.add(5);
		numberVector.add(7);
		
		System.out.println("kapasitas vektor: " +numberVector.capacity());
		//kapasitas awal vektor emg 20
		//kapasitas != size
		
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		
		//blok + alt + shift + z buat do, try catch nya
		do {
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Exit");
			
			System.out.println("choose-> ");
			
			try {
				choose = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				choose = 0;
			}
		} while (choose != 3);
		
		System.out.println("makaci!");
	}

}
