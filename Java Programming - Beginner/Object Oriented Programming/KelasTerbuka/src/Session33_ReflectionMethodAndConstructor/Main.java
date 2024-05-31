package Session33_ReflectionMethodAndConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Session33_ReflectionMethodAndConstructor_Hero.Hero;
import Session33_ReflectionMethodAndConstructor_Hero.HeroAgility;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		System.out.println("Test!!!");
		
		System.out.println();
		HeroAgility hero1 = new HeroAgility("Ucup", 0);
		hero1.displayAll();
		
		System.out.println();
		System.out.println("Kita akan Mengambil seluruh Private Method");
		Method[] methodHero = hero1.getClass().getDeclaredMethods();
		for(Method method:methodHero) {
			System.out.println(method);
			System.out.println(method.getName());
			System.out.println(method.getModifiers());
			System.out.println(method.accessFlags());
		}
		// Field[] fieldHero = hero1.getClass().getDeclaredFields();
		
		System.out.println();
		System.out.println();
		System.out.println("Asal Muasal");
		System.out.println("==================");
		hero1.displayAll();
		System.out.println("==================");
		for(Method method:methodHero) {
			if(method.getName().equals("setHeroType")) {
				System.out.println("Menginvoke Method setHeroType");
				System.out.println("==================");
				method.setAccessible(true);
				method.invoke(hero1, "intel");
			}
			if(method.getName().equals("setNickname")) {
				System.out.println("Menginvoke Method Nickname");
				System.out.println("==================");
				method.setAccessible(true);
				method.invoke(hero1, "Brandon");
			}
		}
		hero1.displayAll();
		
		
		//Kita akan mengakses Constructor
		System.out.println();
		Object newHero = new Object();
		Constructor<?>[] constructorHero = hero1.getClass().getConstructors();
		for(Constructor<?> constructor:constructorHero) {
			System.out.println(constructor.getName());
			if(constructor.getName().equals("Session33_ReflectionMethodAndConstructor_Hero.HeroAgility")) {
				Object[] obj = {"James",20};
				newHero = constructor.newInstance(obj);
			}
		}
		HeroAgility hero2 = (HeroAgility) newHero;
		hero2.displayAll();
	}
}
