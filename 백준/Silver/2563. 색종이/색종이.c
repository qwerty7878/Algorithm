#include<stdio.h>
int arr[100][100];
int main(void){
    int Cpaper;
    scanf("%d",&Cpaper);
    int x,y;
    int cnt = 0;
    for(int i = 0; i < Cpaper; i++){
        scanf("%d%d",&x,&y);
        
        for(int j = x; j < x+10; j++){
            for(int k = y; k < y + 10; k++){
                arr[j][k] = 1;
            }
        }
    }
    for(int i = 0; i < 100; i++){
        for(int j = 0; j < 100; j++){
            if(arr[i][j] == 1)
                cnt++;
        }
    }
    printf("%d",cnt);
    return 0;
}