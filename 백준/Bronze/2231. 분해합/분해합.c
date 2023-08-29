#include<stdio.h>
int main(void){
int n;
scanf("%d",&n);
int result = 0;

for(int i = 0; i < n; i++){
    int sum = 0;
    int number = i;
    
    while(number != 0){
        sum += number%10;
        number /= 10;
    }
    if(sum + i == n){
        result = i;
        break;
    }
}
    printf("%d\n",result);
    return 0;
}
