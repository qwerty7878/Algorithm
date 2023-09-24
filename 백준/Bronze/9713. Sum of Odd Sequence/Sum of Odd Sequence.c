#include<stdio.h>
int main(void){
    int n;
    scanf("%d",&n);
    int arr[100];

    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
        int sum = 0;
        for(int j = 1; j <= arr[i]; j++){
            if(j % 2 == 1)
                sum += j;
        }
        printf("%d\n",sum);
    }
    return 0;
}