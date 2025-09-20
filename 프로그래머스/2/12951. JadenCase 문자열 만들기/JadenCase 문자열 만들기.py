def solution(s):
    answer = []
    arr = s.split(' ')
    for i in range(len(arr)):
        if arr[i] == '':
            answer.append(arr[i])
        else:
            answer.append(arr[i][0].upper() + arr[i][1:].lower())
    return ' '.join(answer)