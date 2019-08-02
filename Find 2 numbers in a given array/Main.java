#include<stdio.h>
int main()
{
  	//type your code here

  int n, i, ind1=-1, ind2=-1, x, y;
  scanf("%d", &n);
  int a[n];
  for(i=0;i<n;i++)
  {
  scanf("%d", &a[i]);
  }
  scanf("%d%d", &x,&y);

  for(i=0;i<n;i++)
  {
  if(a[i]==x && ind1== -1)
  {
    ind1= i; 
  }
  
  if(a[i]==y && ind2== -1)
  {
    ind2= i;  
  }
    }
 printf("Element 1 index = %d\nElement 2 index = %d", ind1,ind2);

     
}