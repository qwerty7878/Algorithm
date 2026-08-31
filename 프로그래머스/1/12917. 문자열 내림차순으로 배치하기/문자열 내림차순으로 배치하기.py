def solution(s):
    answer = ''
    
    temp = []
    for char in s:
        temp.append(char)
        
    answer = ''.join(sorted(temp, reverse=True))
    return answer