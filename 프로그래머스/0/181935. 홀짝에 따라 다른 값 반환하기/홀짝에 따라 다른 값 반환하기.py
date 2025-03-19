def solution(n):
    if n % 2 != 0:
        answer = 0
#       홀수라면
        for i in range(1, n + 1):
#       홀수 양의 정수 합 리턴
            if i % 2 != 0:
                answer += i
        return answer
    else:
        answer = 0
        for i in range(1, n + 1):
            if i % 2 == 0:
                answer += i ** 2
        return answer
