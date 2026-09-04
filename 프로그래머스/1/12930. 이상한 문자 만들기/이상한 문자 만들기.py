def solution(s):
    answer = ''
    
    idx = 0
    for char in s:
        if char == ' ':
            answer += char
            idx = 0
        else:
            if idx % 2 == 0:
                answer += char.upper()
            else:
                answer += char.lower()
            idx += 1
    return answer