#include<stdio.h>
int main(void){
    int n;
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        char name[100];
        scanf("%s",name);
        int score;
        scanf("%d",&score);
        if(score >= 97 && score <= 100)
            printf("%s A+\n",name);
        else if(score >= 90 && score <= 96)
            printf("%s A\n",name);
        else if(score >= 87 && score <= 89)
            printf("%s B+\n",name);
        else if(score >= 80 && score <= 86)
            printf("%s B\n",name);
        else if(score >= 77 && score <= 79)
            printf("%s C+\n",name);
        else if(score >= 70 && score <= 76)
            printf("%s C\n",name);
        else if(score >= 67 && score <= 69)
            printf("%s D+\n",name);
        else if(score >= 60 && score <= 66)
            printf("%s D\n",name);
        else if(score >= 0 && score <= 59)
            printf("%s F\n",name);
    }
    return 0;
}