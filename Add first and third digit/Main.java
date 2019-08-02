#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b,c;
  scanf("%d", &n);
  a=n%10;
  b=n/100;
  c=a+b;
  printf("%d", c);
  return 0;
}