#include<stdio.h>
int main(void){
    int n;
    int result = 0;
    for(int i = 0; i < 6; i++){
        scanf("%d",&n);
        result += n;
    }
    printf("%d",result*5);
    return 0;
}