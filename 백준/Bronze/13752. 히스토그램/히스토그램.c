#include<stdio.h>
int main(void){
    int n;
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        int k;
        scanf("%d",&k);
        for(int j = 0; j < k; j++){
            printf("=");
        }
        printf("\n");
    }
    return 0;
}