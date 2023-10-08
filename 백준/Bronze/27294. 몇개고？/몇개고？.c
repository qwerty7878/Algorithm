#include<stdio.h>
int main(void){
    int a,b;
    scanf("%d%d",&a,&b);
    if(a >= 12 & a <= 16)
        if(b == 0)
            printf("320\n");
        else
            printf("280\n");
    else
        printf("280\n");
    return 0;
}