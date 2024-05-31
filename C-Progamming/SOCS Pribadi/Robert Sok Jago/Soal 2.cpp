#include<stdio.h>
#include<string.h>

struct file {
  int nilai;
  int idx;
} data[1005];

void swap (struct file *x, struct file *y){
  file temp = *x;
  *x = *y;
  *y = temp;
}

int main(){
    int tc;
    scanf("%d", &tc);
    getchar();
    
    for (int i=0; i<tc; i++){
      scanf("%d", &data[i].nilai);
      getchar();
    
      data[i].idx = i+1;
    }
    
    //Proses Sorting dan Print Hasil Sorting
    for (int i=0; i<tc-1; i++){
      for (int j=0; j<tc-i-1; j++){
        if (data[j].nilai > data[j+1].nilai){
           swap (&data[j], &data[j+1]);
        }
      }
    }
    
    printf ("Hasil Sorting :");
    for (int i=0; i<tc; i++){
      printf(" %d", data[i].nilai);
    }
    puts ("");
    
    //Menghitung Mean (Rata-rata)
    float result;
    float total;
    for (int i=0; i<tc; i++){
      total += data[i].nilai;
    }
    
    result = total / tc;
    printf ("Mean : %.2lf\n", result);
    
    //Menentukan apakah rata-rata kelas itu lulus atau tidak
    float kkm = 60;
    printf ("KKM kelas adalah %.2lf\n", kkm);
    if (result < kkm){
      printf ("Kelas remedial karena dibawah KKM\n");
    }
    else if (result == kkm){
      printf ("Yang mengikuti remedial hanya yang bernilai di bawah KKM\n");
    }
    else {
      printf ("Kelas dinyatakan lulus karena berada diatas KKM\n");
    }
    
    //Menentukan nilai nilai yang di bawah KKM
    printf ("Nilai-nilai yang di bawah KKM:");
    for (int i=0; i<tc; i++){
      if (data[i].nilai < kkm){
        printf(" %d", data[i].nilai);
      }
      else {
        break;
      }
    }
    puts("");
    
    //Menentukan anak ke-berapa yang nilainya di bawah KKM
    printf ("anak-anak yang nilainya di bawah KKM:");
    for (int i=0; i<tc; i++){
      if (data[i].nilai < kkm){
        printf(" %d", data[i].idx);
      }
      else {
        break;
      }
    }
    puts("");
    
    return 0;
}
