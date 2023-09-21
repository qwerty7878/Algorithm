#include<stdio.h>
int main(void){
    int temp = 0;
    int arr[1000000];
    for(int i = 0; i < 3; i++){
        scanf("%d",&arr[i]);
    }
    for(int i = 0; i < 3; i++){
        for(int j = 0;  j < 2; j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for(int i = 0; i < 3; i++){
        printf("%d ",arr[i]);
    }
    return 0;
}