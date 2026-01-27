def solution(n):
    answer = 0
    temp = []
    for s in str(n):
        temp.append(s)
    temp.sort(reverse=True)
    st = ""
    for num in temp:
        st += num
    answer = int(st)
    return answer