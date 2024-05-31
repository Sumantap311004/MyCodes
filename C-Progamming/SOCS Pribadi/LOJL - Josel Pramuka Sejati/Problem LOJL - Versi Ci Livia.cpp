#include<stdio.h>

int main(){
	int baris, kolom;
	scanf ("%d %d", &baris, &kolom);
	getchar();
	
	//Membuat Matrix terlebih dahulu
	int mx[baris][kolom];
	for (int i=0; i<baris; i++){
		for (int j=0; j<kolom; j++){
			scanf ("%d", &mx[i][j]);
			getchar();
		}
	}

	// Untuk dari barat.
		printf("West  : ");
		
		for (int i=0; i<baris; i++){
			int max = -1;
			int count_west = 0;
			for (int j=0; j<kolom; j++){
				if (max < mx[i][j]){
					count_west++;
					max = mx[i][j];
				}
			}
			printf(" %d", count_west);
		}
		puts ("");
		
	// Untuk dari Timur
		printf("East  : ");
		for (int i=0 ; i<baris; i++){
			int max = -1;
			int count_east = 0;
			for (int j=kolom-1; j>=0; j--){
				if (max < mx[i][j]){
					count_east++;
					max = mx[i][j];
				}
			}
			printf(" %d", count_east);
			
		}
		puts("");
	
	// Untuk dari Utara.
		printf("North : ");
		for (int j=0; j<kolom; j++){
			int max = -1;
			int count_north = 0;
			for (int i=0; i<baris; i++){
				if (max < mx[i][j]){
					count_north++;
					max = mx[i][j];
				}
			}
			printf(" %d", count_north);
		}
		puts ("");
	
	
	// Untuk dari Selatan 
		printf("South : ");
		for (int j=0 ; j<kolom; j++){
			int max = -1;
			int count_south = 0;
			for (int i=baris-1; i>=0; i--){
				if (max < mx[i][j]){
					count_south++;
					max = mx[i][j];
				}
			}
			printf(" %d", count_south);
			
		}
		puts("");
	return 0;
}
