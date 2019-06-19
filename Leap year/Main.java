#include<stdio.h>
int main()
{
 int leap;
  scanf("%d",&leap);
  if(leap%4==0 && (leap%400||leap%100!=0))
    printf("Leap year");
  else
     printf("Not Leap year");
    
  return 0;
}