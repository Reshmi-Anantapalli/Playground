#include<stdio.h>
int main()
{
	//type your code here
  char str[100];
int count=1;
  int i;
int l;
scanf("%s", &str);
for(l=0; str[l]!='\0';l++);
  if(l>20)
{
printf("Invalid Input");
}
else
{
for(i=0;i<l;i++)
{
if(str[i] == str[i+1])
{
count++;
}
else
{
printf("%c%d",str[i], count);
count=1;
}
}
}
  for(i=0;str[i]!='\0';i++)
  {
  
  }
}