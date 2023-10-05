#include<stdio.h>

int main(){
    int s,k,h;
    scanf("%d%d%d",&s,&k,&h);
    int sum = s + k + h;
    if(sum >= 100)
        printf("OK\n");
    else{
        if(s < k && s < h){
            printf("Soongsil\n");
        }
        else if(k < s && k < h){
            printf("Korea\n");
        }
        else if(h < s && h < k){
            printf("Hanyang\n");
        }
    }
    return 0;
}