//Door Threat Volume 3
	//Ganjil ---> Tertutup
	//Genap ----> Terbuka

#include<stdio.h>

int main(){
	//Scan untuk test case dulu
	int tc;
	scanf("%d", &tc);
	getchar();
	
	int room;
	int banyak_pattren;
	
	for (int i=0; i<tc; i++){
		scanf("%d %d", &room, &banyak_pattren); //Scan banyak Ruangan dan banyak pola
		getchar();
		
		int pola[banyak_pattren];
		
		for (int j=0; j<banyak_pattren; j++){
			scanf("%d", &pola[j]); // Scan pola-pola
			getchar();
		}	
		
		int vania;
		int pearleen;
		int dimitri;
		int verren;
		scanf ("%d %d %d %d", &vania, &pearleen, &dimitri, &verren);
		getchar();
	
		int temp[room]={};
		
		for (int j=1; j<=room; j++){
			for (int k=0; k<banyak_pattren ; k++){
				if (j % pola[k] == 0)  temp[j-1]++;
			}
		}
		
		//Kasus Pintu Terbuka
	printf("Case #%d\n", i+1);
	printf("pintu terbuka    :");
		int no_room=0;
		for (int j=1; j<=room;j++){
			if (temp[j-1]%2 != 0){
				no_room++;
			}
			else if (temp[j-1]%2 == 0){
				printf(" %d", j);
			}
		}
		
		if (no_room == room){
			printf(" Tidak ada pintu terbuka");
		}
		
		printf("\n");
		
		
		//Kasus pintu tertutup
	printf("pintu tertutup   :");
		int open_room=0;
		for (int j=1; j<=room;j++){
			if (temp[j-1]%2 != 0){
				printf(" %d", j);
			}
			else if (temp[j-1]%2 == 0){
				open_room++;
			}
		}
		
		if (open_room == room){
			printf(" Semua pintu terbuka");
		}
		printf("\n");
		
		
		//Cek Kondisi Vania
		printf("Kondisi Vania    : ");
		if (temp[vania-1]%2 != 0){
				printf("Selamatkan Vania, dia tengah terkunci!\n");
		}
		else if (temp[vania-1]%2 == 0){
				printf("Vania dalam kondisi aman!\n");
		}
		
		//Cek Kondisi Pearleen
		printf("Kondisi Pearleen : ");
		if (temp[pearleen-1]%2 != 0){
				printf("Selamatkan Pearleen, dia tengah terkunci!\n");
		}
		else if (temp[pearleen-1]%2 == 0){
				printf("Pearleen dalam kondisi aman!\n");
		}
		
		//Cek Kondisi Dimitri
		printf("Kondisi Dimtiri  : ");
		if (temp[dimitri-1]%2 != 0){
				printf("Selamatkan Dimitri, dia tengah terkunci!\n");
		}
		else if (temp[dimitri-1]%2 == 0){
				printf("Dimitri dalam kondisi aman!\n");
		}
		
		//Cek Kondisi Verren
		printf("Kondisi Verren   : ");
		if (temp[vania-1]%2 != 0){
				printf("Selamatkan Verren, dia tengah terkunci!\n");
		}
		else if (temp[vania-1]%2 == 0){
				printf("Verren dalam kondisi aman!\n");
		}
		
		
		puts ("");
		puts ("");
		puts ("");
	}
	return 0;
}
