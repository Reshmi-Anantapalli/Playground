#include<stdio.h>
#include<math.h>

/*int power_fun(int base, int exp)
{
int i, sum=1;
for(i=0;i<exp;i++)
{
sum = sum *base;
}
return sum;
}*/

int main()
{
  //Type your code here
  int n, a[128];
  scanf("%d", &n);
  int rem, sum=0, i=0, rem_count=0, j;
  while(n!=0)
  {
    rem=n%10;
  
  sum = sum + rem*pow(2,i);
      n=n/10;
  i++;
  }
  while(sum!=0)
  {
  a[rem_count++]=sum % 8;
    sum = sum /8;
  }
  for(j=rem_count-1;j>=0;j--)
  {
  printf("%d", a[j]);
  }
  
}