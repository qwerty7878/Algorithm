#include<stdio.h>
int main(void){
    int n,m;
    scanf("%d%d",&n,&m);
    int sum, temp = 0;
    int arr[100] = {0,};
    
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            for(int k = j + 1; k < n; k++){
                sum = arr[i] + arr[j] + arr[k];
                if(temp < sum && sum <= m)
                    temp = sum;
            }
        }
    }
    printf("%d\n",temp);
    return 0;
}