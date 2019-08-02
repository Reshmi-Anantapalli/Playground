#include<stdio.h>

int main()
{
  //Type your code here
  char s[100];
 gets(s);
  int i, count=1;
  
  for(i=0;s[i]!='\0';i++)
  {
  if(s[i]==' ')
    count++;
  }
  printf("%d", count);
}