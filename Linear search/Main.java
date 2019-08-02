#include<stdio.h>
int main()
{
  //Type your code here
  int n, i, x;
  scanf("%d", &n);
int a[n];
  for(i=0;i<n;i++)
  {
  scanf("%d", &a[i]);
  }
  scanf("%d", &x);
  for(i=0;i<n;i++)
  {
  if(a[i] == x)
  {
    printf("%d", i+1);
    return 0;
  }
  }
   printf("%d isn't present in the array.", x);
   
  

  return 0;
}