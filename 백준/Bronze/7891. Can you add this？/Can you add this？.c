#include<stdio.h>
int main(void){
    int T;
    scanf("%d",&T);
    long sum = 0;
    for(int i = 0; i < T; i++){
        long a,b;
        scanf("%ld%ld",&a,&b);
        sum = a + b;
        printf("%ld\n",sum);
    }
    return 0;
}