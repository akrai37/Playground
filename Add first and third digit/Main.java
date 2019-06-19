#include<stdio.h>
int main()
{
  int sum,num,first,third;
  scanf("%d",&num);
  first=num/100;
  third=num%10;
  sum=first+third;
  printf("%d",sum);
  return 0;
}