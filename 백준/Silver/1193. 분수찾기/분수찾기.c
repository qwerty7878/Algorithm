#include<stdio.h>
int main(void){
    int x;
    int n = 0;
    int top,bot = 1;
    int cnt = 0;
    scanf("%d",&x);
    while(cnt < x){
        n++;
        cnt = n*(n+1)/2;
    }
    int num = x - (n-1)*n/2;
    if(n%2 == 0){
        top = num;
        bot = n - num + 1;
    }
    else{
        top = n - num + 1;
        bot = num;
    }
    if(x == 1)
        printf("1/1\n");
    else
        printf("%d/%d\n",top,bot);
    return 0;
} 