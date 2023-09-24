#include<stdio.h>
int main(void){
    int n1,k1,n2,k2;
    int sum = 0;
    scanf("%d%d%d%d",&n1,&k1,&n2,&k2);
    sum = n1 * k1 + n2 * k2;
    printf("%d\n",sum);
    return 0;
}