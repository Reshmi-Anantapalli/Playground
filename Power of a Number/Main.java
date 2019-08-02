#include <stdio.h>
int main()
{
  	//Your code here       
  int i,n, base, ans=1;
  scanf("%d", &base);
  scanf("%d", &n);
  
  if(n==0)
  {
  printf("1");
  }
  else if (n<0)
  {
  printf("Wrong input");
  }
  else
  {
  for(i=1;i<=n;i++)
  {
  ans = ans * base;
  }
    printf("%d", ans);
  }
    return 0;
}