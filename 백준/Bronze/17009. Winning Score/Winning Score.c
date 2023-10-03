#include<stdio.h>

int main(){
    int arr[6];
    int a = 0;
    int b = 0;
    for(int i = 0; i < 6; i++){
        scanf("%d",&arr[i]);
        a = arr[0]*3 + arr[1]*2 + arr[2];
        b = arr[3]*3 + arr[4]*2 + arr[5];
    }
    if(a > b)
        printf("A");
    else if(a < b)
        printf("B");
    else if(a == b)
        printf("T");
    
    return 0;
}