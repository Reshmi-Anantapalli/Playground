#include<stdio.h>
int main()
{
  //Type your code here
  int n, i;
  int a=0, b=1, c;
 
  scanf("%d", &n);
 
  
  for(i=1;i<=n;++i)
  {
   printf("%d ", a);
   
     c=a+b;
    a=b;
    b=c;
  }
  return 0;
}