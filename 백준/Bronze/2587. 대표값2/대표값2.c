#include<stdio.h>
int main(void){
    int arr[5];
    int sum = 0;
    int temp;
    int min;
    
    for(int i = 0; i < 5; i++){
        scanf("%d",&arr[i]);
        sum += arr[i];
    }
    for(int i = 0; i < 5; i++){
        min = i;
        for(int j = i + 1; j < 5; j++){
            if(arr[j] < arr[min])
                min = j;
        }
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    printf("%d\n",sum/5);
    printf("%d\n",arr[2]);
    return 0;
}