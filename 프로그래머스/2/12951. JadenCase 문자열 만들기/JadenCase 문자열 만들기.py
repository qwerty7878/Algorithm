def solution(s):
    answer = ''
    
    isFirst = True
    for char in s.lower():
        if char == ' ':
            isFirst = True
            answer += char
        else:
            if isFirst:
                answer += char.upper()
                isFirst = False
            else:
                answer += char
    return answer