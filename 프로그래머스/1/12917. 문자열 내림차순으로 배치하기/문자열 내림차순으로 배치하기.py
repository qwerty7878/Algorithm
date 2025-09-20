def solution(s):
    answer = ''
    temp = []
    for i in s:
        temp.append(i)
    print(temp)
    temp.sort(reverse=True)
    print(temp)
    answer = ''.join(temp)
    return answer