#include<stdio.h>

int main(void){
    int n,num;
    scanf("%d",&n);
    int arr[10001] = {0,};
    for(int i = 0; i < n; i++){
        scanf("%d",&num);
        arr[num] = arr[num] + 1;
    }
    for(int i = 1; i < 10001; i++){
        for(int j = 1; j <= arr[i]; j++){
            printf("%d\n",i);
        }
    }
    return 0;
}