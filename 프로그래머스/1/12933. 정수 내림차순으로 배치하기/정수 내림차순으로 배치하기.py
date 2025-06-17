def solution(n):
    answer = 0
    arr = []
    s = str(n)
    for i in s:
        arr.append(i)
    arr.sort(reverse=True)
    print(arr)
    
    temp = ''
    for i in arr:
        temp += i
    print(temp)
    
    answer = int(temp)
    return answer