//Library
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <math.h>
#include <time.h>
#include <windows.h>
#include <conio.h>
#include <limits.h>


//6. Struct Biner Bit Conversion
struct biner{
	unsigned bit0:1; unsigned bit1:1;
    unsigned bit2:1; unsigned bit3:1;
    unsigned bit4:1; unsigned bit5:1;
    unsigned bit6:1; unsigned bit7:1;
    
	unsigned bit8:1; unsigned bit9:1;
    unsigned bit10:1; unsigned bit11:1;
    unsigned bit12:1; unsigned bit13:1;
    unsigned bit14:1; unsigned bit15:1;
    
    unsigned bit16:1; unsigned bit17:1;
    unsigned bit18:1; unsigned bit19:1;
    unsigned bit20:1; unsigned bit21:1;
    unsigned bit22:1; unsigned bit23:1;
    
    unsigned bit24:1; unsigned bit25:1;
    unsigned bit26:1; unsigned bit27:1;
    unsigned bit28:1; unsigned bit29:1;
    unsigned bit30:1; unsigned bit31:1;
};

//9. Factorial dan Fibbonaci
int factorial(int x){
	if (x == 1){
		return 1;
	}
	return x * factorial(x-1);
}
int fibo(int x){
	if (x <= 1)
        return x;
    return fibo(x - 1) + fibo(x - 2);
}

//12. Tic Tac Toe PvP
int square[20] = { 0, 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
int checkwin();
void board();

//13. Tic Tac Toe PvC
int board_pvc[10] = {2,2,2,2,2,2,2,2,2,2};
int turn = 1,flag = 0;
int player,comp;

void menu();
void go(int n);
void start_game();
void check_draw();
void draw_board();
void player_first();
void put_X_O(char ch,int pos);
  COORD coord={0,0};

void gotoxy(int x,int y){
    coord.X=x;
    coord.Y=y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),coord);
}

	//14. Algo Market
int groceries;
FILE *ptr;

struct databelanja{
	char nama[1000] = {};
	int jumlah = 0;
} belanja [1000] = {};

struct history{
  	char kata [1000] = {};
  	int banyak = 0;
} hist [1000] = {};

 struct temporary{
  	char barang [1000] = {};
  	int quantity = 0;
} temp [1000] = {};

void swap();
int bubblesort(int *arrdata, int n);
void insertData();
void showData();
void sortingProduct();
void sortingQuantity();

	//15. Google Mini
void insertTheData();
void readAndSearchFile();
void showFiles();
void showHistoryData();
int countingFiles();
void clearFiles();
void clearHistory();

	//17. Library
struct books{
    int id;
    char bookName[50];
    char authorName[50];
    char date[12];
}b;

struct student{
    int id;
    char sName[50];
    char sClass[50];
    int sRoll;
    char bookName[50];
    char date[12];
}s;

void addBook();
void booksList();
void del();
void issueBook();
void issueList();

FILE *fp;
	
	// 19. Struct Problem
#define MAX 5

void structMenu ();
void structno1();
void structno2();
void structno3();
void structno4();
void structno5();
void structno6();
void structno7();

struct alamat{
	char nama_jalan[1005];
	int nomor_jalan;
	char nama_kota[105];
	char nama_provinsi[105];
};

struct tanggal_lahir{
	int hari_lahir;
	int bulan_lahir;
	int tahun_lahir;
};
	
struct identitas_dari_murid {
	char nomor_induk_mahasiswa[15];
	char nama_dari_murid[105];
	struct alamat al;
	struct tanggal_lahir tgl;	
};

struct automobile {
	int year;
	char model[8];
	int engine_power;
	float weight;
}arr_mobile[MAX];

struct ipkmhs{
	char name[30];
	float gpa;
}person[10];

struct studentScore{
	char nim[11];
	char name[30];
	char subjectCode[5];
	int sks;
	char grade[];
}input;

struct nilaiMahasiswa{
	char nim[11];
	char name[300];
	char subjectCode[1005];
	int sks;
	char grade;
}hasildata[MAX];
	
 
			//Prototye Function//
void daftar_menu();
void array_5d();
void tebak_kata();
void count_vocal();
void missing_word();
void reverse_even();
void biner_bit();
void caesar_encryption();
void calcu_simple();
void fibo_facto();
void calcu_file();
void primeodd ();
void tictac_pvp();
void tictac_pvc();
void Algomarket();
void gugel_mini();
void prime_num();
void library ();
void bytes_check ();
void strak_prob();


			//Fungsi Main//
			
int main (){
	int option;
	do {
		system("cls");
		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    printf("\n        =                 WELCOME                   =");
	    printf("\n        =                   TO                      =");
	    printf("\n        =            LOUIS APPLICATION              =");
	    printf("\n        =                MANAGEMENT                 =");
	    printf("\n        =                 SYSTEM                    =");
	    printf("\n        =             Louis Oktovianus              =");
	    printf("\n        =               2602078884                  =");
	    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	    puts ("");
	    
		daftar_menu();
		scanf ("%d", &option);
		getchar();
		
		switch (option){
			case 1:{
				system("cls");
				array_5d();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 2:{
				system("cls");
				tebak_kata();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 3:{
				system("cls");
				count_vocal();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 4:{
				system("cls");
				missing_word();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 5:{
				system("cls");
				reverse_even();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 6:{
				system("cls");
				biner_bit();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}	
			
			case 7:{
				system("cls");
				caesar_encryption();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 8:{
				system("cls");
				calcu_simple ();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 9:{
				system("cls");
				fibo_facto();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 10:{
				system("cls");
				calcu_file();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 11:{
				system("cls");
				primeodd ();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 12:{
				system("cls");
				tictac_pvp();
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 13:{
				system("cls");
				tictac_pvc();
				puts("");
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 14:{
				system("cls");
				Algomarket();
				puts("");
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 15:{
				system("cls");
				gugel_mini();
				puts("");
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 16:{
				system("cls");
				prime_num();
				puts("");
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 17:{
				system("cls");
				library ();
				puts("");
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 18:{
				system("cls");
				bytes_check ();
				puts("");
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
			
			case 19:{
				system("cls");
				strak_prob();
				puts("");
				printf ("Press Enter to Continue...");
				getchar();
				break;
			}
	
		}	
		
		if (option < 0 && option > 19){
			system("cls");
			printf("Invalid Input !!!\n");
			printf ("Press Enter to Continue...");
			getchar();
		}		
	} 
	
	while (option != 0);
	system("cls");
		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
		printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		printf("\n        =                    THANK YOU                    =");
		printf("\n        =                     SO MUCH                     =");
		printf("\n        =                    AND HAVE A                   =");
		printf("\n        =                     NICE DAY                    =");
		printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
    	
	return 0;
}


			//Function Pendukung//
			
void daftar_menu(){
	puts("Inilah Pilihan Menu yang dapat anda pilih!");
	puts("0. Exit");
	puts("1. Melihat Array 5-Dimensi");
	puts("2. Main Game Tebak Kata");
	puts("3. Menghitung Huruf Vocal");
	puts("4. Missing Character");
	puts("5. Reverse Even Word");
	puts("6. Binary Bit Convertion Sederhana");
	puts("7. Character Caesar Encryption");
	puts("8. Calculator Sederhana");
	puts("9. Fibonnaci and Factorial");
	puts("10. Sum Calculator to File");
	puts("11. 5th Prime and Plus 16");
	puts("12. Tic Tac Toe PvP");
	puts("13. Tic Tac Toe PvC");
	puts("14. Algo Market");
	puts("15. Google Mini");
	puts("16. Sequence of Prime Numbers");
	puts("17. Library Mode");
	puts("18. Bytes Check");
	puts("19. Struct Problem");
	printf ("Masukan pilihanmu: ");
}
			
// 1. Function melihat Array 5 Dimensi !!!
void array_5d(){
	int arr[2][2][2][2][2] = {};
	int *ptr = &arr[0][0][0][0][0];
								
	printf ("BENTUK ARRAY 5-DIMENSI SEDERHANA\n");
	for (int i = 0 ; i<2 ; i++){
		for (int j = 0 ; j<2 ; j++){
			for (int k = 0 ; k<2 ; k++){
				for (int l = 0 ; l<2 ; l++){
					for (int m = 0 ; m<2 ; m++){
						printf ("%d ", *(ptr + (i*2) + (j*2) + (k*2) + (l*2) + m ));
					}
					printf ("\t");
				}
				printf ("\t");
			}
			printf ("\n");
		}
		printf ("\n");
	}
}

//2. Function Membuat Game Tebak Kata
void tebak_kata(){
	int input;
	do {
		if (input%2 == 1) {
			printf ("Akses ditolak, Masukan kembali angka input!\n\n\n");
		}
		printf("Masukan angka input (harus genap): ");
		scanf("%d", &input);
		getchar();
	} while (input%2 == 1);
	
	//Membagi Jumlah Kata ---> untuk player 1 dan 2//
	int len = input/2;
	printf ("Maka player 1 dan 2 masing-masing memasukkan %d kata\n", len);
	
	char kata1[len+5][200] = {};
	char kata2[len+5][200] = {};
	
	system("cls");
	
	//Untuk masukin kata-kata player 1//
	printf ("Jumlah kata yang dimasukan : %d\n", input);
	printf ("Maka Player 1 dan 2 masing-masing memasukkan %d kata\n", len);
	printf ("\nPlayer 1 memasukan kata (minimal 8 karakter) :\n");
	
	for (int i = 0 ; i<len ; i++){	
		printf ("Kata ke-%d: ", i+1); scanf ("%[^\n]", kata1[i]); getchar();
		
		while (strlen(kata1[i])<8){
			printf ("Jumlah karakter belum memenuhi, silahkan masukan kembali karakter baru!\n");
			printf ("Kata ke-%d: ", i+1); 
			scanf ("%[^\n]", kata1[i]); 
			getchar();
		}	
		
	}
	
	system("cls");
	
	//Untuk masukin kata-kata player 2//
	printf ("Jumlah kata yang dimasukan : %d\n", input);
	printf ("Maka Player 1 dan 2 masing-masing memasukkan %d kata\n", len);
	printf ("\nPlayer 2 memasukan kata (minimal 8 karakter) :\n");
	
	for (int i = 0 ; i<len ; i++){	
		printf ("Kata ke-%d: ", i+1); 
		scanf ("%[^\n]", kata2[i]); 
		getchar();
		
		while (strlen(kata2[i])<8){
			printf ("Jumlah karakter belum memenuhi, silahkan masukan kembali karakter baru!\n");
			printf ("Kata ke-%d: ", i+1); 
			scanf ("%[^\n]", kata2[i]); 
			getchar();
		}	
	}
	
	system("cls");
	
	//Menghilangkan beberapa karakter yang diinput user.
		// Belum terlihat perubahannya, baru terlihat di belakang layar saja.
		// Yang akan hilang adalah minimal 4 karakter.
	int skip, ilang;
	char temp1[len+5][200] = {};
	char temp2[len+5][200] = {};
	
	for (int i = 0 ; i<len ; i++){
		strcpy (temp1[i], kata1[i]);
		strcpy (temp2[i], kata2[i]);
	}
	
	for (int i = 0 ; i<len ; i++){
		
		ilang = 4 + (rand()%((strlen(temp1[i]))-7));
		for (int j = 0 ; j<ilang ; j++){
			skip = rand() % strlen(kata1[i]);
			
			if(kata1[i][skip] != '_'){		
				kata1[i][skip] = '_';
			}
			else j--;
		}
		
		ilang = 4 + (rand()%((strlen(temp2[i]))-7));
		for (int j = 0 ; j<ilang ; j++){
			skip = rand() % strlen(kata2[i]);
			
			if(kata2[i][skip] != '_'){		
				kata2[i][skip] = '_';
			}
			else j--;
		}			
	}
	
	//Proses Bermain dengan kata yang sudah hilang dan penghitungan poin dimulai
	char tebak1[len+5][200] = {};
	char tebak2[len+5][200] = {};
	float poin1 = 0;
	float poin2 = 0;
	
	printf ("Waktunya menebak jawaban!\n");
	for (int i = 0 ; i<len ; i++){
		printf ("Giliran Player 1\n");
		printf ("%s\n", kata2[i]);	
		printf ("Jawaban tebakan: "); 
		scanf("%[^\n]", tebak2[i]); 
		getchar();
		
		if (strcmp(tebak2[i], temp2[i]) == 0){
			printf ("Jawaban anda benar!\n"); //Jawaban benar apabila string dan temp bernilai sama.
			poin1 += 100.00/len; // Poin didapat bedasarkan jumlah soal.
		}
		else{
			printf ("\nJawaban anda kurang tepat!\n"); //Jawaban salah dikarenakan string dan temp bernilai berbeda.
			printf ("Jawaban : %s\n", temp2[i]);
			temp2[i][strlen(temp2[i])] = '*'; //Untuk memberi tanda pada jawaban yang salah.b
		}
		
		printf ("\n\nGiliran Player 2\n");	
		printf ("%s\n", kata1[i]);	
		printf ("Jawaban tebakan: "); 
		scanf("%[^\n]", tebak1[i]); 
		getchar();
		
		if (strcmp(tebak1[i], temp1[i]) == 0){
			printf ("\nJawaban anda benar!\n"); //Jawaban benar apabila string dan temp bernilai sama.
			poin2 += 100.00/len;  // Poin didapat bedasarkan jumlah soal.
		}
		else{
			printf ("\nJawaban anda kurang tepat!\n"); //Jawaban salah dikarenakan string dan temp bernilai berbeda.
			printf ("Jawaban : %s\n", temp1[i]); 
			temp1[i][strlen(temp1[i])] = '*'; //Untuk memberi tanda pada jawaban yang salah.
		}
		
		printf ("\nSkor sementara :\n");
		printf ("Player 1 : %.2f point\n", poin1);		
		printf ("Player 2 : %.2f point\n", poin2);
		printf ("\nPress enter to continue..."); 
		getchar();
		
		system("cls");		
	}
	
	//Memprint seluruh nilai yang sudah terkumpul, dan menentukan pemenang
	printf ("Permainan sudah berkahir!\n");
	
	if (poin1>poin2) printf ("Selamat buat player 1, Anda menang!\n");
	else if (poin1<poin2) printf ("Selamat buat player 2, Anda menang!\n");
	else printf ("Permainan seri!\n");
	
	printf ("\nSkor akhir:\n");
	printf ("Player 1 : %.2f point\n", poin1);	
	printf ("Player 2 : %.2f point\n", poin2);
	
	printf ("\nHasil pertandingan :\n");
	for (int i = 0 ; i<len ; i++){
		printf ("Kata player 1 (%d): %s\n", i+1, temp1[i]);
		printf ("Kata player 2 (%d): %s\n", i+1, temp2[i]);
	}
	puts("");
	printf ("Yang memiliki tanda '*' adalah jawaban yang salah!\n");
	printf ("Terima kasih sudah bermain!");
	printf ("Sampai berjumpa di lain kesempatan!");
	
	puts ("");
	
	char valid;
	do {
		printf("Apakah mau melihat data pembuat? [Y/N]: ");
		scanf("%c", &valid);
		getchar();
	} while (valid != 'Y' && valid != 'N');
	
	if (valid == 'Y'){
			system("cls");
	
			printf ("Nama Lengkap : Louis Oktovianus\n");
			printf ("NIM : 2602078884\n");
			printf ("Kelas : LN01\n");
			printf ("Jurusan : Computer Science\n");
		}
	else if (valid == 'N') {
			system("cls");
		}
	
}

// 3. Function Membuat Mencari Huruf Vocal
void count_vocal(){
	char kata[1005] = {};
	printf ("Masukan kata yang diinginkan: ");
	scanf("%[^\n]", &kata);
	getchar();
	
	int A = 0;
	int I = 0;
	int U = 0;
	int E = 0;
	int O = 0;
	
	int len = strlen (kata);
	for (int x = 0; x<len; x++){
		if (kata[x] >= 'a' && kata[x] <='z'){
			kata[x] = kata[x]-32;
		}
	}
	
	for (int x = 0; x<len; x++){
		if (kata[x] == 'A'){
			A++;
		}
		else if (kata[x] == 'I'){
			I++;
		}
		else if (kata[x] == 'U'){
			U++;
		}
		else if (kata[x] == 'E'){
			E++;
		}
		else if (kata[x] == 'O'){
			O++;
		}
	}
	
	printf ("Banyak Kata A = %d", A);
	puts ("");
	printf ("Banyak Kata I = %d", I);
	puts ("");
	printf ("Banyak Kata U = %d", U);
	puts ("");
	printf ("Banyak Kata E = %d", E);
	puts ("");
	printf ("Banyak Kata O = %d", O);
	puts ("");
}

//4. Function Missing Word
void missing_word(){
	char kata[1005] = {};
	char ilang;
	char temp[1005]={};
	printf("Insert input with format (word - letter):\n");
	scanf ("%[^-] - %c", &kata, &ilang);
	getchar();
	
	int len = strlen(kata);
	int a 	= 0;
	
	for (int i=0; i<len; i++){
		if (kata[i] != ilang){
			temp[a] = kata[i];
			a++;
		}
		else {
			continue;
		}
	}
	
	int baru = strlen (temp);
	printf("Output I : ");
	
	for (int i=0; i<baru; i++){
		printf("%c", temp[i]);
	}
	
	puts("");
	
	printf("Output II : ");
	
	int arr[2000] = {};
	
	for (int i=0; temp[i] != '\0'; i++){
		arr[temp[i]]++;
	}
	
	for (int i=65, j=97; i<=90; i++, j++){
		for (int k=0; k<arr[i]; k++){
			printf("%c", i);
		}
		for (int k=0; k<arr[j]; k++){
			printf("%c", j);
		}
	}
	
	puts("");
}

//5. Function Reverse Even Word
void reverse_even(){
	char string[500];
	printf("Kalimat yang ingin diubah: ");
	scanf("%[^\n]", string);
	getchar();
	
	char string1[100][500];
	int k=0;
	int j=0;
	
	int count=0;
	for(int i=0; i<strlen(string); i++){
		if(string[i]!=' '){
			string1[k][j]=string[i];
			j++;
		}else if(string[i]==' '){
			count++;
			j=0;
			k++;
		}
	}
	
	printf("Kalimat yang sudah diubah: ");
	for(int i=0; i<=count; i++){
		if((i+1)%2==0){
			for(int j=strlen(string1[i]); j>=0; j--){
				printf("%c", string1[i][j]);
			}
		}else{
			for(int j=0; j<strlen(string1[i]); j++){
				printf("%c", string1[i][j]);
			}
		}
		if(i!=count){
			printf(" ");
		}
	}
	
	puts("");
}


//6. Function Biner Binary Conversion
void biner_bit(){

	union byte{
	      unsigned char ch;
	      struct biner bit;
	};
	
	unsigned char ch;
    union byte x;
    printf("Input number: ");
    scanf("%d",&ch);
    x.ch=ch;
    printf("%d binary = %d%d%d%d%d%d%d%d %d%d%d%d%d%d%d%d %d%d%d%d%d%d%d%d %d%d%d%d%d%d%d%d\n",
    ch,
    
    x.bit.bit31,x.bit.bit30,x.bit.bit29,x.bit.bit28,
    x.bit.bit27,x.bit.bit26,x.bit.bit25,x.bit.bit24,
	
	x.bit.bit23,x.bit.bit22,x.bit.bit21,x.bit.bit20,
    x.bit.bit19,x.bit.bit18,x.bit.bit17,x.bit.bit16,
	
	x.bit.bit15,x.bit.bit14,x.bit.bit13,x.bit.bit12,
    x.bit.bit11,x.bit.bit10,x.bit.bit9,x.bit.bit8,
	
	x.bit.bit7,x.bit.bit6,x.bit.bit5,x.bit.bit4,
    x.bit.bit3,x.bit.bit2,x.bit.bit1,x.bit.bit0);
    getchar();
}

//7. Function Caesar Encryption
void caesar_encryption(){
	char a, b, c;
	int angka;
	
	/*
	Constrain -3 < angka < 3
		--- > Syarat Caesar cipher
	*/
	
	printf("Masukan 3 Alphabet (Huruf Besar / Huruf Kecil) !!!\n");
	printf("Sebelum Ceasar Cipher:\n");	
	scanf ("%c %c %c %d", &a, &b, &c, &angka);
	getchar ();
	
	
			//UNTUK SCAN 1//
	//Validasi untuk A
	if (a == 'A'){
		if (angka == -1) 		a=90;
		else if (angka == -2) 	a=89;
		else if (angka == -3) 	a=88;
		else 					a=a+angka;	
	}
	//Validasi untuk B
	else if (a == 'B'){
		if (angka == -2) 		a=90;
		else if (angka == -3) 	a=89;
		else					a=a+angka;	
	}
	//Validasi untuk C
	else if (a == 'C'){
		if (angka == -3) 		a=90;
		else 					a=a+angka;		 
	}
	//Validasi untuk Z
	else if (a == 'Z' ){
		if (angka == 1) 		a=65;
		else if (angka == 2)	a=66;
		else if (angka == 3)	a=67;
		else					a=a+angka;		
	}
	//Validasi untuk Y
	else if (a == 'Y'){
		if (angka == 2) 		a=65;
		else if (angka == 3) 	a=66;
		else			 		a=a+angka;	
		
	}
	//Validasi untuk X
	else if (a == 'X'){
		if (angka == 3) 		a=65;
		else					a=a+angka;	
	}
	else {
		a=a+angka;	
	}
	
			//UNTUK SCAN 2//
	//Validasi untuk A
	if (b == 'A'){
		if (angka == -1) 		b=90;
		else if (angka == -2) 	b=89;
		else if (angka == -3) 	b=88;
		else 					b=b+angka;	
	}
	//Validasi untuk B
	else if (b == 'B'){
		if (angka == -2) 		b=90;
		else if (angka == -3) 	b=89;
		else					b=b+angka;	
	}
	//Validasi untuk C
	else if (b == 'C'){
		if (angka == -3) 		b=90;
		else 					b=b+angka;		 
	}
	//Validasi untuk Z
	else if (b == 'Z' ){
		if (angka == 1) 		b=65;
		else if (angka == 2)	b=66;
		else if (angka == 3)	b=67;
		else					b=b+angka;		
	}
	//Validasi untuk Y
	else if (b == 'Y'){
		if (angka == 2) 		b=65;
		else if (angka == 3) 	b=66;
		else			 		b=b+angka;	
	}
	//Validasi untuk X
	else if (a == 'X'){
		if (angka == 3) 		a=65;
		else					a=a+angka;	
	}
	else {
		b=b+angka;	
	}
	
			//UNTUK SCAN 3//
	//Validasi untuk A
	if (c == 'A'){
		if (angka == -1) 		c=90;
		else if (angka == -2) 	c=89;
		else if (angka == -3) 	c=88;
		else 					c=c+angka;	
	}
	//Validasi untuk B
	else if (c == 'B'){
		if (angka == -2) 		c=90;
		else if (angka == -3) 	c=89;
		else					c=c+angka;	
	}
	//Validasi untuk C
	else if (c == 'C'){
		if (angka == -3) 		c=90;
		else 					c=c+angka;		 
	}
	//Validasi untuk Z
	else if (c == 'Z' ){
		if (angka == 1) 		c=65;
		else if (angka == 2)	c=66;
		else if (angka == 3)	c=67;
		else					c=c+angka;		
	}
	//Validasi untuk Y
	else if (c == 'Y'){
		if (angka == 2) 		c=65;
		else if (angka == 3) 	c=66;
		else			 		c=c+angka;	
	}
	//Validasi untuk X
	else if (c == 'X'){
		if (angka == 3) 		c=65;
		else					c=c+angka;	
	}
	else {
		c=c+angka;	
	}

	puts("");
	puts("");
	
	printf("Sesudah Caesar Cipher: \n");
	printf("%c %c %c\n", a, b, c);
}

//8. Function Calculator Sederhana
void calcu_simple (){
	int input;
	
	do {
		puts("Salamat Datang di Kalkulator Sederhana");
		puts("Menu Operasi");
		puts("==============");
		puts("1. Pertambahan");
		puts("2. Pengurangan");
		puts("3. Pekalian");
		puts("4. Pembagian");
		puts("5. Modulus");
		puts("6. Kombinasi");
		puts("7. Exit");
		printf("Masukan Pilihanmu Sekarang: ");
		scanf ("%d", &input);
		
		puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
	
			if (input==1){
				int pertambahan;
				float a, b, c, d, e;	
				do {
					puts("Menu Pertambahan");
					puts("1. 2 angka");
					puts("2. 3 angka");
					puts("3. 4 angka");
					puts("4. 5 angka");
					puts("5. Kembali");
					printf("Masukan Pilihanmu Sekarang: ");
					scanf ("%d", &pertambahan);
					
					if(pertambahan == 1){
						printf("Masukan dua angka yang diinginkan: ");
						scanf("%f %f", &a, &b);
						printf ("Hasil penjumlahan = %.2f\n", a+b);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pertambahan == 2){
						printf("Masukan tiga angka yang diinginkan: ");
						scanf("%f %f %f", &a, &b, &c);
						printf ("Hasil penjumlahan = %.2f\n", a+b+c);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pertambahan == 3){
						printf("Masukan empat angka yang diinginkan: ");
						scanf("%f %f %f %f", &a, &b, &c, &d);
						printf ("Hasil penjumlahan = %.2f\n", a+b+c+d);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pertambahan == 4){
						printf("Masukan lima angka yang diinginkan: ");
						scanf("%f %f %f %f %f", &a, &b, &c, &d, &e);
						printf ("Hasil penjumlahan = %.2f\n", a+b+c+d+e);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
				} while (pertambahan!=5);
				puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
			}
			
			else if (input == 2){
				int pengurangan;
				float a, b, c, d, e;	
				do {
					puts("Menu Pengurangan");
					puts("1. 2 angka");
					puts("2. 3 angka");
					puts("3. 4 angka");
					puts("4. 5 angka");
					puts("5. Kembali");
					printf("Masukan Pilihanmu Sekarang: ");
					scanf ("%d", &pengurangan);
					
					if(pengurangan == 1){
						printf("Masukan dua angka yang diinginkan: ");
						scanf("%f %f", &a, &b);
						printf ("Hasil pengurangan = %.2f\n", a-b);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pengurangan == 2){
						printf("Masukan tiga angka yang diinginkan: ");
						scanf("%f %f %f", &a, &b, &c);
						printf ("Hasil pengurangan = %.2f\n", a-b-c);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pengurangan == 3){
						printf("Masukan empat angka yang diinginkan: ");
						scanf("%f %f %f %f", &a, &b, &c, &d);
						printf ("Hasil pengurangan = %.2f\n", a-b-c-d);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pengurangan == 4){
						printf("Masukan lima angka yang diinginkan: ");
						scanf("%f %f %f %f %f", &a, &b, &c, &d, &e);
						printf ("Hasil pengurangan = %.2f\n", a-b-c-d-e);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
				} while (pengurangan!=5);
				puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
			}
			
			else if (input == 3){
				int perkalian;
				float a, b, c, d, e;	
				do {
					puts("Menu Perkalian");
					puts("1. 2 angka");
					puts("2. 3 angka");
					puts("3. 4 angka");
					puts("4. 5 angka");
					puts("5. Kembali");
					printf("Masukan Pilihanmu Sekarang: ");
					scanf ("%d", &perkalian);
					
					if(perkalian == 1){
						printf("Masukan dua angka yang diinginkan: ");
						scanf("%f %f", &a, &b);
						printf ("Hasil perkaliann = %.2f\n", a*b);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (perkalian == 2){
						printf("Masukan tiga angka yang diinginkan: ");
						scanf("%f %f %f", &a, &b, &c);
						printf ("Hasil perkalian = %.2f\n", a*b*c);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (perkalian == 3){
						printf("Masukan empat angka yang diinginkan: ");
						scanf("%f %f %f %f", &a, &b, &c, &d);
						printf ("Hasil perkalian = %.2f\n", a*b*c*d);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (perkalian == 4){
						printf("Masukan lima angka yang diinginkan: ");
						scanf("%f %f %f %f %f", &a, &b, &c, &d, &e);
						printf ("Hasil perkalian = %.2f\n", a*b*c*d*e);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
				} while (perkalian!=5);
				puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
			}
			
			else if (input == 4){
				int pembagian;
				float a, b, c, d, e;	
				do {
					puts("Menu Pembagian");
					puts("1. 2 angka");
					puts("2. 3 angka");
					puts("3. 4 angka");
					puts("4. 5 angka");
					puts("5. Kembali");
					printf("Masukan Pilihanmu Sekarang: ");
					scanf ("%d", &pembagian);
					
					if(pembagian == 1){
						printf("Masukan dua angka yang diinginkan: ");
						scanf("%f %f", &a, &b);
						printf ("Hasil pembagian = %.2f\n", a/b);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pembagian == 2){
						printf("Masukan tiga angka yang diinginkan: ");
						scanf("%f %f %f", &a, &b, &c);
						printf ("Hasil pembagian = %.2f\n", a/b/c);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pembagian == 3){
						printf("Masukan empat angka yang diinginkan: ");
						scanf("%f %f %f %f", &a, &b, &c, &d);
						printf ("Hasil pembagian = %.2f\n", a/b/c/d);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (pembagian == 4){
						printf("Masukan lima angka yang diinginkan: ");
						scanf("%f %f %f %f %f", &a, &b, &c, &d, &e);
						printf ("Hasil pembagian = %.2f\n", a/b/c/d/e);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
				} while (pembagian!=5);
				puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
			}
			
		else if (input == 5){
				int modulus;
				int a, b, c, d, e;	
				do {
					puts("Menu Modulus");
					puts("1. 2 angka");
					puts("2. 3 angka");
					puts("3. 4 angka");
					puts("4. 5 angka");
					puts("5. Kembali");
					printf("Masukan Pilihanmu Sekarang: ");
					scanf ("%d", &modulus);
					
					if(modulus == 1){
						printf("Masukan dua angka yang diinginkan: ");
						scanf("%d %d", &a, &b);
						printf ("Hasil modulus = %d\n", a%b);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (modulus == 2){
						printf("Masukan tiga angka yang diinginkan: ");
						scanf("%d %d %d", &a, &b, &c);
						printf ("Hasil modulus = %d\n", a%b%c);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (modulus == 3){
						printf("Masukan empat angka yang diinginkan: ");
						scanf("%d %d %d %d", &a, &b, &c, &d);
						printf ("Hasil modulus = %d\n", a%b%c%d);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
					else if (modulus == 4){
						printf("Masukan lima angka yang diinginkan: ");
						scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
						printf ("Hasil modulus = %d\n", a%b%c%d%e);
						puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
					}
				} while (modulus!=5);
				puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
			}
		
		else if (input == 6){
			int var[25];
			char op[25];
			int total = 0;
			int tc;
			
			printf ("Masukkan jumlah variabel angka: ");
			scanf ("%d", &tc);
			getchar ();
			system ("cls");
			printf ("\nInput adalah seperti berikut: \n");
			printf ("= angka1 o angka2 o angka3 ...dst\n");
			printf ("\"o\" adalah operator matematika (+ , - , * , / , %)\n");
			printf ("\nSilahkan masukkan input: \n");
			
			for (int i = 1; i<=tc; i++){
				scanf ("%c %d", &op[i-1], &var[i-1]);
				getchar();
			}
			
			for (int r = 1; r<=tc; r++){
				if (op[r] == '*'){
							int k = var[r-1] * var[r];
							var[r] = k;
							var [r-1] = 0;
						}
				else if (op[r] == '/'){
							int k =  var[r-1] / var[r];
							var[r] = k;
							var [r-1] = 0;	
						}									
				else if (op[r] == '%'){
							int k = var[r-1] % var[r];
							var[r] = k;
							var [r-1] = 0;
						}
				else {
							var [r] = var[r];
							var [r-1] = var [r-1];
				}
			}
			
			total = var[0];
			for (int q = 1; q<=tc ; q++){	
				switch (op[q]){
					case '+':{
						total = total + var[q];
						break;
					}
					case '-': {
						if (var[q] == 0) var[q] = var[q+1]; var[q+1] = 0;
						total = total - var[q];
						break;
					}
					default : {
						if (var[q] == var[tc]) var[q] = 0;
						total = total + var[q];			
						break;
					}
				}
			}
			printf ("%d\n", total);
			printf ("\nPress enter to continue...");
			getchar();
			puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts (""); puts ("");
		}
			
	} while (input!=7);
	
	puts("Terima Kasih Sukses Selalu!");
	puts("Jangan Lupa Bahagia!");
}

//9.Function Fibonaci dan Factorial
void fibo_facto(){
	printf ("Note:\n");
	printf ("Jika anda memasukan angka ganjil maka akan keluar fungsi factorial dari angka tersebut.\n");
	printf ("Jika anda memasukan angka genap maka akan keluar fungsi fibonanci (angka+15).\n");
	
	int input;
	printf ("Masukkan Angka yang diinginkan: ");
	scanf ("%d", &input);
	getchar ();
	
	printf ("Jawabannya adalah: ");
	
	if (input % 2 == 0){
		input = input + 15;
		fibo(input); 
		printf("%d\n", fibo(input));
	}
	else {
		factorial(input);
		printf("%d\n", factorial(input));
	}
	
	puts ("");
}

//10. Calulator File
void calcu_file(){
	printf ("Menu:\n");
	printf ("1. Input Calculator\n");
	printf ("2. Read History\n");
	printf ("Pilih menu yang di Inginkan: "); 
	
	int menu;
	scanf("%d", &menu); 
	getchar();
	
	switch (menu){
	
		case 1: {
			system ("cls");
			FILE *cl, *hc;
			printf ("History sudah ada di dalam File anda!");
			cl = fopen("log.txt","a");
			hc = fopen("secret.wb","ab");
			int input=0;
			
			printf("Masukan jumlah angka yang di inginkan: ");
			scanf("%d", &input);
			getchar();
			
			int angka[input] = {};
			
			printf ("\nKalkulator hanya didesign untuk melakukan pertambahan\n");
    		printf ("Sample input : 2 3 8 ... dst\n\n");
    		printf ("Masukan angka yang diingikan:  ");
			for (int i=0; i<input; i++){
				scanf ("%d", &angka[i]);
				getchar();
			}
			
			int temp = 0;
			for (int i=0; i<input; i++){
				temp += angka[i];
			}
			
			printf ("%d", angka[0]);
			fprintf (cl,"%d", angka[0]);
			
			for (int i=1; i<input; i++){
				printf ("+%d", angka[i]);
				fprintf(cl,"+%d",angka[i]);
		
			}
			printf("=%d\n", temp);
			fprintf(cl,"= %d\n",temp);
			
			char str[200];
			    fscanf (hc, "%s\n", str);
				fwrite(str , 1, sizeof(str), hc );
				
				fclose (cl);
				fclose (hc);
		
			break;
		}
		
		
		case 2:{
				system ("cls");
				FILE *cl; FILE *hc;
				cl = fopen ("log.txt", "r");
				hc = fopen ("secret.wb", "rb");
				
				char s;
                char t;
                
                printf ("\nText:\n");
                while ((t=fgetc(cl))!=EOF){
                    printf("%c", t);
                }
                
                printf ("\nBinary:\n");
                while ((s=fgetc(hc))!=EOF){
                    printf("%c",s);
                }
                
                puts ("");
				fclose(cl);
				fclose(hc);
			break;
		}
	}
}

//11. Funtion 5th Prime and Plus 16
void primeodd (){
	printf("Instructions:\n");
	printf("1. Input an odd number to print 5 prime numbers after input\n");
	printf("2. Input an even number to print the 8th even number after input\n\n\n");
	
	printf("Warning:\n");
	printf("1. You cannot input a number that is above 99999999\n");
	printf("2. Program will not stop normally if you input an odd number\n");
	printf("   - This is due to the program that is counting prime numbers up to 109999999\n");
	printf("   - Please close the program manually\n\n");
	
	printf("Insert your input: ");
	long long int input;
	scanf("%lld", &input);
	getchar ();
	
	if(input > 99999999){
		printf("Out of limit\n");
	}
	else {
		if (input % 2 == 0){
			printf("The eighth even number after %d is ", input);
			
				//Using Manual//
			//	printf("%lld\n", angka+16);
				
			/*	
				//Using Loop//
				angka = 0;
				for  (i=0; i<8; i++){
					angka += 2;
				}
				printf ("%lld\n", angka);
			*/
			
			long long int number[8];
				number[0] = input;
				number[1] = number[0]+2;
				number[2] = number[1]+2;
				number[3] = number[2]+2;
				number[4] = number[3]+2;
				number[5] = number[4]+2;
				number[6] = number[5]+2;
				number[7] = number[6]+2;
				number[8] = number[7]+2;
			printf("%lld\n", number[8]);
		}
		else {
			printf("Five prime numbers after %d are ", input);
			
			long long max = 99999999;
		    int count = 0;
		    
		    for(int i = input + 1; i * i <= max; i++){
		      bool isPrime = true;
		      
			  for(int j = 2; j * j <= i; j++){
		        if(i % j == 0){
		          isPrime = false;
		        }
		      }
		      
		      if(isPrime){
		        printf("%d ", i);
		        count++;
		      }
		      
		      if(count == 5) break;
		    }
		    puts ("");
		}	
	}	
}

//12. Function Tic Tac Toe PvP
void tictac_pvp(){
	printf("Notes !!!\n");
	printf("X = 79");
	printf("O = 88");
	
	
	int player = 1, i, choice;

    char mark;
    do
    {
        board();
        player = (player % 2) ? 1 : 2;

        printf("Player %d, enter a number:  ", player);
        scanf("%d", &choice);

        mark = (player == 1) ? 'X' : 'O';

        if (choice == 1 && square[1] == 1)
            square[1] = mark;
            
        else if (choice == 2 && square[2] == 2)
            square[2] = mark;
            
        else if (choice == 3 && square[3] == 3)
            square[3] = mark;
            
        else if (choice == 4 && square[4] == 4)
            square[4] = mark;
            
        else if (choice == 5 && square[5] == 5)
            square[5] = mark;
            
        else if (choice == 6 && square[6] == 6)
            square[6] = mark;
            
        else if (choice == 7 && square[7] == 7)
            square[7] = mark;
            
        else if (choice == 8 && square[8] == 8)
            square[8] = mark;
            
        else if (choice == 9 && square[9] == 9)
            square[9] = mark;
            
        else if (choice == 10 && square[10] == 10)
            square[10] = mark;
        
        else if (choice == 11 && square[11] == 11)
            square[11] = mark;
        
        else if (choice == 12 && square[12] == 12)
            square[12] = mark;
        
        else if (choice == 13 && square[13] == 13)
            square[13] = mark;
        
        else if (choice == 14 && square[14] == 14)
            square[14] = mark;
        
        else if (choice == 15 && square[15] == 15)
            square[15] = mark;
        
        else if (choice == 16 && square[16] == 16)
            square[16] = mark;
            
            
        else
        {
            printf("Invalid move ");

            player--;
            getch();
        }
        i = checkwin();

        player++;
    }while (i ==  - 1);
    
    board();
    
    if (i == 1)
        printf("==>\aPlayer %d win ", --player);
    else
        printf("==>\aGame draw");

    getch();
}

int checkwin(){
    if (square[1] == square[2] && square[2] == square[3] && square[3] == square [4])
        return 1;
        
    else if (square[5] == square[6] && square[6] == square[7] && square[7] == square [8])
        return 1;
        
    else if (square[9] == square[10] && square[10] == square[11] && square[11] == square [12])
        return 1;
        
    else if (square[13] == square[14] && square[14] == square[15] && square[15] == square [16])
        return 1;
        
    
        //-----------------
        
    else if (square[1] == square[5] && square[5] == square[9] && square [9] == square [13])
        return 1;
        
    else if (square[2] == square[6] && square[6] == square[10] && square [10] == square [14])
        return 1;
        
    else if (square[3] == square[7] && square[7] == square[11] && square [11] == square [15])
        return 1;
        
    else if (square[4] == square[8] && square[8] == square[12] && square[12] == square[16])
        return 1;
        
        //-----------------------------
        
    else if (square[1] == square[2] && square[2] == square[3] && square[3] == square[4])
        return 1;
        
    else if (square[5] == square[6] && square[6] == square[7] && square[7] == square[8])
        return 1;

    else if (square[9] == square[10] && square[10] == square[11] && square[11] == square[12])
        return 1;
        
    else if (square[13] == square[14] && square[14] == square[15] && square[15] == square[16])
        return 1;
        
    else if (square[1] == square[6] && square[6] == square[11] && square[11] == square[16])
        return 1;
        
    else if (square[4] == square[7] && square[7] == square[10] && square[10] == square[13])
        return 1;
        
    else if (square[1] != 1 && square[2] != 2 && square[3] != 3 &&
        square[4] != 4 && square[5] != 5 && square[6] != 6 && square[7] 
        != 7 && square[8] != 8 && square[9] != 9 && square[10] != 10 
		&& square[11] != 11 && square[12] != 12 && square[13] != 13 
		&& square[14] != 14 && square[15] != 15 && square[16] != 16)

        return 0;
    else
        return  - 1;
}

void board(){
    system("cls");
    printf("\n\n\tTic Tac Toe\n\n");

    printf("Player 1 (X)  -  Player 2 (O)\n\n\n");


    printf("      |      |      |		\n");
    printf("  %d   |  %d   |  %d   |  %d  \n", square[1], square[2], square[3], square[4]);

    printf("______|______|______|______\n");
    printf("      |      |      |     \n");

    printf("  %d   |  %d   |  %d   |  %d  \n", square[5], square[6], square[7], square[8]);
    
    printf("______|______|______|______\n");
    
    printf("      |      |      |		\n");
    printf("  %d   |  %d  |  %d  |  %d  \n", square[9], square[10], square[11], square[12]);

    printf("______|______|______|_____\n");
    printf("      |      |      |     \n");

    printf("  %d  |  %d  |  %d  |  %d  \n", square[13], square[14], square[15], square[16]);

    printf("      |      |      | \n\n");
}

//13. Function Tic Tac Toe PvC
void tictac_pvc(){
	system("cls");
 	menu();
 	getch();
}

void menu(){
	int choice;
	system("cls");
	
	printf("\n--------MENU--------");
	printf("\n1 : Play with X");
	printf("\n2 : Play with O");
	printf("\n3 : Exit");
	printf("\nEnter your choice:>");
	scanf("%d",&choice);
	turn = 1;
	
	switch (choice){
	case 1:
		player = 1;
		comp = 0;
		player_first();
		break;
		
	case 2:
		player = 0;
		comp = 1;
		start_game();
		break;
		
	case 3:
		exit(1);
	
	default:
		menu();
	}
}

int make2(){
	if(board_pvc[5] == 2)
		return 5;
	if(board_pvc[2] == 2)
		return 2;
	if(board_pvc[4] == 2)
		return 4;
	if(board_pvc[6] == 2)
		return 6;
	if(board_pvc[8] == 2)
		return 8;
	return 0;
}

int make4(){
	if(board_pvc[1] == 2)
		return 1;
	if(board_pvc[3] == 2)
		return 3;
	if(board_pvc[7] == 2)
		return 7;
	if(board_pvc[9] == 2)
		return 9;
	return 0;
}

int posswin(int p){
	// p==1 then X   p==0  then  O
	int i;
	int check_val,pos;

	if(p == 1)
			check_val = 18;
	else
		check_val = 50;

	i = 1;
	while(i<=9)//row check
	{
		if(board_pvc[i] * board_pvc[i+1] * board_pvc[i+2] == check_val){
			if(board_pvc[i] == 2)
				return i;
			if(board_pvc[i+1] == 2)
				return i+1;
			if(board_pvc[i+2] == 2)
				return i+2;
		}
		i+=3;
	}

	i = 1;
	while(i<=3)//column check
	{
		if(board_pvc[i] * board_pvc[i+3] * board_pvc[i+6] == check_val)
 		{
			if(board_pvc[i] == 2)
				return i;
			if(board_pvc[i+3] == 2)
				return i+3;
			if(board_pvc[i+6] == 2)
				return i+6;
		}
		i++;
	}

	if(board_pvc[1] * board_pvc[5] * board_pvc[9] == check_val)
	{
		if(board_pvc[1] == 2)
			return 1;
		if(board_pvc[5] == 2)
			return 5;
		if(board_pvc[9] == 2)
			return 9;
	}

	if(board_pvc[3] * board_pvc[5] * board_pvc[7] == check_val)
	{
		if(board_pvc[3] == 2)
			return 3;
		if(board_pvc[5] == 2)
			return 5;
		if(board_pvc[7] == 2)
			return 7;
	}
	
	return 0;
}

void go(int n){
	if(turn % 2)
		board_pvc[n] = 3;
	else
		board_pvc[n] = 5;
		
	turn++;
}

void player_first(){
	int pos;
	
	check_draw();
	draw_board();
	gotoxy(30,18);
	printf("Your Turn :> ");
	scanf("%d",&pos);

	if(board_pvc[pos] != 2)
		player_first();

	if(pos == posswin(player)){
		go(pos);
		draw_board();
		gotoxy(30,20);
		
		//textcolor(128+RED);
		printf("Player Wins");
		getch();
		exit(0);
	}

	go(pos);
	draw_board();
	start_game();
}

void start_game(){
// p==1 then X   p==0  then  O
	if(posswin(comp)){
	go(posswin(comp));
	flag = 1;
	}
	else
		if(posswin(player))
			go(posswin(player));
		else
			if(make2())
				go(make2());
			else
				go(make4());
			draw_board();
	
	if(flag){
		gotoxy(30,20);
	
		//textcolor(128+RED);
		printf("Computer wins");
		getch();
	}
	else
		player_first();
}

void check_draw(){
	if(turn > 9){
		gotoxy(30,20);
		
		//textcolor(128+RED);
		printf("Game Draw");
		getch();
		exit(0);
	}
}

void draw_board(){
	int j;
	
	for(j=9;j<17;j++){
		gotoxy(35,j);
		printf("|       |");
	}
	
	gotoxy(28,11);
	printf("-----------------------");
	gotoxy(28,14);
	printf("-----------------------");
	
	for(j=1;j<10;j++){
		if(board_pvc[j] == 3)
			put_X_O('X',j);
		else
			if(board_pvc[j] == 5)
				put_X_O('O',j);
	}
}

void put_X_O(char ch,int pos){
	int m;
	int x = 31, y = 10;
	
	m = pos;
	
	if(m > 3){
		while(m > 3){
			y += 3;
			m -= 3;
		}
	}
	
	if(pos % 3 == 0)
		x += 16;
	else{
		pos %= 3;
		pos--;
		
		while(pos){
			x+=8;
			pos--;
		}
	}
	
	gotoxy(x,y);
	printf("%c",ch);
}

//Function Algo Market
void Algomarket(){
	int option;
  	do {
	    system("cls");
	    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    printf("\n        =                 WELCOME                   =");
	    printf("\n        =                   TO                      =");
	    printf("\n        =                ALGOMARKET                 =");
	    printf("\n        =                MANAGEMENT                 =");
	    printf("\n        =                  SYSTEM                   =");
	    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	    puts ("");
   
	    puts ("Algomarket's Menu:");
	    puts ("1. Shopping");
	    puts ("2. History");
	    puts ("3. List Of Product (Sort By Name)");
	    puts ("4. List Of Product (Sort by Quantity)");
	    puts ("5. Our Group's Members");
	    puts ("6. Exit\n");
	    printf ("Select Your Choice: ");
	    scanf ("%d", &option);
	    getchar ();

    
      	switch(option){
        	case 1 :{
          		system("cls");
			    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
			    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			    printf("\n        =                 INSERT                    =");
			    printf("\n        =                  YOUR                     =");
			    printf("\n        =                GROCERIES                  =");
			    printf("\n        =                 IN THIS                   =");
			    printf("\n        =                  MENU                     =");
			    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
			    puts ("");
		        insertData();
		        printf ("Item(s) Successfully added!\n");
		        printf ("Press Enter to Continue...");      
		        getchar ();
		        break;
        	}
        
        	case 2 :{
		        system("cls");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                 LIST OF                   =");
				printf("\n        =                  YOUR                     =");
				printf("\n        =                GROCERIES                  =");
				printf("\n        =              IN ALGOMARKET                =");
				printf("\n        =                  MENU                     =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
		        showData();
		        printf ("\nPress Enter to Continue...");      
		        getchar ();
        		break;
        	}
        	
        	case 3 :{
	          	system("cls");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                 LIST OF                   =");
				printf("\n        =                  YOUR                     =");
				printf("\n        =                GROCERIES                  =");
				printf("\n        =              AFTER SORTING                =");
				printf("\n        =            THEM BASED ON NAME             =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
	          	sortingProduct();
	          	printf ("\nProduct List Has Been Sorted!\n");
	          	printf ("Press Enter to Continue...");
	          	getchar ();
          		break;
        	}
        
        	case 4:{
	          	system("cls");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                 LIST OF                   =");
				printf("\n        =                  YOUR                     =");
				printf("\n        =                GROCERIES                  =");
				printf("\n        =              AFTER SORTING                =");
				printf("\n        =         THEM BASED ON QUANTITY            =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
	          	sortingQuantity();
	          	printf ("\nProduct List Has Been Sorted!\n");
	          	printf ("Press Enter to Continue...");
	          	getchar ();
          		break;
        	}
        	
        	case 5:{
	          	system("cls");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                 LIST OF                   =");
				printf("\n        =                   OUR                     =");
				printf("\n        =             GROUP'S MEMBERS               =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
				puts ("Anggota Kelompok :");
				puts ("1. Joanna Lynn Yosdorus  (2602081632)");
				puts ("2. Keisha Natasya Ghazali (2602080895)");
				puts ("3. Louis Oktovianus (2602078884)");
				puts ("4. Robert Tanriwan (2602076071)");
				puts ("5. Verren Angelina Saputra (2602093600)");
	          	printf ("Press Enter to Continue...");
	          	getchar ();
				break;
			}
			
			case 6:{
				break;
			}
		
        	default:{
          	puts ("\nOption Not Found");
          	printf ("Press Enter to Continue...");
          	getchar ();
          	break;
        	}
      	}

      	puts ("");
      	puts ("");
      	puts ("");
      	
    } while (option !=6 );
        system("cls");
		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
		printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		printf("\n        =                  THANK YOU                  =");
		printf("\n        =                   SO MUCH                   =");
		printf("\n        =                  AND HAVE A                 =");
		printf("\n        =                   NICE DAY                  =");
		printf("\n        =   (Joanna, Keisha, Louis, Robert, Verren)   =");
		printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
			
}

void swap(struct databelanja *a, struct databelanja *b){
	struct databelanja temp = *a;
	*a = *b;
  	*b = temp;
}

void insertData(){
    ptr = fopen("belanja.txt", "r");
          
    int xi = 0;
       
    while (!feof(ptr)){
      	fscanf(ptr, "%d %[^\n]", &temp[xi].quantity, &temp[xi].barang);
      	if(temp[xi].quantity != 0)xi++;
    }
          
    puts ("Please Insert Your Groceries!");
    puts ("\nExample :");
    puts ("Insert How Many Groceries You Will Buy: 2");
    puts ("1. What Name of Groceries You Will Buy : Hello Panda");
    puts ("2. How Many Type of Groceries You Will Buy : 2 ");
    printf ("Item(s) Successfully added!\n");
    puts("\n");
    
    printf ("Insert How Many Groceries You Will Buy: ");
    scanf ("%d", &groceries);
    getchar ();
    puts ("");
  	
  	int z = xi;
  	 
  	for (int k=0; k<xi; k++ ){
        strcpy(hist[k].kata, temp[k].barang);
        hist[k].banyak = temp[k].quantity;
    }
	    
    for (int i = 0; i<groceries; i++){
       	printf ("Groceries #%d", i+1);
    	puts("");
       	printf ("1. What Type of Groceries You Will Buy\t\t: ");
       	scanf ("%[^\n]", &belanja[i].nama);
       	getchar ();      
       	printf ("2. How Many Type of Groceries You Will Buy\t: ");
       	scanf ("%d", &belanja[i].jumlah);
       	getchar ();
	
		int flag = 0;
        for (int k=0; k<=xi; k++ ){
            if (strcmp(hist[k].kata, belanja[i].nama) == 0){
             	hist[k].banyak = (hist[k].banyak + belanja[i].jumlah);
            	flag = 1;
            	break;
            }
        }
        
        if (flag == 0){
        	strcpy(hist[z].kata, belanja[i].nama);
            hist[z].banyak = belanja[i].jumlah;
            z++;
		}
		      
       puts ("");
     
     }
	fclose(ptr);  
	ptr = fopen("belanja.txt", "w");
	
    for (int i = 0 ; i<z ; i++){
     	fprintf(ptr,"%d ", hist[i].banyak);
     	fprintf(ptr,"%s\n", hist[i].kata);
   	}
   fclose(ptr);
}

void showData(){
  	puts ("Your History from Shopping!!!\n");
  	ptr = fopen("belanja.txt", "r");
  	char c;
    while ((c = fgetc(ptr)) != EOF){
        printf ("%c", c);
    }
  	fclose(ptr);
}

void sortingProduct(){
	int n = 0;
   	puts ("List Of Your Groceries After Sorting\n");
   	ptr = fopen("belanja.txt", "r");
   	while(!feof(ptr)){
        fscanf(ptr,"%d %[^\n]\n",&belanja[n].jumlah,&belanja[n].nama);
        n++;
        }
  
    for(int i=0;i<(n-1);i++){
	    for(int j=0;j<(n-(i+1));j++){
		 	if(strcmpi(belanja[j].nama,belanja[j+1].nama) > 0 ){
		 	    swap(&belanja[j],&belanja[j+1]); 
     		}   
	    }  
    }
    
    ptr = fopen("belanja.txt", "w");
    
    ptr = fopen("belanja.txt", "a");
	for(int i=0;i<n;i++){
	    printf("%d %s\n",belanja[i].jumlah,belanja[i].nama);
	    fprintf(ptr, "%d %s\n",belanja[i].jumlah,belanja[i].nama);
	}
	
	fclose(ptr);
}

void sortingQuantity(){
    int z = 0;
    puts ("List Of Your Groceries After Sorting\n");
    ptr = fopen("belanja.txt", "r");
    while(!feof(ptr)){
        fscanf(ptr,"%d %[^\n]\n",&belanja[z].jumlah,&belanja[z].nama);
        z++;
    }
  
   	for(int i=0;i<(z-1);i++){
	   	for(int j=0;j<(z-(i+1));j++){
       	if (belanja[j].jumlah > belanja[j+1].jumlah){
         	swap(&belanja[j], &belanja[j+1]);
       	}
       	if (belanja[j].jumlah == belanja[j+1].jumlah && strcmpi(belanja[j].nama, belanja[j+1].nama)>0){
         	swap(&belanja[j],&belanja[j+1]);
       	}
	        }  
     	}
    
    ptr = fopen("belanja.txt", "w");
    
    ptr = fopen("belanja.txt", "a");
    
	for(int i=0;i<z;i++){
	    printf("%d %s\n",belanja[i].jumlah,belanja[i].nama);
	    fprintf(ptr, "%d %s\n",belanja[i].jumlah,belanja[i].nama);
	}
	
	fclose(ptr);
}

//Function Google Mini
void gugel_mini(){
	int option;
  	do {
	    system("cls");
	    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    printf("\n        =                 WELCOME                   =");
	    printf("\n        =                   TO                      =");
	    printf("\n        =               MINI GOOGLE                 =");
	    printf("\n        =                MANAGEMENT                 =");
	    printf("\n        =                 SYSTEM                    =");
	    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	    puts ("");
   		
	    puts ("Menu Google Sederhana:");
	    puts ("1. Insert File's Name");
	    puts ("2. Show current Files");
	    puts ("3. Search Files");
	    puts ("4. Show Search History");
	    puts ("5. Clear Files/History");
	    puts ("6. Our Group's Members");
	    puts ("7. Exit\n");
	    printf ("Select Your Choice: ");
	    scanf ("%d", &option);
	    getchar ();

    
      	switch(option){
        	case 1 :{
          		system("cls");
			    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
			    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			    printf("\n        =                 INSERT                    =");
			    printf("\n        =                  YOUR                     =");
			    printf("\n        =               FILE'S NAME                 =");
			    printf("\n        =                 IN THIS                   =");
			    printf("\n        =                  MENU                     =");
			    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
			    puts ("");
			    printf (">> ");
		        insertTheData();
		        printf ("Name of File Successfully added!\n");
		        printf ("Press Enter to Continue...");      
		        getchar ();
		        break;
        	}
        	
        	case 2 :{
        		system("cls");
        		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
			    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			    printf("\n        =                 SHOWING                   =");
			    printf("\n        =                 CURRENT                   =");
			    printf("\n        =                  FILES                    =");
			    printf("\n        =                 IN THIS                   =");
			    printf("\n        =                  MENU                     =");
			    printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			    printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
			    puts ("");
			    showFiles();
			    printf ("Press Enter to Continue...");      
		        getchar ();
				break;
			}
        
        	case 3 :{
		        system("cls");
		        int filecount = countingFiles();
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                   SEARCH                  =");
				printf("\n        =                    FILES                   =");
				printf("\n        =                   BY WORD                  =");
				printf("\n        =                   IN THIS                 =");
				printf("\n        =                    MENU                   =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
				if (filecount < 7 ){
					printf("Insufficient Amount of Files. Please Add More Files!! \n");
					printf("Current Amount of Files : %d (Minimum: 7)\n", filecount);
				} else {
					readAndSearchFile();
				}
		        printf ("\nPress Enter to Continue...");      
		        getchar ();
        		break;
        	}
        	
        	case 4 :{
	          	system("cls");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                   SHOW                    =");
				printf("\n        =                  SEARCH                   =");
				printf("\n        =                  HISTORY                  =");
				printf("\n        =                  IN THIS                  =");
				printf("\n        =                   MENU                    =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
	          	showHistoryData();
//	          	printf ("\nHistory Data Successfully Saved!\n");
	          	printf ("\nPress Enter to Continue...");
	          	getchar ();
          		break;
        	}
        	
        	case 5:{
        		system("cls");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                   CLEAR                   =");
				printf("\n        =                 FILES OR                  =");
				printf("\n        =                  HISTORY                  =");
				printf("\n        =                  IN THIS                  =");
				printf("\n        =                   MENU                    =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
				printf ("\n1. Clear Files in core.txt\n");
				printf ("2. Clear Search History\n");
				printf (">> ");
				
				int pilih;
				scanf ("%d", &pilih); getchar();
				
				switch (pilih){
					case 1:{
						clearFiles();
						puts ("\nFiles Have Successfully Been Cleared");
			          	printf ("Press Enter to Continue...");
			          	getchar ();
						break;
					}
					case 2:{
						clearHistory();
						puts ("\nHistory Has Successfully Been Cleared");
			          	printf ("Press Enter to Continue...");
			          	getchar ();
						break;
					}
					default:{
						puts ("\nOption Not Found");
			          	printf ("Press Enter to Continue...");
			          	getchar ();
			          	break;
					}
				}
				break;
			}
        	
        	case 6:{
	          	system("cls");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n        =                 LIST OF                   =");
				printf("\n        =                   OUR                     =");
				printf("\n        =             GROUP'S MEMBERS               =");
				printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
				puts ("");
				puts ("Anggota Kelompok :");
				puts ("1. Jason DwiSeptian Sutjipta (260208393)");
				puts ("2. Joanna Lynn Yosdorus  (2602081632)");
				puts ("3. Keisha Natasya Ghazali (2602080895)");
				puts ("4. Louis Oktovianus (2602078884)");
				puts ("5. Robert Tanriwan (2602076071)");
				puts ("6. Verren Angelina Saputra (2602093600)");
	          	printf ("\nPress Enter to Continue...");
	          	getchar ();
				break;
			}
			
			case 7:{
				break;
			}
		
        	default:{
          	puts ("\nOption Not Found");
          	printf ("Press Enter to Continue...");
          	getchar ();
          	break;
        	}
      	}

      	puts ("");
      	puts ("");
      	puts ("");
      	
    } while (option !=7 );
        system("cls");
		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
		printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		printf("\n        =                    THANK YOU                    =");
		printf("\n        =                     SO MUCH                     =");
		printf("\n        =                    AND HAVE A                   =");
		printf("\n        =                     NICE DAY                    =");
		printf("\n        = (Jason, Joanna, Keisha, Louis, Robert, Verren)  =");
		printf("\n        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		printf("\n  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
}

void insertTheData(){
	char filename[105];
	int count=1;
	
	do{
		scanf ("%[^\n]", &filename);
		getchar ();
		
		int len = strlen(filename);
		count = 1;
		for (int i=0; i<len; i++){
			if (filename[i]==' '){
				count++;
			} else{
				count+=0;
			}
		}
		
		if(count<5 || count>10){
			printf("Wrong Input\n");
		}
		
		else break;
		
	}while(count<5 || count>10);
		
	char namafile[105];
	strcpy(namafile,filename);
	
	char delim[] = " ";
	char *token = strtok(filename, delim);
  strcat(filename,".txt");
	
	FILE *fp1 = fopen(filename, "w");
	fprintf (fp1, "%s", namafile);
	
	FILE *fp2 = fopen("core.txt", "a+");
	
	int flag = 1;
	char isiCore[50] = {'\0'};
	
	while (!feof(fp2)){
		fscanf (fp2, "%s", isiCore);
		if (strcmp(filename, isiCore) == 0) flag = 0;
	}
	if (flag == 1) fprintf (fp2, "\n%s", filename);
	
	fclose(fp1);
	fclose(fp2);
	

}

void readAndSearchFile(){
  FILE*core = fopen("core.txt", "r");
  FILE*hist = fopen("history.txt", "a");
  
  char cari[50] = {'\0'};
  printf ("Search Word: ");
  scanf ("%s", &cari); getchar();
  fprintf (hist, "Find: %s\n", cari);

  char namaFile[100][50] = {'\0'};
  int isi = 0;
  
   printf ("\nResult:\n");
   fprintf (hist, "Result:\n");
   
  while (!feof(core)){
    fscanf(core, "%s", namaFile[isi]);

    FILE*isiCore = fopen(namaFile[isi], "r");
    
    char kataCore[100][50] = {'\0'};
    int kata = 0;
    
   
    while (!feof(isiCore)){
    	fscanf (isiCore, "%s", kataCore[kata]);
    	if (strcmp(cari, kataCore[kata]) == 0){
    		    printf ("- %s\n", namaFile[isi]);
    		    fprintf (hist, "- %s\n", namaFile[isi]); 
			    break;
		}
    	kata++;
	}
    isi++;
    fclose(isiCore);
  }
  fprintf (hist, "\n");
	fclose(core);
	fclose(hist);
	return;
}

void showFiles(){

	FILE*core = fopen("core.txt", "r");
	
	char namaFile[50] = {'\0'};
  	while (!feof(core)){
    fscanf(core, "%s", namaFile);

    FILE*isiCore = fopen(namaFile, "r");
   	printf ("%s\n", namaFile);
    char c;
    while ((c = fgetc(isiCore)) != EOF){
      printf ("%c", c);
    }
    printf ("\n\n");  
    fclose(isiCore);
  }
fclose (core);
return;
}

int countingFiles(){
  FILE*core = fopen("core.txt", "r");	
  char namaFile[100][50] = {'\0'};
  int isi = 0;
  while (!feof(core)){
    fscanf(core, "%s", namaFile[isi]);
    isi++;
  }
  if (namaFile[0][0] == '\0') return 0;
  fclose(core);
	return isi;
}

void showHistoryData(){
	
	FILE*hist = fopen("history.txt", "r");
	char c;
	
	while ((c = fgetc(hist))!=EOF){
		printf ("%c", c);
	}
	
	fclose(hist);
	
 return;
}

void clearFiles(){
	FILE*core = fopen ("core.txt", "w");
	fclose(core);
return;
}

void clearHistory(){
	FILE*hist = fopen ("history.txt", "w");
	fclose(hist);
return;
}

//Function Sequence of prime numbers
void prime_num(){
	long long int a, batas, p, c, b;
	printf("masukkan batas deret : ");
            scanf("%lld",&batas);
            p=1;
            for(a=2; p<=batas; a++){
                c=0;
                for(b=2; b<a; b++){
                    if(a%b==0){
                        c=c+1;
                    }
                }
                if(c<1){
                    printf("%lld ",a);
                    p=p+1;
                }
            }
            printf("\n");
            getchar();
}

//Funtion Library
void library (){
	int ch;

    while(1){
        system("cls");
        printf("<== Library Management System ==>\n");
        printf("1.Add Book\n");
        printf("2.Books List\n");
        printf("3.Remove Book\n");
        printf("4.Issue Book\n");
        printf("5.Issued Book List\n");
        printf("0.Exit\n\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);

        switch(ch){
        case 0:
            exit(0);

        case 1:
            addBook();
            break;

        case 2:
            booksList();
            break;

        case 3:
            del();
            break;

        case 4:
            issueBook();
            break;

        case 5:
            issueList();
            break;

        default:
            printf("Invalid Choice...\n\n");

        }
        printf("Press Any Key To Continue...");
        getch();
    }
}

void addBook(){
    char myDate[12];
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    sprintf(myDate, "%02d/%02d/%d", tm.tm_mday, tm.tm_mon+1, tm.tm_year + 1900);
    strcpy(b.date, myDate);

    fp = fopen("books.txt", "ab");

    printf("Enter book id: ");
    scanf("%d", &b.id);

    printf("Enter book name: ");
    fflush(stdin);
    gets(b.bookName);

    printf("Enter author name: ");
    fflush(stdin);
    gets(b.authorName);

    printf("Book Added Successfully");

    fwrite(&b, sizeof(b), 1, fp);
    fclose(fp);
}


void booksList(){

    system("cls");
    printf("<== Available Books ==>\n\n");
    printf("%-10s %-30s %-20s %s\n\n", "Book id", "Book Name", "Author", "Date");

    fp = fopen("books.txt", "rb");
    while(fread(&b, sizeof(b), 1, fp) == 1){
        printf("%-10d %-30s %-20s %s\n", b.id, b.bookName, b.authorName, b.date);
    }

    fclose(fp);
}

void del(){
    int id, f=0;
    system("cls");
    printf("<== Remove Books ==>\n\n");
    printf("Enter Book id to remove: ");
    scanf("%d", &id);

    FILE *ft;

    fp = fopen("books.txt", "rb");
    ft = fopen("temp.txt", "wb");

    while(fread(&b, sizeof(b), 1, fp) == 1){
        if(id == b.id){
            f=1;
        }else{
            fwrite(&b, sizeof(b), 1, ft);
        }
    }

    if(f==1){
        printf("\n\nDeleted Successfully.");
    }else{
        printf("\n\nRecord Not Found !");
    }

    fclose(fp);
    fclose(ft);

    remove("books.txt");
    rename("temp.txt", "books.txt");

}


void issueBook(){

    char myDate[12];
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    sprintf(myDate, "%02d/%02d/%d", tm.tm_mday, tm.tm_mon+1, tm.tm_year + 1900);
    strcpy(s.date, myDate);

    int f=0;

    system("cls");
    printf("<== Issue Books ==>\n\n");

    printf("Enter Book id to issue: ");
    scanf("%d", &s.id);

    //Check if we have book of given id
    fp = fopen("books.txt", "rb");

    while(fread(&b, sizeof(b), 1, fp) == 1){
        if(b.id == s.id){
            strcpy(s.bookName, b.bookName);
            f=1;
            break;
        }
    }

    if(f==0){
        printf("No book found with this id\n");
        printf("Please try again...\n\n");
        return;
    }

    fp = fopen("issue.txt", "ab");

    printf("Enter Student Name: ");
    fflush(stdin);
    gets(s.sName);

    printf("Enter Student Class: ");
    fflush(stdin);
    gets(s.sClass);

    printf("Enter Student Roll: ");
    scanf("%d", &s.sRoll);

    printf("Book Issued Successfully\n\n");

    fwrite(&s, sizeof(s), 1, fp);
    fclose(fp);
}

void issueList(){
    system("cls");
    printf("<== Book Issue List ==>\n\n");

    printf("%-10s %-30s %-20s %-10s %-30s %s\n\n", "S.id", "Name", "Class", "Roll", "Book Name", "Date");

    fp = fopen("issue.txt", "rb");
    while(fread(&s, sizeof(s), 1, fp) == 1){
        printf("%-10d %-30s %-20s %-10d %-30s %s\n", s.id, s.sName, s.sClass, s.sRoll, s.bookName, s.date);
    }

    fclose(fp);
}

// Function Cek Bytes
void bytes_check (){
	printf ("Ukuran byte dari tipe data: ");
	printf ("Nilai dari Signed Short Integer     :  %zu bytes\n", sizeof(signed short int));
	printf ("Nilai dari Short Integer            :  %zu bytes\n", sizeof(short int));	
	printf ("Nilai dari Integer                  :  %zu bytes\n", sizeof(int));
	printf ("Nilai dari Unsigned Integer         :  %zu bytes\n", sizeof(unsigned int));
	printf ("Nilai dari Signed Integer           :  %zu bytes\n", sizeof(signed int));
	printf ("Nilai dari Long Integer             :  %zu bytes\n", sizeof(long int));		
	printf ("Nilai dari Unsigned Long Integer    :  %zu bytes\n", sizeof(unsigned long int));
	printf ("Nilai dari Signed Long Integer      :  %zu bytes\n", sizeof(signed long int));
	printf ("Nilai dari Long Long Integer        :  %zu bytes\n", sizeof(long long int));	
	printf ("\n");
	printf ("Nilai dari Float                    :  %zu bytes\n", sizeof(float));
	printf ("Nilai dari Double                   :  %zu bytes\n", sizeof(double));
	printf ("Nilai dari Long Double              :  %zu bytes\n", sizeof(long double));
	printf ("\n"); 
	printf ("Nilai dari Character                :  %zu bytes\n", sizeof(char));
	printf ("Nilai dari Unsigned Character       :  %zu bytes\n", sizeof(unsigned char));
	printf ("Nilai dari Signed Character         :  %zu bytes\n", sizeof(signed char));	
	printf ("\n");
	
	int angka  = 345;
	char huruf = 'A';
	char kata[10]  = "Saya";
	char kata2[50] = "AlgorithmProgramming";
	float angka_koma = 2.5f;
	double angka_berkoma = 100.00;
	
	printf ("Ukuran byte dari variabel :");
	printf ("Nilai dari Variabel Angka \"%d\"    :  %zu bytes\n", angka, sizeof(angka));
	printf ("Nilai dari Variabel Karakter \"%c\" :  %zu bytes\n", huruf, sizeof(huruf));
	printf ("Nilai dari Variabel String \"%s\"   :  %zu bytes\n", kata, sizeof(kata));
	printf ("Nilai dari Variabel String \"%s\"   :  %zu bytes\n", kata2, sizeof(kata2));
	printf ("Nilai dari Variabel Float \"%.1f\"    :  %zu bytes\n", angka_koma, sizeof(angka_koma));
	printf ("Nilai dari Variabel Double \"%.2lf\"   :  %zu bytes\n", angka_berkoma, sizeof(angka_berkoma));
	getchar ();
}

//Function Struct Problem
void strak_prob(){
	puts ("Menu Tugas Struct!!!");
	puts ("1. Soal 1");
	puts ("2. Soal 2");
	puts ("3. Soal 3");
	puts ("4. Soal 4");
	puts ("5. Soal 5");
	puts ("6. Soal 6");
	puts ("7. Soal 7");
	printf ("Masukan Pilihan Anda: ");
	
	int inputan;
	scanf("%d", &inputan);
	getchar ();
	
	switch (inputan) {
		case 1:{
			system ("cls");
			structno1 ();
			break;
		}
		
		case 2:{
			system ("cls");
			structno2 ();
			break;
		}
		
		case 3:{
			system ("cls");
			structno3 ();
			break;
		}
		
		case 4:{
			system ("cls");
			structno4 ();
			break;
		}
		
		case 5:{
			system ("cls");
			structno5 ();
			break;
		}

		case 6:{
			system ("cls");
			structno6 ();
			break;
		}
		
		case 7:{
			system ("cls");
			structno7 ();
			break;
		}
		
	}	
}

void structno1 (){
	puts ("1. Create a structure with the following definition:");
	puts ("Struct Student consists of student number, name, address, place and date of birth.");
	puts ("Address is a struct itself consists of street name, number, city, province.");
	puts ("Date of birth is a struct with element: date, month and year.");
	puts ("\nThere Is No Output In Compiler, Because This Question Only Asks to Create a Struct");
	struct identitas_dari_murid array_murid_murid[MAX];
}


void structno2 (){
	puts ("2. Based on previous exercise create a program to input 5 students data (use array of structure)");
	puts ("Answer:\n\n");
	struct identitas_dari_murid array_murid_murid[MAX];
	
	for (int i=0; i<MAX; i++){
		printf("Input Data Number #%d\n", i+1);
		printf ("Masukkan Student ID: ");
		scanf("%s", &array_murid_murid[i].nomor_induk_mahasiswa); fflush (stdin);
		printf("Masukkan Nama Kamu: ");
		scanf("%s", &array_murid_murid[i].nama_dari_murid); fflush(stdin);
		
		printf("Masukkan Nama Jalan: ");
		scanf("%d", &array_murid_murid[i].al.nama_jalan); fflush(stdin);
		printf("Masukkan Nomor Jalan: ");
		scanf("%d", &array_murid_murid[i].al.nomor_jalan); fflush(stdin);
		printf("Masukkan Nama Kota: ");
		scanf("%d", &array_murid_murid[i].al.nama_kota); fflush(stdin);
		printf("Masukkan Nama Provinsi: ");
		scanf("%d", &array_murid_murid[i].al.nama_provinsi); fflush(stdin);
		
		printf("Masukkan Tanggal Lahir: ");
		scanf("%d", &array_murid_murid[i].tgl.hari_lahir); fflush(stdin);
		printf("Masukkan Bulan Lahir: ");
		scanf("%d", &array_murid_murid[i].tgl.bulan_lahir);fflush(stdin);
		printf("Masukkan Tahun Lahir: ");
		scanf("%d", &array_murid_murid[i].tgl.tahun_lahir); fflush(stdin);
		
		printf("\n");
		printf("\n");		
	}
	
	for (int i=0; i<MAX; i++){
		printf("Mahasiswa Data #%d\n", i+1);
		printf ("Student ID: ");
		printf ("%s", array_murid_murid[i].nomor_induk_mahasiswa); 
		puts("");
		printf("Nama: ");
		printf("%s", array_murid_murid[i].nama_dari_murid);
		puts("");
		
		printf("Nama Jalan: ");
		printf("%d", array_murid_murid[i].al.nama_jalan);
		puts("");
		printf("Nomor Jalan: ");
		printf("%d", array_murid_murid[i].al.nomor_jalan);
		puts("");
		printf("Kota Asal: ");
		printf("%d", array_murid_murid[i].al.nama_kota);
		puts("");
		printf("Provinsi: ");
		printf("%d", array_murid_murid[i].al.nama_provinsi);
		puts("");
		
		printf("Tanggal Lahir: ");
		printf("%d", array_murid_murid[i].tgl.hari_lahir);
		puts("");
		printf("Bulan Lahir: ");
		printf("%d", array_murid_murid[i].tgl.bulan_lahir);
		puts("");
		printf("Tahun Lahir: ");
		printf("%d", &array_murid_murid[i].tgl.tahun_lahir);
		puts("");
		puts("");
		puts("");	

	}
}


void structno3 (){
	puts ("Create an application using array of structure to input 5 car types, and display them on the screen!");
	puts ("Answer:\n\n");
	
	for (int i = 0; i<MAX; i++){
		printf ("\nEnter details of car %d\n\n", i+1);
		printf ("Enter year: ");
		scanf ("%d", &arr_mobile[i].year);
		printf ("Enter model: ");
		scanf ("%s", arr_mobile[i].model);
		printf ("Enter engine power: ");
		scanf ("%d", &arr_mobile[i].engine_power);
		printf ("Enter Weight: ");
		scanf ("%f", &arr_mobile[i].weight);
	}
	
	printf ("\n");
	
	printf ("year\tmodel\t engine power\t weight\n");
	
	for (int i = 0; i<MAX; i++){
		printf ("%d\t%s\t  %d\t\t  %.2f\n", arr_mobile[i].year, arr_mobile[i].model, arr_mobile[i].engine_power, arr_mobile[i].weight);
	}
}

void structno4 (){
	puts ("Create a program to input 5 students data and display students with gpa >= 3.0 and gpa < 3.0");
	puts ("Answer: \n\n");
	for(int i = 0; i < 5; i++){
		printf ("Nama Mahasiswa : ");
		scanf("%s", &person[i].name);
		getchar ();
		printf ("GPA Mahasiswa : ");
		scanf("%f", &person[i].gpa);
		getchar ();
	}
	
	printf("\nMahasiswa Dengan GPA >= 3: \n");
	for(int i = 0; i < 5; i++){
		if(person[i].gpa >= 3){
			printf("%s\n", &person[i].name);
		}
	}
	
	puts("");
	printf("Mahasiswa Dengan GPA < 3: \n");
	for(int i = 0; i < 5; i++){
		if(person[i].gpa < 3){
			printf("%s\n", &person[i].name);
		}
	}
}

void structno5 (){
	puts ("Create a program (not using array) to receive input for studentScore struct and then display nim, name, subjectCode, sks, and grade.");
	puts ("Answer:\n\n");
	printf ("Input NIM : ");
	scanf("%s", &input.nim);
	getchar ();
	printf ("Input Nama : ");
	scanf("%s", &input.name);
	getchar ();
	printf ("Input Kode Mata Kuliah : ");
	scanf("%s", &input.subjectCode);
	getchar();
	printf ("Input SKS : ");
	scanf("%d", &input.sks);
	getchar ();
	printf ("Input Nilai / GPA : ");
	scanf("%s", &input.grade);
	getchar ();
	
	printf("NIM\t\t:%s\n", input.nim);
	printf("Name\t\t:%s\n", input.name);
	printf("Subject Code\t:%s\n", input.subjectCode);
	printf("SKS\t\t:%d\n", input.sks);
	printf("Grade\t\t:%s\n", input.grade);	
}


void structno6 (){
	puts ("Create a program using array of struct to input 5 subject score of 1st semester then display the student’s GPA!");
	puts ("Answer:\n\n");
	
	for (int i=0; i<MAX; i++){
		printf("Input Data ke-%d", i+1);
		puts("");
		printf("Masukan NIM kamu: "); 
		scanf("%s", &hasildata[i].nim);
		getchar();
		printf("Masukan nama kamu: "); 
		scanf("%s", &hasildata[i].name);
		getchar();
		printf("Masukan Subject Code kamu: "); 
		scanf("%s", &hasildata[i].subjectCode);
		getchar();
		printf("Masukan SKS kamu: "); 
		scanf("%d", &hasildata[i].sks);
		getchar();
		printf("Masukan Grade kamu (A,B,C,D,E): "); 
		scanf("%s", &hasildata[i].grade);
		getchar();
			puts("\n");
	}
	
	puts("");
	puts("");
	puts("");
	puts("");
	puts("");
	
	for (int i=0; i<MAX; i++){
		printf("Hasil Data ke-%d", i+1);
		puts("");
		printf("NIM\t\t:%s\n", hasildata[i].nim);
		printf("Name\t\t:%s\n", hasildata[i].name);
		printf("Subject Code\t:%s\n", hasildata[i].subjectCode);
		printf("SKS\t\t:%d\n", hasildata[i].sks);
		printf("Grade\t\t:%c\n", hasildata[i].grade);
		
		if (hasildata[i].grade == 'A'){
			printf("Weight Grade    :4\n");
		}
		else if (hasildata[i].grade == 'B'){
			printf("Weight Grade    :3\n");
		}
		else if (hasildata[i].grade == 'C'){
			printf("Weight Grade    :2\n");
		}
		else if (hasildata[i].grade == 'D'){
			printf("Weight Grade    :1\n");
		}
		else if (hasildata[i].grade == 'E'){
			printf("Weight Grade    :0\n");
		}
		
		puts("");
		puts("");
	}
}

union convert {
    unsigned int angkaangka;
    struct {
        unsigned int b1 : 8;
        unsigned int b2 : 8;
        unsigned int b3 : 8;
        unsigned int b4 : 8;
    } bytes;
};

void structno7 (){
	puts ("Create a program to convert 4 bytes unsigned integer to hexadecimal number system using UNION and BIT-FIELD");
	puts ("Answer:\n\n");
    union convert numsr;
    numsr.angkaangka = 12345678;
    printf("%x %x %x %x\n", numsr.bytes.b4, numsr.bytes.b3, numsr.bytes.b2, numsr.bytes.b1);
}
