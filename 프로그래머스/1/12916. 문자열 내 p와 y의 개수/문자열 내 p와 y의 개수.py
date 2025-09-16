def solution(s):
    answer = False
    ss = s.lower()
    p = ss.count('p')
    q = ss.count('y')
    if p == q:
        answer = True
    return answer