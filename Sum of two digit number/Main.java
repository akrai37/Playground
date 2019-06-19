#include<stdio.h>
int main()
{
  int sum,first,second,num;
  scanf("%d",&num);
  first=num/10;
  second=num%10;
  sum=first+second;
  printf("%d",sum);
  return 0;
}