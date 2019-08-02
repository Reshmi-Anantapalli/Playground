#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float s1, s2, h;
  scanf("%f", &s1);
  scanf("%f", &s2);
  h = sqrt(((s1 * s1) + (s2 * s2)));
  printf("%.2f", h);
  return 0;
}