#include<stdio.h>
#include<math.h>
int main(void){
    int t;
    scanf("%d",&t);
    for(int i = 0; i < t; i++){
        long n;
        scanf("%ld",&n);
        long k = pow(n,2);
        printf("%ld\n",k);
    }
    return 0;
}