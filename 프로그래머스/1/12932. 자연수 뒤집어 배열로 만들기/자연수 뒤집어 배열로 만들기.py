def solution(n):
    answer = []
    Str = str(n)[::-1]
    print(Str)
    for i in Str:
        answer.append(int(i))
    return answer