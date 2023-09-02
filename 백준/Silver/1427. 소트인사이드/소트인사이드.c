#include<stdio.h>
int main(void){
    char arr[100];
    char temp;
    scanf("%s",arr);
    
    for(int i = 0; i < strlen(arr); i++){
        for(int j = 0; j < strlen(arr); j++){
            if(arr[j] < arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    printf("%s",arr);
    return 0;
}