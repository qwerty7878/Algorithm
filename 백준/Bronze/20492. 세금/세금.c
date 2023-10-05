#include<stdio.h>
int main(void){
    long n;
    scanf("%ld",&n);
    long a = (long)(n * 0.78);
    long b = (long)((n * 0.8) + (n * 0.2 * 0.78));
    printf("%ld %ld\n",a,b);
    return 0;
}