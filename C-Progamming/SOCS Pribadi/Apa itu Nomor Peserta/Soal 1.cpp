#include<stdio.h>
#include<string.h>

struct file {
  char nama[1005];
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
      scanf("%[^\n]", &data[i].nama);
      getchar();
    
      data[i].idx = i+1;
    }
    
    for (int i=0; i<tc-1; i++){
      for (int j=0; j<tc-i-1; j++){
        if (strcmp (data[j].nama, data[j+1].nama) > 0){
          swap (&data[j], &data[j+1]);
        }
      }
    }
    
//    printf ("After Sorting:\n");
//    for (int i=0; i<tc; i++){
//      printf("%s\n", data[i].nama);
//    }
    
    
    for (int i=0; i<tc; i++){
      printf("%d\n", data[i].idx);
    }
    
    return 0;
}
