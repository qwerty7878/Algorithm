#include<stdio.h>
int main(void){
    int a;
    int b;
    int c;
    scanf("%d%d%d",&a,&b,&c);
    int m = (c + b + (a*60))%60;
    int h = (c + b + (a*60))/60%24;
    printf("%d %d\n",h,m);
    return 0;
}