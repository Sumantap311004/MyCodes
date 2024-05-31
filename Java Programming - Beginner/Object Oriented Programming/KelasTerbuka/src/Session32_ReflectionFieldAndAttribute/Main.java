package Session32_ReflectionFieldAndAttribute;

import Session32_ReflectionFieldAndAttribute_Hero.Hero;
import Session32_ReflectionFieldAndAttribute_Hero.HeroAgility;
import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException{
		// TODO Auto-generated method stub
		System.out.println("Test!!!");
		
		HeroAgility hero1 = new HeroAgility("Otong", 100);
		hero1.displayAll();
		System.out.println();
		
		//Access Modifier
		hero1.nickname = "Tongtong"; //Bisa dilakukan
		hero1.displayAll();
		// hero1.heroType = "Intel"; // Tidak bisa dilakukan karena Private
		// hero1.name = "Ucup" // Tidak bisa karena Private dalam Abstract
		
		
		/* Reflection */ //Melakukan hal hal yang tidak bisa dilihat (Not Visible)
		Class<?> classHero1 = hero1.getClass();
		Class<?> parentClassHero1 = hero1.getClass().getSuperclass();
		System.out.println("");
		System.out.println("Class : " + classHero1);
		System.out.println("Parent: " + parentClassHero1);
		System.out.println("Name Class : " + classHero1.getName());
		System.out.println("Name Parent: " + parentClassHero1.getName());
		System.out.println("Parent Parent: " + parentClassHero1.getSuperclass());
		
		
		/*Cek Atrribute dari Object*/
		System.out.println();
		System.out.println("Atrribute dari Object hero1");
		Field[] hero1Fields = classHero1.getFields();
		System.out.println(hero1Fields); //Berbentuk Array
		System.out.println(hero1Fields[0]);
		System.out.println("Jumlah Attribute: " + hero1Fields.length); 
		System.out.println("Atrribute: " + hero1Fields[0].getName());
		
		/*Cek Atrribute Semua*/
		System.out.println();
		System.out.println("Atrribute semua dari Object hero1");
		Field[] hero1AllFields = classHero1.getDeclaredFields();
		System.out.println("Jumlah Attribute: " + hero1AllFields.length);
		System.out.println("Atrribute: ");
		for (Field field:hero1AllFields) {
			System.out.println("- " + field.getName());
		}
		
		System.out.println();
		System.out.println("Atrribute semua dari SuperClass");
		Field[] heroAllFields = parentClassHero1.getDeclaredFields();
		System.out.println("Jumlah Attribute: " + heroAllFields.length);
		System.out.println("Atrribute: ");
		for (Field field:heroAllFields) {
			System.out.println("- " + field.getName());
		}
		
		
		/*Mencoba Mengubah Nilainya*/
		System.out.println();
		System.out.println("Kita Ubah");
		hero1.displayAll();
		System.out.println("Berubah Menjadi");
		// Merubah Public Nickname
		hero1AllFields[0].set(hero1, "Tingting");
		// Merubah Private nameType
		hero1AllFields[1].setAccessible(true); //Mengubah Access Modifier
		hero1AllFields[1].set(hero1, "Intel");
		//Seperti Bayangan hanya berubah di depan namun aslinya di belakangnya tidak berubah
		hero1.displayAll();
		
		/*Ubah Bagian SuperClass*/
		System.out.println();
		hero1.displayAll();
		System.out.println("====================");
		heroAllFields[0].setAccessible(true);
		heroAllFields[0].set(hero1, "Ucup");
		heroAllFields[1].setAccessible(true);
		heroAllFields[1].set(hero1, 0);
		hero1.displayAll();
		
	}
}