#include<stdio.h>
#include<string.h>
int main(void){
    int n;
    scanf("%d",&n);
    char s[100005];
    scanf("%s",s);

    int cnt2 = 0;
    int cnte = 0;

    for(int i = 0; i < n; i++){
        if(s[i] == 'e')
            cnte++;
        else if(s[i] == '2')
            cnt2++;
    }
    if(cnte > cnt2)
        printf("e");
    else if(cnte < cnt2)
        printf("2");
    else
        printf("yee");

    return 0;
}