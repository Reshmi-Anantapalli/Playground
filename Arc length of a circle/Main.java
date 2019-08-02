#include <stdio.h>
int main()
{
float r, arc, angle;
  scanf("%f", &r);
  scanf("%f", &angle);
  arc= (angle/360) * 2 * 3.14 * r;
  printf("%.2f",arc);
  return(0);
  
}