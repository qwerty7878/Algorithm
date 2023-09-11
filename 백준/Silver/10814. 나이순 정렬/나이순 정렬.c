#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct {
    char name[201];
    int age;
}Member;
Member arr[100001];
int main(void){
    int n;
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d %s",&arr[i].age, arr[i].name);
    }
    for(int i = 0; i <= 200; i++){
        for(int j = 0; j < n; j++){
            if(i == arr[j].age)
                printf("%d %s\n",arr[j].age,arr[j].name);
        }
    }
    return 0;
}