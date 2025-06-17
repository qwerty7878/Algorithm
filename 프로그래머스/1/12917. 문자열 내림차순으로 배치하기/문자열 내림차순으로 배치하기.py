def solution(s):
    answer = ''
    arr = []
    for i in s:
        arr.append(i)
    arr.sort(reverse=True)
    
    for i in arr:
        answer += i
    return answer