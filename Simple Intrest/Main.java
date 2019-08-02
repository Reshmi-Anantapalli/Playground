#include<stdio.h>
int main()
{
  //your code here
  float p, r, t, si;
  scanf("%f %f %f", &p, &r, &t);
  si= (p*r*t)/100;
  printf("%0.6f", si);
  return 0;
}