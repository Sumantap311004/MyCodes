//Door Threat Volume 2
	//Ganjil ---> Tertutup
	//Genap ----> Terbuka

#include<stdio.h>

int main(){
	int tc;
	scanf("%d", &tc);
	getchar();
	
	int room;
	int banyak_pattren;
	
	for (int i=0; i<tc; i++){
		scanf("%d %d", &room, &banyak_pattren);
		getchar();
		
		int pola[banyak_pattren];
		
		for (int j=0; j<banyak_pattren; j++){
			scanf("%d", &pola[j]);
			getchar();
		}
	
	printf("Case #%d:", i+1);
		int temp[room]={};
		
		for (int j=1; j<=room; j++){
			for (int k=0; k<banyak_pattren ; k++){
				if (j % pola[k] == 0)  temp[j-1]++;
			}
		}
		
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
			printf(" All room are opened!");
		}
		
		printf("\n");
		
		
	}
	return 0;
}
