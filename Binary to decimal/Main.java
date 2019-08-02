#include<stdio.h>
int main()
{
  //Type your code here
  int n, i=0, sum=0, rem;
  scanf("%d", &n);
  while(n!=0)
  {
  rem = n % 10;
    sum = sum + rem * pow(2,i);
    n = n / 10;
    i++;
  }
  printf("%d", sum);
  return 0;
}