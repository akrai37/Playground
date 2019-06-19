#include<stdio.h>
int main()
{
  int num, value,second;
  scanf("%d",&num);
  
  value=num/10;
  second=value%10;
  
  printf("%d",second);
  return 0;
}