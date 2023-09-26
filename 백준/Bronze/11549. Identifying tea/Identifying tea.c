#include<stdio.h>
int main(void){
    int n;
    int cnt = 0;
    scanf("%d",&n);
    for(int i = 0; i < 5; i++){
        int T;
        scanf("%d",&T);
        if(n == T)
            cnt++;
    }
    printf("%d\n",cnt);
    return 0;
}