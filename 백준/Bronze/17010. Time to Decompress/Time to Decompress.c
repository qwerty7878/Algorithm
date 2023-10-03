#include<stdio.h>

int main(){
    int n;
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        int m;
        char s;
        scanf("%d %c",&m,&s);
        for(int j = 0; j < m; j++){
            printf("%c",s);
        }
        printf("\n");
    }
    return 0;
}