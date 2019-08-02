#include<stdio.h>
int main()
{
  //Type your code here
  int num1, num2;
  scanf("%d %d", &num1, &num2);
  if(num1>num2)
  {
  printf("num1 is the greatest", num1);
  }
  else if (num1<num2)
  {
  printf("num2 is the greatest", num2);
  }
    else
    {
    printf("Both numbers are equal");
    }
  return 0;
}