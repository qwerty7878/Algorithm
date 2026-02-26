def solution(s):
    answer = ''
    s = s.lower()
    # print(s)
    idx = 0
    for char in s:
        if char == ' ':
            answer += char
            idx = 0
        elif idx == 0:
            if char.isdigit():
                answer += char
                idx += 1
            else:
                char = char.upper()
                answer += char
                idx += 1
        else:
            answer += char    
    return answer