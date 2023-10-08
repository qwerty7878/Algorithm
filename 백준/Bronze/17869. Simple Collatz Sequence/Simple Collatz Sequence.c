#include<stdio.h>
int main(void){
    long n;
    scanf("%ld",&n);
    int cnt = 0;
    while(n != 1){
        if(n%2 == 0)
            n = n/2;
        else
            n = n+1;
        cnt++;
    }
    printf("%d\n",cnt);
    return 0;
}