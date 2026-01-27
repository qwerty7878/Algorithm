def solution(n):
    answer = 0
    arr = []
    for i in str(n):
        arr.append(int(i))
    arr.sort(reverse=True)
    temp = ""
    for num in arr:
        temp += str(num)
    answer = int(temp)
    return answer