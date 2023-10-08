#include<stdio.h>
int main(void){
    int n;
    scanf("%d",&n);
    int arr[n];
    int max = 0;
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
        if(max < arr[i])
            max = arr[i];
    }
    if(arr[0] >= max)
        printf("S\n");
    else
        printf("N\n");
    return 0;
}