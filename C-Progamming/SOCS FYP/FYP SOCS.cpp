#include<stdio.h>

	//PROBLEM A FYP//
int main(){
	printf ("Hello World\n");
	return 0;
}

	//PROBLEM B FYP//
int main(){
	int A,B;
	
	scanf ("%d %d", &A, &B);
	fflush (stdin);
	printf ("%d\n", A+B);
	
	return 0;
}

	//PROBLEM C FYP//
int main (){
	int N, M;
	int b;
	
	scanf ("%d %d", &N, &M);
	
	b = N+M;
	
	for (N>=1; N<b; N++){
		printf ("%d\n", N);
	}
	
	return 0;
}

	//PROBLEM D FYP//
int main() {
  int a, b;
  long long int c=0;
  
  scanf("%d %d", &a, &b);

  for (int i=a; i<=b;i++) {
     c+=i;
    }
    
    printf ("%lld\n", c);
    
  return 0;
}

	//PROBLEM E FYP//
int main(){
	int a;
	scanf ("%d", &a);
	
	(a % 2 == 0)? printf("EVEN\n"): printf("ODD\n");
	
	return 0;
}




