#include<stdio.h>
int main()
{
	//type your code here
	long int n;
  scanf("%ld", &n);
  if(n % 2 !=0)
  {
  printf("%ld", n-1);
  }
  else
  {
    n=(n/2)-1;
  printf("%ld", n);
  }
}