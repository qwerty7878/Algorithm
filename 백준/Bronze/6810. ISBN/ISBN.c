#include<stdio.h>
int main(void){
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    int sum = 9 + 7 * 3 + 8 + 0 * 3 + 9 + 2 * 3 + 1 + 4 * 3 + 1 + 8 * 3;
    sum += a + b * 3 + c;
    printf("The 1-3-sum is %d\n",sum); 
    return 0;
}