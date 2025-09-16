def solution(n):
    answer = 0
    arr = []
    for i in str(n):
        arr.append(int(i))
    arr.sort(reverse=True)
    for i in range(len(arr)):
        answer += max(arr) * (10 ** (len(arr) -1))
        arr.remove(max(arr))
    return answer