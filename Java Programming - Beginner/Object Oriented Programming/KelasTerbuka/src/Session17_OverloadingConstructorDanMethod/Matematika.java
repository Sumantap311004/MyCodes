package Session17_OverloadingConstructorDanMethod;

class Matematika {
	public static int tambah(int x, int y) {
		return x+y;
	}
	
	public static double tambah(int x, double y) {
		return (double)x + y;
	}
}
