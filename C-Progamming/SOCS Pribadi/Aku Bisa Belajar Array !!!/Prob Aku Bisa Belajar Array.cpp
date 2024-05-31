#include<stdio.h>

int main (){
	
	//Insialisasi Kolom dan Baris
	int row;
	int column;
	
	// Scan baris dan kolom
	scanf ("%d %d", &row, &column);
	getchar();
	
	//Menscan Matrix yang ingin kita buat outputnya
	int mx[row][column] = {};
	for (int i=0; i<row; i++){
		for (int j=0; j<column; j++){
			scanf ("%d", &mx[i][j]);
			getchar();
		}
	}
	
	//Print Matrix biasa dulu aja
	printf ("Matrix biasa:\n");
	for (int i = 0; i<row; i++){
		for (int j=0; j<column; j++){
			printf("%d ", mx[i][j]);
		}
		puts ("");
	}
	
	puts("");
	
	//print matrix Unik
	printf ("Matrix unik:\n");
	for (int i = row-1; i>=0; i--){
		for (int j=column-1; j>=0; j--){
			printf("%d ", mx[i][j]);
		}
		puts ("");
	}
	
	puts("");

	
	//print matrix Transpose
	printf ("Matrix transpose:\n");
	for (int i = 0; i<row; i++){
		for (int j=0; j<column; j++){
			printf("%d ", mx[j][i]);
		}
		puts ("");
	}
	
	puts("");
	
	//Print kata-kata semangat
	printf("Aku Bisa Belajar Array !!!\n");
	
	return 0;
}
