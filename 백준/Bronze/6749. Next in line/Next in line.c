#include<stdio.h>
int main(void){
    int a,b;
    scanf("%d%d",&a,&b);
    int diff = 0;
    if(a < b){
        diff = b - a;
        int c = b + diff;
        printf("%d\n",c);
    }
    else{
        diff = a - b;
        int c = a + diff;
        printf("%d\n",c);
    }
    return 0;
}