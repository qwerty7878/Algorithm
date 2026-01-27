def solution(s):
    answer = ''
    answer = list(s)
    answer.sort(reverse=True)
    ans = ''.join(answer)
    return ans