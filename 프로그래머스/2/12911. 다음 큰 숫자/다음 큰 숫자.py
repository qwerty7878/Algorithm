def solution(n):
    answer = n + 1
    onecnt = str(bin(n))[2:].count('1')
    # print(onecnt)
    while True:
        if onecnt == str(bin(answer))[2:].count('1'):
            break
        answer += 1
    return answer