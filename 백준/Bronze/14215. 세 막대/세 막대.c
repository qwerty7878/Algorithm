#include <stdio.h>
int main(void){
    int a,b,c;
    int max = 0;
    scanf("%d%d%d",&a,&b,&c);
    if(a>b){
        if(b>c)
            max = a;
        else{
            if(a>c)
                max = a;
            else
                max = c;
        }
    }
    else{
        if(b>c)
            max = b;
        else
            max = c;
    }
    
    if(a+b+c-max > max)
        printf("%d\n",a+b+c);
    else
        printf("%d\n",(a+b+c-max)*2-1);
    
    return 0;
}