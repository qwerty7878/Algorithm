#include<stdio.h>
int main (void){
    int h,m;
    scanf("%d%d",&h,&m);
    if(m>=45 && m <=59)
        printf("%d %d",h,m-45);
    else if(m < 45)
        printf("%d %d",(h+23)%24,m+60-45);
    return 0;
}