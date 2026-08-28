def solution(n):
    temp = []
    for num in str(n):
        temp.append(int(num))
        
    return int(''.join(sorted(map(str, temp), reverse=True)))