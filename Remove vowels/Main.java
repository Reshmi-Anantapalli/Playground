#include<stdio.h>
int isVowel(char c)
{
if(c == 'a' || c == 'A' || c == 'e' 
     || c== 'E' || c == 'i' || c == 'I' 
     || c == 'o' || c == 'O' || c == 'u' 
     || c == 'U')
{
return 0;
}
  else 
  {
  return 1;
  }
}
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int i;
  for(i=0;str[i]!='\0';i++)
  {
  if(isVowel(str[i]))
  {
  printf("%c", str[i]);
  }
  }
  
  
  return 0;
}