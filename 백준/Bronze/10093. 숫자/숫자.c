#include<stdio.h>
int main(void){
    long a,b;
    scanf("%ld%ld",&a,&b);

    if(a < b){
        printf("%ld\n",b-a-1);
        for(long i = a+1; i < b; i++){
            printf("%ld ",i);
        }
    }
    else if(a > b){
        printf("%ld\n",a-b-1);
        for(long i = b+1; i < a; i++){
            printf("%ld ",i);
        }
    }
    else
        printf("0");

    return 0;
}