#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numer1, int denom1, int numer2, int denom2) {
    int* answer = (int*)malloc(1);
    int denom = denom1 * denom2;
    int numer = (numer1 * denom2) + (numer2 * denom1);
    int gcd = 1;
    for(int i = 1; i <= numer || i <= denom; i++){
        if(numer % i == 0 && denom % i == 0){
            gcd= i;
        }
    }
    answer[0] = numer/gcd;
    answer[1] = denom/gcd;
    return answer;
}