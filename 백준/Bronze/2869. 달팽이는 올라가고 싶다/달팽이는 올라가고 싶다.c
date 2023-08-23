#include<stdio.h>
int main(void){
    int up,down,height;
    scanf("%d%d%d",&up,&down,&height);
    
    int day = (height - down)/(up - down);
    
    if((height - down) % (up - down) != 0)
        day++;
    printf("%d\n",day);
    
    return 0;
}