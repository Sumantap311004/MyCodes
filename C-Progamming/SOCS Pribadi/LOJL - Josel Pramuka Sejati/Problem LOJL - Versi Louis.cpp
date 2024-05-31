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
		int count_west [baris] = {};
		int west = -1;
		
		for (int i=0; i<baris; i++){
			for (int j=0; j<kolom; j++){
				if (west < mx[i][j]){
					count_west[i]++;
					west = mx[i][j];
				}
			}
			west = -1;
		}
		
		printf(" %d", count_west[0]);
		
		for (int i=1; i<baris; i++){
			printf(", %d", count_west[i]);
		}			
		puts ("");
		
	// Untuk dari Timur
		printf("East  : ");
		int count_east [baris] = {};
		int east = -1;
		
		for (int i=0 ; i<baris; i++){
			for (int j=kolom-1; j>=0; j--){
				if (east < mx[i][j]){
					count_east[i]++;
					east = mx[i][j];
				}
			}
			east = -1;
		}
		
		printf(" %d", count_east[0]);
		
		for (int i=1 ; i<baris; i++){
			printf(", %d", count_east[i]);
		}
		puts("");
	
	// Untuk dari Utara.
		printf("North : ");
		int count_north[kolom] = {};
		int north = -1;
		
		for (int j=0; j<kolom; j++){
			for (int i=0; i<baris; i++){
				if (north < mx[i][j]){
					count_north[j]++;
					north = mx[i][j];
				}
			}
			north = -1;
		}
		
		printf(" %d", count_north[0]);
		
		for (int j=1; j<kolom; j++){
			printf(", %d", count_north[j]);
		}
		puts ("");
	
	
	// Untuk dari Selatan 
		printf("South : ");
		int count_south[kolom] = {};
		int south = -1;
		for (int j=0 ; j<kolom; j++){
			for (int i=baris-1; i>=0; i--){
				if (south < mx[i][j]){
					count_south[j]++;
					south = mx[i][j];
				}
			}
			south = -1;	
		}
		
		printf(" %d", count_south[0]);
		
		for (int j=1 ; j<kolom; j++){
			printf(", %d", count_south[j]);
		}
		puts("");
		
	return 0;
}
