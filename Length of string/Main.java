#include<stdio.h>
int main()
{
  //Type your code here
  char str[100], count=0;
  int i;
 gets(str);
  for(i=0; str[i]!='\0'; i++)
  {
    count++;
  
  }
  
  printf("%d", count);

  return 0;
}