#include<stdio.h>

int gcd(int a, int b) {
    if(b == 0)
        return a;
    return gcd(b, a%b);
}

int main(void){
    int t,a,b;
    scanf("%d",&t);
    for(int i = 0; i < t; i++){
        scanf("%d%d",&a,&b);
        printf("%d\n",a*b/ gcd(a,b));
    }
}
