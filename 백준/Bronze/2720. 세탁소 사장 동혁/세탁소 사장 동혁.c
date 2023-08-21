#include<stdio.h>
int main(void){
    int T,c,q,d,n,p;
    scanf("%d",&T);
    for(int i = 0; i < T; i++){
        c = 0,q = 0,d = 0,n = 0,p = 0;
        scanf("%d",&c);
        q = c/25; c -= q*25;
        d = c/10; c -= d*10;
        n = c/5; c -= n*5;
        p = c;
        printf("%d %d %d %d\n",q,d,n,p);
    }
    return 0;
}