import java.util.*;
public class Array_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayListDemo
		ArrayList al = new ArrayList();
		System.out.println("Inisialisasi ukuran ArrayList : "+ al.size());
		
		//Menambah elemen ke dalam Array list
		al.add(2);
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2"); //Memasukkan objek A2 dalam array pada Indeks ke 1;
		
		System.out.println("Ukuran setelah penambahan "+ al.size());
		
		//Menampilkan Array List
		System.out.println("Ini Array List: "+al);
		
		//Menghapus element dalam Array List
		al.remove("F");
		//al.remove(2)
		al.remove(String.valueOf("A"));
		
		System.out.println("Ukuran setelah penghapusan: "+ al.size());
		System.out.println("Isi Array List: "+ al);
		System.out.println("Array List index ke-3 = "+al.get(3));
	}

}
