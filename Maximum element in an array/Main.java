#include<stdio.h>
int main()
{
  	//type your code here
  int n, i, l;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
  scanf("%d", &a[i]);
  }

l=a[0];

  for(i=0;i<n;i++)
  {
  
    if(a[i]>l)
    {
    l=a[i];

    }
  }
  printf("%d", l);
}