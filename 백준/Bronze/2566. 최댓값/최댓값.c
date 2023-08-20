#include<stdio.h>
int main(void){
    int arr;
    int max = 0;
    int x = 0;
    int y = 0;
    
    for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9; j++){
            scanf("%d",&arr);
            if(max < arr){
                max = arr;
                x = i;
                y = j;
            }
        }
    }
    printf("%d\n",max);
    printf("%d %d\n",x+1,y+1);
    
    return 0;
}