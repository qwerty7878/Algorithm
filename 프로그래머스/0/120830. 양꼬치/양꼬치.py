def solution(n, k):
    newk = k - (n // 10) 
    answer = (n * 12000) + (newk * 2000)
    return answer