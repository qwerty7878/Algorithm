#include<stdio.h>
int main(void){
    int arr[3];
    int temp = 0;
    for(int i = 0; i < 3; i++){
        scanf("%d",&arr[i]);
    }
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3 - (i+1); j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    printf("%d\n", arr[1]);
    return 0;
}