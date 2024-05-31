#include<stdio.h>

int main (){
	int tc;
	scanf("%d", &tc);
	getchar ();
	
	puts ("");
	
	for  (int i=0; i<tc; i++){
		
		//Persegi
		printf ("Ayo Buat Persegi!\n");
		printf ("Masukan sisi yang diinginkan:");
		int sisi = 0;
		scanf("%d", &sisi);
		getchar();
		
		printf ("Pola persegi:\n");
		for (int j=0; j<sisi; j++){
			for (int k=0; k<sisi; k++){
				printf("*");
			}
			puts("");
		}
		
		puts ("");
		
		printf ("Ayo Buat Persegi Panjang!\n");
		printf ("Masukan panjang yang diinginkan:");
		int panjang = 0;
		scanf("%d", &panjang);
		getchar();
		printf ("Masukan lebar yang diinginkan:");
		int lebar = 0;
		scanf("%d", &lebar);
		getchar();
		
		printf ("Pola persegi panjang:\n");
		for (int j=0; j<lebar; j++){
			for (int k=0; k<panjang; k++){
				printf("*");
			}
			puts("");
		}
		
		puts ("");
		
		printf ("Ayo Buat Segitiga Siku-siku!\n");
		printf ("Masukan tinggi yang diinginkan:");
		int tinggi = 0;
		scanf("%d", &tinggi);
		getchar();
		
		
		printf ("Pola Segitiga Siku-siku:\n");
		for (int j=1; j<=tinggi; j++) {
			for (int k=1; k<=j; k++){
				printf ("*");
			}
			puts ("");
		}
		
		puts ("");
		
	}
	
	return 0;
}
