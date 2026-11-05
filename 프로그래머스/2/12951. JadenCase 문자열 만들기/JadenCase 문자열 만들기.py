def solution(s):
    answer = ''
    isFirst = True
    
    for char in s:
        if isFirst:
            answer += char.upper()
            isFirst = False
        else:
            answer += char.lower()
            
        if char == ' ':
            isFirst = True
    return answer