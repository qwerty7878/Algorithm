#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n) {
    int* answer = (int*)malloc((n+1)/2 * sizeof(int));
    
    for(int i = 1; i <= n; i++){
        if(i%2 == 1)
            answer[i/2] = i;
    }
    return answer;
}