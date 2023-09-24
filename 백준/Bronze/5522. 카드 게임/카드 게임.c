#include<stdio.h>
int main(void){
    int sum = 0;
    for(int i = 1; i <= 5; i++){
        int n;
        scanf("%d",&n);
        sum += n;
    }
    printf("%d\n",sum);
    return 0;     
}