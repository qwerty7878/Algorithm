#include<stdio.h>
int main(void){
    int cnt = 1;
    while(1){
        int n;
        scanf("%d",&n);
        if(n == 0)
            break;
        if(n%2 == 0){
            n = (((n*3)/2)*3)/9;
            printf("%d. even %d\n",cnt,n);
        }
        else{
            n = ((((n*3)+1)/2)*3)/9;
            printf("%d. odd %d\n",cnt,n);
        }
        cnt++;
    }
        return 0;
    }